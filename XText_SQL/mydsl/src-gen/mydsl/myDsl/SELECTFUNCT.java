/**
 * generated by Xtext 2.23.0
 */
package mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SELECTFUNCT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mydsl.myDsl.SELECTFUNCT#getColumn <em>Column</em>}</li>
 *   <li>{@link mydsl.myDsl.SELECTFUNCT#getX <em>X</em>}</li>
 * </ul>
 *
 * @see mydsl.myDsl.MyDslPackage#getSELECTFUNCT()
 * @model
 * @generated
 */
public interface SELECTFUNCT extends Element
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' reference list.
   * The list contents are of type {@link mydsl.myDsl.CD}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' reference list.
   * @see mydsl.myDsl.MyDslPackage#getSELECTFUNCT_Column()
   * @model
   * @generated
   */
  EList<CD> getColumn();

  /**
   * Returns the value of the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' containment reference.
   * @see #setX(FromAndWhereClauses)
   * @see mydsl.myDsl.MyDslPackage#getSELECTFUNCT_X()
   * @model containment="true"
   * @generated
   */
  FromAndWhereClauses getX();

  /**
   * Sets the value of the '{@link mydsl.myDsl.SELECTFUNCT#getX <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' containment reference.
   * @see #getX()
   * @generated
   */
  void setX(FromAndWhereClauses value);

} // SELECTFUNCT
