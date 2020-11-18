/**
 * generated by Xtext 2.23.0
 */
package mydsl.myDsl.impl;

import java.util.Collection;

import mydsl.myDsl.DROPTABLE;
import mydsl.myDsl.MyDslPackage;
import mydsl.myDsl.TableName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DROPTABLE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mydsl.myDsl.impl.DROPTABLEImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DROPTABLEImpl extends ElementImpl implements DROPTABLE
{
  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected EList<TableName> table;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DROPTABLEImpl()
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
    return MyDslPackage.Literals.DROPTABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TableName> getTable()
  {
    if (table == null)
    {
      table = new EObjectResolvingEList<TableName>(TableName.class, this, MyDslPackage.DROPTABLE__TABLE);
    }
    return table;
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
      case MyDslPackage.DROPTABLE__TABLE:
        return getTable();
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
      case MyDslPackage.DROPTABLE__TABLE:
        getTable().clear();
        getTable().addAll((Collection<? extends TableName>)newValue);
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
      case MyDslPackage.DROPTABLE__TABLE:
        getTable().clear();
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
      case MyDslPackage.DROPTABLE__TABLE:
        return table != null && !table.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DROPTABLEImpl
