/**
 */
package at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl;

import at.bestsolution.efxclipse.tooling.decora.decoraDsl.DecoraDslPackage;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.declaration_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.expression_statement;
import at.bestsolution.efxclipse.tooling.decora.decoraDsl.for_init_statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>for init statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.for_init_statementImpl#getE <em>E</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.decora.decoraDsl.impl.for_init_statementImpl#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class for_init_statementImpl extends MinimalEObjectImpl.Container implements for_init_statement
{
  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected expression_statement e;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected declaration_statement d;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected for_init_statementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DecoraDslPackage.Literals.FOR_INIT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_statement getE()
  {
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetE(expression_statement newE, NotificationChain msgs)
  {
    expression_statement oldE = e;
    e = newE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FOR_INIT_STATEMENT__E, oldE, newE);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setE(expression_statement newE)
  {
    if (newE != e)
    {
      NotificationChain msgs = null;
      if (e != null)
        msgs = ((InternalEObject)e).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FOR_INIT_STATEMENT__E, null, msgs);
      if (newE != null)
        msgs = ((InternalEObject)newE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FOR_INIT_STATEMENT__E, null, msgs);
      msgs = basicSetE(newE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FOR_INIT_STATEMENT__E, newE, newE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_statement getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetD(declaration_statement newD, NotificationChain msgs)
  {
    declaration_statement oldD = d;
    d = newD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FOR_INIT_STATEMENT__D, oldD, newD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(declaration_statement newD)
  {
    if (newD != d)
    {
      NotificationChain msgs = null;
      if (d != null)
        msgs = ((InternalEObject)d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FOR_INIT_STATEMENT__D, null, msgs);
      if (newD != null)
        msgs = ((InternalEObject)newD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecoraDslPackage.FOR_INIT_STATEMENT__D, null, msgs);
      msgs = basicSetD(newD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DecoraDslPackage.FOR_INIT_STATEMENT__D, newD, newD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DecoraDslPackage.FOR_INIT_STATEMENT__E:
        return basicSetE(null, msgs);
      case DecoraDslPackage.FOR_INIT_STATEMENT__D:
        return basicSetD(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DecoraDslPackage.FOR_INIT_STATEMENT__E:
        return getE();
      case DecoraDslPackage.FOR_INIT_STATEMENT__D:
        return getD();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DecoraDslPackage.FOR_INIT_STATEMENT__E:
        setE((expression_statement)newValue);
        return;
      case DecoraDslPackage.FOR_INIT_STATEMENT__D:
        setD((declaration_statement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DecoraDslPackage.FOR_INIT_STATEMENT__E:
        setE((expression_statement)null);
        return;
      case DecoraDslPackage.FOR_INIT_STATEMENT__D:
        setD((declaration_statement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DecoraDslPackage.FOR_INIT_STATEMENT__E:
        return e != null;
      case DecoraDslPackage.FOR_INIT_STATEMENT__D:
        return d != null;
    }
    return super.eIsSet(featureID);
  }

} //for_init_statementImpl
