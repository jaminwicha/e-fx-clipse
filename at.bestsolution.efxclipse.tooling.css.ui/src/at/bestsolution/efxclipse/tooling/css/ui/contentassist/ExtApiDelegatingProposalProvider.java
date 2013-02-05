/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css.ui.contentassist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal.IReplacementTextApplier;
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslFactory;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssTok;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;
import at.bestsolution.efxclipse.tooling.css.extapi.CssExt;
import at.bestsolution.efxclipse.tooling.css.extapi.Proposal;
import at.bestsolution.efxclipse.tooling.css.extapi.Proposal.Type;

import com.google.inject.Inject;


/**
 * @author ccaks
 *
 */
public class ExtApiDelegatingProposalProvider extends AbstractCssDslProposalProvider {

	@Inject
	private CssExt cssExt;
	
	@Inject
	private DispatchingEObjectTextHover hoverDispatcher;
	
	@Inject
	private ILabelProvider labelProvider;
	
	
	private void acceptProposals(List<Proposal> proposals, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		for (Proposal p : proposals) {
			
			Image img = labelProvider.getImage(CssDslFactory.eINSTANCE.createcss_property());
			
			ConfigurableCompletionProposal cp = (ConfigurableCompletionProposal) createCompletionProposal(p.getProposal(), p.getLabel(), img, context);
			
			if (cp != null) {
				cp.setAdditionalProposalInfo(p.getAdditionalInfo());
				cp.setHover(hoverDispatcher);
				
				cp.setTriggerCharacters(new char[] { ' ' });
				
				if (p.getType() == Type.Property) {
					// add ": " to proposal
					cp.setTextApplier(new IReplacementTextApplier() {
						
						@Override
						public void apply(IDocument document, ConfigurableCompletionProposal proposal) throws BadLocationException {
							document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), proposal.getReplacementString() + ": ");
							proposal.setCursorPosition(proposal.getCursorPosition()+2);
						}
					});
				}
				if (p.getType() == Type.Value) {
					
				}
				
				acceptor.accept(cp);
			}
		}
	}
	
	
	
	private List<CssTok> findPrefixTokens(ContentAssistContext context) {
		List<CssTok> prefixToks = new ArrayList<CssTok>();
		if (context.getLastCompleteNode().getSemanticElement() instanceof CssTok) {
			CssTok currentTok = (CssTok) context.getLastCompleteNode().getSemanticElement();
			for (CssTok tok : ((css_declaration)context.getLastCompleteNode().getSemanticElement().eContainer()).getValueTokens()) {
				if (tok == currentTok) break;
				prefixToks.add(tok);
			}
			
			// TEST 
			prefixToks.add(currentTok);
		}
		return prefixToks;
	}
	
	private List<selector> findSelectors(css_declaration decl) {
		if (decl.eContainer() instanceof ruleset) {
			return ((ruleset)decl.eContainer()).getSelectors();
		}
		return Collections.emptyList();
	}
	
	
	public void complete_CssTok(css_declaration model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		final List<Proposal> proposals = cssExt.getValueProposalsForProperty(findSelectors(model), model.getProperty(), findPrefixTokens(context), context.getPrefix());
		acceptProposals(proposals, context, acceptor);
	}
	
	public void completeRuleset_Declarations(ruleset model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		final List<Proposal> proposals = cssExt.getPropertyProposalsForSelector(model.getSelectors());
		acceptProposals(proposals, context, acceptor);
	}
	
	// known issue
	// for some reason autocompletion for the last property in a ruleset ends up here
	// for now i try to get the current model, but in case we fail i return the full list
	public void completeRuleset_Declarations(stylesheet model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		
		if (context.getPreviousModel() instanceof ruleset) {
			ruleset ruleset = (ruleset) context.getPreviousModel();
			final List<Proposal> proposals = cssExt.getPropertyProposalsForSelector(ruleset.getSelectors());
			acceptProposals(proposals, context, acceptor);
		}
		else {
			final List<Proposal> proposals = cssExt.getPropertyProposalsForSelector(null);
			acceptProposals(proposals, context, acceptor);
		}
	}
	
	
	@Override
	public void completeKeyword(Keyword keyword,
			ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		return;
	}
	
}