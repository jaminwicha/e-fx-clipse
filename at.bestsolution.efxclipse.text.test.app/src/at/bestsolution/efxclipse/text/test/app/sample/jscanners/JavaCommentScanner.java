/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Michel Ishizuka <cqw10305@nifty.com> - Bug 113266 [syntax highlighting] javadoc tag names including period is not highlighting correctly
 *******************************************************************************/
package at.bestsolution.efxclipse.text.test.app.sample.jscanners;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.text.jface.rules.IRule;
import at.bestsolution.efxclipse.text.jface.rules.IWordDetector;
import at.bestsolution.efxclipse.text.jface.rules.Token;
import at.bestsolution.efxclipse.text.test.app.sample.jscanners.CombinedWordRule.WordMatcher;

/**
 * Java comment scanner.
 */
public class JavaCommentScanner extends AbstractJavaScanner{

	private static class AtJavaIdentifierDetector implements IWordDetector {

		public boolean isWordStart(char c) {
			return c == '@' || Character.isJavaIdentifierStart(c);
		}

		public boolean isWordPart(char c) {
			return c == '.' || Character.isJavaIdentifierPart(c);
		}
	}

//	private class TaskTagMatcher extends CombinedWordRule.WordMatcher {
//
//		private IToken fToken;
//		/**
//		 * Uppercase words
//		 * @since 3.0
//		 */
//		private Map<CombinedWordRule.CharacterBuffer,IToken> fUppercaseWords= new HashMap<CombinedWordRule.CharacterBuffer,IToken>();
//		/**
//		 * <code>true</code> if task tag detection is case-sensitive.
//		 * @since 3.0
//		 */
//		private boolean fCaseSensitive= true;
//		/**
//		 * Buffer for uppercase word
//		 * @since 3.0
//		 */
//		private CombinedWordRule.CharacterBuffer fBuffer= new CombinedWordRule.CharacterBuffer(16);
//
//		public TaskTagMatcher(IToken token) {
//			fToken= token;
//		}
//
//		/*
//		 * @see org.eclipse.jdt.internal.ui.text.CombinedWordRule.WordMatcher#clearWords()
//		 * @since 3.0
//		 */
//		public synchronized void clearWords() {
//			super.clearWords();
//			fUppercaseWords.clear();
//		}
//
//		public synchronized void addTaskTags(String value) {
//			String[] tasks= split(value, ","); //$NON-NLS-1$
//			for (int i= 0; i < tasks.length; i++) {
//				if (tasks[i].length() > 0) {
//					addWord(tasks[i], fToken);
//				}
//			}
//		}
//
//		private String[] split(String value, String delimiters) {
//			StringTokenizer tokenizer= new StringTokenizer(value, delimiters);
//			int size= tokenizer.countTokens();
//			String[] tokens= new String[size];
//			int i= 0;
//			while (i < size)
//				tokens[i++]= tokenizer.nextToken();
//			return tokens;
//		}
//
//		/*
//		 * @see org.eclipse.jdt.internal.ui.text.CombinedWordRule.WordMatcher#addWord(java.lang.String, org.eclipse.jface.text.rules.IToken)
//		 * @since 3.0
//		 */
//		public synchronized void addWord(String word, IToken token) {
//			super.addWord(word, token);
//			fUppercaseWords.put(new CombinedWordRule.CharacterBuffer(word.toUpperCase()), token);
//		}
//
//		/*
//		 * @see org.eclipse.jdt.internal.ui.text.CombinedWordRule.WordMatcher#evaluate(org.eclipse.jface.text.rules.ICharacterScanner, org.eclipse.jdt.internal.ui.text.CombinedWordRule.CharacterBuffer)
//		 * @since 3.0
//		 */
//		public synchronized IToken evaluate(ICharacterScanner scanner, CombinedWordRule.CharacterBuffer word) {
//			if (fCaseSensitive)
//				return super.evaluate(scanner, word);
//
//			fBuffer.clear();
//			for (int i= 0, n= word.length(); i < n; i++)
//				fBuffer.append(Character.toUpperCase(word.charAt(i)));
//
//			IToken token= (IToken) fUppercaseWords.get(fBuffer);
//			if (token != null)
//				return token;
//			return Token.UNDEFINED;
//		}
//
//		/**
//		 * Enables/disables the case-sensitivity of the task tag detection.
//		 *
//		 * @param caseSensitive <code>true</code> iff case-sensitivity should be enabled
//		 * @since 3.0
//		 */
//		public void setCaseSensitive(boolean caseSensitive) {
//			fCaseSensitive= caseSensitive;
//		}
//	}

//	private static final String COMPILER_TASK_TAGS = JavaCore.COMPILER_TASK_TAGS;
//	protected static final String TASK_TAG = IJavaColorConstants.TASK_TAG;
//	/**
//	 * Preference key of a string preference, specifying if task tag detection is case-sensitive.
//	 * @since 3.0
//	 */
//	private static final String COMPILER_TASK_CASE_SENSITIVE= JavaCore.COMPILER_TASK_CASE_SENSITIVE;
//	/**
//	 * Preference value of enabled preferences.
//	 * @since 3.0
//	 */
//	private static final String ENABLED= JavaCore.ENABLED;

//	private TaskTagMatcher fTaskTagMatcher;
	private String fDefaultTokenProperty;
	private String[] fTokenProperties;

