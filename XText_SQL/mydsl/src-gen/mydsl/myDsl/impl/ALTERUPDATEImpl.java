/**
 * generated by Xtext 2.23.0
 */
package mydsl.myDsl.impl;

import java.util.Collection;

import mydsl.myDsl.ALTERUPDATE;
import mydsl.myDsl.CD;
import mydsl.myDsl.MyDslPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ALTERUPDATE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mydsl.myDsl.impl.ALTERUPDATEImpl#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALTERUPDATEImpl extends MinimalEObjectImpl.Container implements ALTERUPDATE
{
  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected EList<CD> column;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALTERUPDATEImpl()
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
    return MyDslPackage.Literals.ALTERUPDATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CD> getColumn()
  {
    if (column == null)
    {
      column = new EObjectResolvingEList<CD>(CD.class, this, MyDslPackage.ALTERUPDATE__COLUMN);
    }
    return column;
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
      case MyDslPackage.ALTERUPDATE__COLUMN:
        return getColumn();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ALTERUPDATE__COLUMN:
        getColumn().clear();
        getColumn().addAll((Collection<? extends CD>)newValue);
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
      case MyDslPackage.ALTERUPDATE__COLUMN:
        getColumn().clear();
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
      case MyDslPackage.ALTERUPDATE__COLUMN:
        return column != null && !column.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ALTERUPDATEImpl
