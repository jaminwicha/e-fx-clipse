/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package at.bestsolution.efxclipse.ecp;

import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecp.core.ECPRepository;

@SuppressWarnings("restriction")
public class ProjectExplorerPart {
	
	ECPRepository repository;

	@Inject
	public ProjectExplorerPart(BorderPane parent, final MApplication application) {
		
		ListView<Object> listView = new ListView<>();

		parent.setCenter(listView);

	}

}