	public JavaCommentScanner(TextAttributesManager colorManager, String defaultTokenProperty) {
		this(colorManager, defaultTokenProperty, new String[] { defaultTokenProperty/*, TASK_TAG*/ });
	}

	public JavaCommentScanner(TextAttributesManager colorManager,String defaultTokenProperty, String[] tokenProperties) {
		super(colorManager);

		fDefaultTokenProperty= defaultTokenProperty;
		fTokenProperties= tokenProperties;

		initialize();
	}

	/*
	 * @see AbstractJavaScanner#createRules()
	 */
	protected List<IRule> createRules() {
		List<IRule> list= new ArrayList<IRule>();
		Token defaultToken= getToken(fDefaultTokenProperty);

		List<WordMatcher> matchers= createMatchers();
		if (matchers.size() > 0) {
			CombinedWordRule combinedWordRule= new CombinedWordRule(new AtJavaIdentifierDetector(), defaultToken);
			for (int i= 0, n= matchers.size(); i < n; i++)
				combinedWordRule.addWordMatcher((WordMatcher) matchers.get(i));
			list.add(combinedWordRule);
		}

		setDefaultReturnToken(defaultToken);

		return list;
	}

	/**
	 * Creates a list of word matchers.
	 *
	 * @return the list of word matchers
	 */
	protected List<WordMatcher> createMatchers() {
		List<WordMatcher> list= new ArrayList<WordMatcher>();

//		// Add rule for Task Tags.
//		boolean isCaseSensitive= true;
//		String tasks= null;
//		if (getPreferenceStore().contains(COMPILER_TASK_TAGS)) {
//			tasks= getPreferenceStore().getString(COMPILER_TASK_TAGS);
//			isCaseSensitive= ENABLED.equals(getPreferenceStore().getString(COMPILER_TASK_CASE_SENSITIVE));
//		}
//		if (tasks != null) {
//			fTaskTagMatcher= new TaskTagMatcher(getToken(TASK_TAG));
//			fTaskTagMatcher.addTaskTags(tasks);
//			fTaskTagMatcher.setCaseSensitive(isCaseSensitive);
//			list.add(fTaskTagMatcher);
//		}

		return list;
	}

//	/*
//	 * @see org.eclipse.jdt.internal.ui.text.AbstractJavaScanner#affectsBehavior(org.eclipse.jface.util.PropertyChangeEvent)
//	 */
//	public boolean affectsBehavior(PropertyChangeEvent event) {
//		return event.getProperty().equals(COMPILER_TASK_TAGS) || event.getProperty().equals(COMPILER_TASK_CASE_SENSITIVE) || super.affectsBehavior(event);
//	}

//	/*
//	 * @see org.eclipse.jdt.internal.ui.text.AbstractJavaScanner#adaptToPreferenceChange(org.eclipse.jface.util.PropertyChangeEvent)
//	 */
//	public void adaptToPreferenceChange(PropertyChangeEvent event) {
//		if (fTaskTagMatcher != null && event.getProperty().equals(COMPILER_TASK_TAGS)) {
//			Object value= event.getNewValue();
//			if (value instanceof String) {
//				synchronized (fTaskTagMatcher) {
//					fTaskTagMatcher.clearWords();
//					fTaskTagMatcher.addTaskTags((String) value);
//				}
//			}
//		} else if (fTaskTagMatcher != null && event.getProperty().equals(COMPILER_TASK_CASE_SENSITIVE)) {
//			Object value= event.getNewValue();
//			if (value instanceof String)
//				fTaskTagMatcher.setCaseSensitive(ENABLED.equals(value));
//		} else if (super.affectsBehavior(event))
//			super.adaptToPreferenceChange(event);
//	}

	/*
	 * @see org.eclipse.jdt.internal.ui.text.AbstractJavaScanner#getTokenProperties()
	 */
	protected String[] getTokenProperties() {
		return fTokenProperties;
	}

}