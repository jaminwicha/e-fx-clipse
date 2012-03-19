/**
 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#isPreview <em>Preview</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Preview</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preview</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preview</em>' attribute.
   * @see #setPreview(boolean)
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getProperty_Preview()
   * @model
   * @generated
   */
  boolean isPreview();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#isPreview <em>Preview</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preview</em>' attribute.
   * @see #isPreview()
   * @generated
   */
  void setPreview(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ValueProperty)
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getProperty_Value()
   * @model containment="true"
   * @generated
   */
  ValueProperty getValue();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueProperty value);

} // Property
