/**
 * generated by Xtext 2.23.0
 */
package mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALTERADD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mydsl.myDsl.ALTERADD#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see mydsl.myDsl.MyDslPackage#getALTERADD()
 * @model
 * @generated
 */
public interface ALTERADD extends EObject
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' reference list.
   * The list contents are of type {@link mydsl.myDsl.CD}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' reference list.
   * @see mydsl.myDsl.MyDslPackage#getALTERADD_Column()
   * @model
   * @generated
   */
  EList<CD> getColumn();

} // ALTERADD
