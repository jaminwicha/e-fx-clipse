/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates


import at.bestsolution.efxclipse.tooling.ui.wizards.template.JDTElement
import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator

class PreloaderClassGenerator implements IGenerator<JDTElement> {
	override generateContent(JDTElement clazzDef) '''
		«IF(clazzDef.packageFragment != null && ! clazzDef.packageFragment.elementName.empty)»package «clazzDef.packageFragment.elementName»;«ENDIF»
		
		import javafx.application.Preloader;
		import javafx.stage.Stage;
		
		public class «clazzDef.name» extends Preloader {
			
			public void start(Stage primaryStage) throws Exception {
				
			}
		}
	'''
}