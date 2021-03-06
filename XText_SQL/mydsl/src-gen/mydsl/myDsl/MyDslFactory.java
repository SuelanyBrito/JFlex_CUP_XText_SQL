/**
 * generated by Xtext 2.23.0
 */
package mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>SELECT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SELECT</em>'.
   * @generated
   */
  SELECT createSELECT();

  /**
   * Returns a new object of class '<em>From And Where Clauses</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From And Where Clauses</em>'.
   * @generated
   */
  FromAndWhereClauses createFromAndWhereClauses();

  /**
   * Returns a new object of class '<em>WHERE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>WHERE</em>'.
   * @generated
   */
  WHERE createWHERE();

  /**
   * Returns a new object of class '<em>Oper1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Oper1</em>'.
   * @generated
   */
  Oper1 createOper1();

  /**
   * Returns a new object of class '<em>Oper2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Oper2</em>'.
   * @generated
   */
  Oper2 createOper2();

  /**
   * Returns a new object of class '<em>Oper3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Oper3</em>'.
   * @generated
   */
  Oper3 createOper3();

  /**
   * Returns a new object of class '<em>DATABASE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DATABASE</em>'.
   * @generated
   */
  DATABASE createDATABASE();

  /**
   * Returns a new object of class '<em>CREATE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CREATE</em>'.
   * @generated
   */
  CREATE createCREATE();

  /**
   * Returns a new object of class '<em>TABLE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TABLE</em>'.
   * @generated
   */
  TABLE createTABLE();

  /**
   * Returns a new object of class '<em>Table Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Name</em>'.
   * @generated
   */
  TableName createTableName();

  /**
   * Returns a new object of class '<em>CD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CD</em>'.
   * @generated
   */
  CD createCD();

  /**
   * Returns a new object of class '<em>Primary Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Key</em>'.
   * @generated
   */
  PrimaryKey createPrimaryKey();

  /**
   * Returns a new object of class '<em>Foreign Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreign Key</em>'.
   * @generated
   */
  ForeignKey createForeignKey();

  /**
   * Returns a new object of class '<em>DROPTABLE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DROPTABLE</em>'.
   * @generated
   */
  DROPTABLE createDROPTABLE();

  /**
   * Returns a new object of class '<em>TRUNCATE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TRUNCATE</em>'.
   * @generated
   */
  TRUNCATE createTRUNCATE();

  /**
   * Returns a new object of class '<em>DELETE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DELETE</em>'.
   * @generated
   */
  DELETE createDELETE();

  /**
   * Returns a new object of class '<em>UPDATE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UPDATE</em>'.
   * @generated
   */
  UPDATE createUPDATE();

  /**
   * Returns a new object of class '<em>Set Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Clause</em>'.
   * @generated
   */
  SetClause createSetClause();

  /**
   * Returns a new object of class '<em>ALTER</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALTER</em>'.
   * @generated
   */
  ALTER createALTER();

  /**
   * Returns a new object of class '<em>ALTERDROP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALTERDROP</em>'.
   * @generated
   */
  ALTERDROP createALTERDROP();

  /**
   * Returns a new object of class '<em>ALTERADD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALTERADD</em>'.
   * @generated
   */
  ALTERADD createALTERADD();

  /**
   * Returns a new object of class '<em>ALTERUPDATE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALTERUPDATE</em>'.
   * @generated
   */
  ALTERUPDATE createALTERUPDATE();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns a new object of class '<em>Int Var Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Var Expression</em>'.
   * @generated
   */
  IntVarExpression createIntVarExpression();

  /**
   * Returns a new object of class '<em>SELECTFUNCT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SELECTFUNCT</em>'.
   * @generated
   */
  SELECTFUNCT createSELECTFUNCT();

  /**
   * Returns a new object of class '<em>Count Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count Function</em>'.
   * @generated
   */
  CountFunction createCountFunction();

  /**
   * Returns a new object of class '<em>Avg Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Avg Function</em>'.
   * @generated
   */
  AvgFunction createAvgFunction();

  /**
   * Returns a new object of class '<em>Sum Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum Function</em>'.
   * @generated
   */
  SumFunction createSumFunction();

  /**
   * Returns a new object of class '<em>Min Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min Function</em>'.
   * @generated
   */
  MinFunction createMinFunction();

  /**
   * Returns a new object of class '<em>Max Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max Function</em>'.
   * @generated
   */
  MaxFunction createMaxFunction();

  /**
   * Returns a new object of class '<em>INSERT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>INSERT</em>'.
   * @generated
   */
  INSERT createINSERT();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
