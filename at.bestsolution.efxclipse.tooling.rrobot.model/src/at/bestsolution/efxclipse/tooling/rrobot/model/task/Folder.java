/**
 */
package at.bestsolution.efxclipse.tooling.rrobot.model.task;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Folder#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends Resource {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.tooling.rrobot.model.task.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.tooling.rrobot.model.task.TaskPackage#getFolder_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getChildren();

} // Folder
