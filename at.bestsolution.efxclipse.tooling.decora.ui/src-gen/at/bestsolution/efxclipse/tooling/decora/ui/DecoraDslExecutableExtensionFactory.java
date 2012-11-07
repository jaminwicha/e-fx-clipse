/*
 * generated by Xtext
 */
package at.bestsolution.efxclipse.tooling.decora.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import at.bestsolution.efxclipse.tooling.decora.ui.internal.DecoraDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DecoraDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DecoraDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DecoraDslActivator.getInstance().getInjector(DecoraDslActivator.AT_BESTSOLUTION_EFXCLIPSE_TOOLING_DECORA_DECORADSL);
	}
	
}
