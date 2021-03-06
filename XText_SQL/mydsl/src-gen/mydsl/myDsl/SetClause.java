/**
 * generated by Xtext 2.23.0
 */
package mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mydsl.myDsl.SetClause#getColumn <em>Column</em>}</li>
 *   <li>{@link mydsl.myDsl.SetClause#getName <em>Name</em>}</li>
 *   <li>{@link mydsl.myDsl.SetClause#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see mydsl.myDsl.MyDslPackage#getSetClause()
 * @model
 * @generated
 */
public interface SetClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' reference list.
   * The list contents are of type {@link mydsl.myDsl.CD}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' reference list.
   * @see mydsl.myDsl.MyDslPackage#getSetClause_Column()
   * @model
   * @generated
   */
  EList<CD> getColumn();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see mydsl.myDsl.MyDslPackage#getSetClause_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mydsl.myDsl.SetClause#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see mydsl.myDsl.MyDslPackage#getSetClause_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link mydsl.myDsl.SetClause#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

} // SetClause
