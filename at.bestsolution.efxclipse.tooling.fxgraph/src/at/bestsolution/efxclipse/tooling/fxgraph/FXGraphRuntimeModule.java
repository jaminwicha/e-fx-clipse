/*
 * generated by Xtext
 */
package at.bestsolution.efxclipse.tooling.fxgraph;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class FXGraphRuntimeModule extends at.bestsolution.efxclipse.tooling.fxgraph.AbstractFXGraphRuntimeModule {
	// contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return at.bestsolution.efxclipse.tooling.fxgraph.generator.FXGraphGenerator.class;
	}
}
