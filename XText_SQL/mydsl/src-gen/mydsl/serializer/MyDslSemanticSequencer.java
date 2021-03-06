/*
 * generated by Xtext 2.23.0
 */
package mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import mydsl.myDsl.ALTER;
import mydsl.myDsl.ALTERADD;
import mydsl.myDsl.ALTERDROP;
import mydsl.myDsl.ALTERUPDATE;
import mydsl.myDsl.AvgFunction;
import mydsl.myDsl.CD;
import mydsl.myDsl.CREATE;
import mydsl.myDsl.CountFunction;
import mydsl.myDsl.DATABASE;
import mydsl.myDsl.DELETE;
import mydsl.myDsl.DROPTABLE;
import mydsl.myDsl.ForeignKey;
import mydsl.myDsl.FromAndWhereClauses;
import mydsl.myDsl.INSERT;
import mydsl.myDsl.IntLiteral;
import mydsl.myDsl.IntVarExpression;
import mydsl.myDsl.MaxFunction;
import mydsl.myDsl.MinFunction;
import mydsl.myDsl.Model;
import mydsl.myDsl.MyDslPackage;
import mydsl.myDsl.Oper1;
import mydsl.myDsl.Oper2;
import mydsl.myDsl.Oper3;
import mydsl.myDsl.PrimaryKey;
import mydsl.myDsl.RealLiteral;
import mydsl.myDsl.SELECT;
import mydsl.myDsl.SetClause;
import mydsl.myDsl.SumFunction;
import mydsl.myDsl.TABLE;
import mydsl.myDsl.TRUNCATE;
import mydsl.myDsl.TableName;
import mydsl.myDsl.UPDATE;
import mydsl.myDsl.VariableDeclaration;
import mydsl.myDsl.WHERE;
import mydsl.services.MyDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ALTER:
				sequence_ALTER(context, (ALTER) semanticObject); 
				return; 
			case MyDslPackage.ALTERADD:
				sequence_ALTERADD(context, (ALTERADD) semanticObject); 
				return; 
			case MyDslPackage.ALTERDROP:
				sequence_ALTERDROP(context, (ALTERDROP) semanticObject); 
				return; 
			case MyDslPackage.ALTERUPDATE:
				sequence_ALTERUPDATE(context, (ALTERUPDATE) semanticObject); 
				return; 
			case MyDslPackage.AVG_FUNCTION:
				sequence_AvgFunction(context, (AvgFunction) semanticObject); 
				return; 
			case MyDslPackage.CD:
				sequence_ColumnDeclaration(context, (CD) semanticObject); 
				return; 
			case MyDslPackage.CREATE:
				sequence_CREATE(context, (CREATE) semanticObject); 
				return; 
			case MyDslPackage.COUNT_FUNCTION:
				sequence_CountFunction(context, (CountFunction) semanticObject); 
				return; 
			case MyDslPackage.DATABASE:
				sequence_DATABASE(context, (DATABASE) semanticObject); 
				return; 
			case MyDslPackage.DELETE:
				sequence_DELETE(context, (DELETE) semanticObject); 
				return; 
			case MyDslPackage.DROPTABLE:
				sequence_DROPTABLE(context, (DROPTABLE) semanticObject); 
				return; 
			case MyDslPackage.FOREIGN_KEY:
				sequence_ForeignKey(context, (ForeignKey) semanticObject); 
				return; 
			case MyDslPackage.FROM_AND_WHERE_CLAUSES:
				sequence_FromAndWhereClauses(context, (FromAndWhereClauses) semanticObject); 
				return; 
			case MyDslPackage.INSERT:
				sequence_INSERT(context, (INSERT) semanticObject); 
				return; 
			case MyDslPackage.INT_LITERAL:
				sequence_IntLiteral(context, (IntLiteral) semanticObject); 
				return; 
			case MyDslPackage.INT_VAR_EXPRESSION:
				sequence_IntVarExpression(context, (IntVarExpression) semanticObject); 
				return; 
			case MyDslPackage.MAX_FUNCTION:
				sequence_MaxFunction(context, (MaxFunction) semanticObject); 
				return; 
			case MyDslPackage.MIN_FUNCTION:
				sequence_MinFunction(context, (MinFunction) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.OPER1:
				sequence_Oper1(context, (Oper1) semanticObject); 
				return; 
			case MyDslPackage.OPER2:
				sequence_Oper2(context, (Oper2) semanticObject); 
				return; 
			case MyDslPackage.OPER3:
				sequence_Oper3(context, (Oper3) semanticObject); 
				return; 
			case MyDslPackage.PRIMARY_KEY:
				sequence_PrimaryKey(context, (PrimaryKey) semanticObject); 
				return; 
			case MyDslPackage.REAL_LITERAL:
				sequence_RealLiteral(context, (RealLiteral) semanticObject); 
				return; 
			case MyDslPackage.SELECT:
				sequence_SELECT(context, (SELECT) semanticObject); 
				return; 
			case MyDslPackage.SET_CLAUSE:
				sequence_SetClause(context, (SetClause) semanticObject); 
				return; 
			case MyDslPackage.SUM_FUNCTION:
				sequence_SumFunction(context, (SumFunction) semanticObject); 
				return; 
			case MyDslPackage.TABLE:
				sequence_TABLE(context, (TABLE) semanticObject); 
				return; 
			case MyDslPackage.TRUNCATE:
				sequence_TRUNCATE(context, (TRUNCATE) semanticObject); 
				return; 
			case MyDslPackage.TABLE_NAME:
				sequence_tableName(context, (TableName) semanticObject); 
				return; 
			case MyDslPackage.UPDATE:
				sequence_UPDATE(context, (UPDATE) semanticObject); 
				return; 
			case MyDslPackage.VARIABLE_DECLARATION:
				sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
				return; 
			case MyDslPackage.WHERE:
				sequence_WHERE(context, (WHERE) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ALTERADD returns ALTERADD
	 *
	 * Constraint:
	 *     column+=[CD|ID]
	 */
	protected void sequence_ALTERADD(ISerializationContext context, ALTERADD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ALTERDROP returns ALTERDROP
	 *
	 * Constraint:
	 *     column+=[CD|ID]
	 */
	protected void sequence_ALTERDROP(ISerializationContext context, ALTERDROP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ALTERUPDATE returns ALTERUPDATE
	 *
	 * Constraint:
	 *     column+=[CD|ID]
	 */
	protected void sequence_ALTERUPDATE(ISerializationContext context, ALTERUPDATE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns ALTER
	 *     ALTER returns ALTER
	 *
	 * Constraint:
	 *     (table+=[TableName|ID] (addDropUpdate=ALTERDROP | addDropUpdate=ALTERADD | addDropUpdate=ALTERUPDATE))
	 */
	protected void sequence_ALTER(ISerializationContext context, ALTER semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns AvgFunction
	 *     SELECTFUNCT returns AvgFunction
	 *     AvgFunction returns AvgFunction
	 *
	 * Constraint:
	 *     (column+=[CD|ID] x=FromAndWhereClauses)
	 */
	protected void sequence_AvgFunction(ISerializationContext context, AvgFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns CREATE
	 *     CREATE returns CREATE
	 *
	 * Constraint:
	 *     tables+=TABLE+
	 */
	protected void sequence_CREATE(ISerializationContext context, CREATE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ColumnDeclaration returns CD
	 *
	 * Constraint:
	 *     (name=ID type=DATATYPE notNull?=NOTNULL?)
	 */
	protected void sequence_ColumnDeclaration(ISerializationContext context, CD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns CountFunction
	 *     SELECTFUNCT returns CountFunction
	 *     CountFunction returns CountFunction
	 *
	 * Constraint:
	 *     (column+=[CD|ID] x=FromAndWhereClauses)
	 */
	protected void sequence_CountFunction(ISerializationContext context, CountFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns DATABASE
	 *     DATABASE returns DATABASE
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DATABASE(ISerializationContext context, DATABASE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DATABASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DATABASE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDATABASEAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns DELETE
	 *     DELETE returns DELETE
	 *
	 * Constraint:
	 *     x=FromAndWhereClauses
	 */
	protected void sequence_DELETE(ISerializationContext context, DELETE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DELETE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DELETE__X));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDELETEAccess().getXFromAndWhereClausesParserRuleCall_1_0(), semanticObject.getX());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns DROPTABLE
	 *     DROPTABLE returns DROPTABLE
	 *
	 * Constraint:
	 *     (table+=[TableName|ID] table+=[TableName|ID]*)
	 */
	protected void sequence_DROPTABLE(ISerializationContext context, DROPTABLE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ForeignKey returns ForeignKey
	 *
	 * Constraint:
	 *     (columnAsFK+=[CD|ID] columnAsFK+=[CD|ID]* foreignTable=[TABLE|ID] foreignColumns+=[CD|ID] foreignColumns+=[CD|ID]*)
	 */
	protected void sequence_ForeignKey(ISerializationContext context, ForeignKey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FromAndWhereClauses returns FromAndWhereClauses
	 *
	 * Constraint:
	 *     (table=[TableName|ID] (z+=WHERE z+=WHERE*)?)
	 */
	protected void sequence_FromAndWhereClauses(ISerializationContext context, FromAndWhereClauses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns INSERT
	 *     INSERT returns INSERT
	 *
	 * Constraint:
	 *     (nameT=ID literals+=DATATYPE*)
	 */
	protected void sequence_INSERT(ISerializationContext context, INSERT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IntLiteral returns IntLiteral
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_IntLiteral(ISerializationContext context, IntLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INT_LITERAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INT_LITERAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IntVarExpression returns IntVarExpression
	 *
	 * Constraint:
	 *     var=[VariableDeclaration|ID]
	 */
	protected void sequence_IntVarExpression(ISerializationContext context, IntVarExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INT_VAR_EXPRESSION__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INT_VAR_EXPRESSION__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1(), semanticObject.eGet(MyDslPackage.Literals.INT_VAR_EXPRESSION__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns MaxFunction
	 *     SELECTFUNCT returns MaxFunction
	 *     MaxFunction returns MaxFunction
	 *
	 * Constraint:
	 *     (column+=[CD|ID] x=FromAndWhereClauses)
	 */
	protected void sequence_MaxFunction(ISerializationContext context, MaxFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns MinFunction
	 *     SELECTFUNCT returns MinFunction
	 *     MinFunction returns MinFunction
	 *
	 * Constraint:
	 *     (column+=[CD|ID] x=FromAndWhereClauses)
	 */
	protected void sequence_MinFunction(ISerializationContext context, MinFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     Element+=Element+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Oper1 returns Oper1
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Oper1(ISerializationContext context, Oper1 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.OPER1__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.OPER1__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOper1Access().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Oper2 returns Oper2
	 *
	 * Constraint:
	 *     column+=[CD|ID]
	 */
	protected void sequence_Oper2(ISerializationContext context, Oper2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Oper3 returns Oper3
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_Oper3(ISerializationContext context, Oper3 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.OPER3__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.OPER3__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOper3Access().getValINTTerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryKey returns PrimaryKey
	 *
	 * Constraint:
	 *     (columnAsPK+=[CD|ID] columnAsPK+=[CD|ID]*)
	 */
	protected void sequence_PrimaryKey(ISerializationContext context, PrimaryKey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RealLiteral returns RealLiteral
	 *
	 * Constraint:
	 *     val=REAL
	 */
	protected void sequence_RealLiteral(ISerializationContext context, RealLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.REAL_LITERAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.REAL_LITERAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Element returns SELECT
	 *     SELECT returns SELECT
	 *
	 * Constraint:
	 *     ((column+=[CD|ID] column+=[CD|ID]*)* x=FromAndWhereClauses)
	 */
	protected void sequence_SELECT(ISerializationContext context, SELECT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SetClause returns SetClause
	 *
	 * Constraint:
	 *     (column+=[CD|ID] (name=ID | val=INT))
	 */
	protected void sequence_SetClause(ISerializationContext context, SetClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns SumFunction
	 *     SELECTFUNCT returns SumFunction
	 *     SumFunction returns SumFunction
	 *
	 * Constraint:
	 *     (column+=[CD|ID] x=FromAndWhereClauses)
	 */
	protected void sequence_SumFunction(ISerializationContext context, SumFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TABLE returns TABLE
	 *
	 * Constraint:
	 *     (
	 *         table+=tableName 
	 *         (attributes+=ColumnDeclaration | attributes+=PrimaryKey | attributes+=ForeignKey)+ 
	 *         attributes+=ColumnDeclaration? 
	 *         ((attributes+=PrimaryKey | attributes+=ForeignKey)? attributes+=ColumnDeclaration?)*
	 *     )
	 */
	protected void sequence_TABLE(ISerializationContext context, TABLE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns TRUNCATE
	 *     TRUNCATE returns TRUNCATE
	 *
	 * Constraint:
	 *     (table+=[TableName|ID] table+=[TableName|ID]*)
	 */
	protected void sequence_TRUNCATE(ISerializationContext context, TRUNCATE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns UPDATE
	 *     UPDATE returns UPDATE
	 *
	 * Constraint:
	 *     (table+=[TableName|ID] sc+=SetClause sc+=SetClause* (z+=WHERE z+=WHERE*)?)
	 */
	protected void sequence_UPDATE(ISerializationContext context, UPDATE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns VariableDeclaration
	 *     VariableDeclaration returns VariableDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=INT)
	 */
	protected void sequence_VariableDeclaration(ISerializationContext context, VariableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VARIABLE_DECLARATION__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VARIABLE_DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VARIABLE_DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WHERE returns WHERE
	 *
	 * Constraint:
	 *     (
	 *         column+=[CD|ID] 
	 *         (
	 *             sign='=' | 
	 *             sign='<' | 
	 *             sign='<=' | 
	 *             sign='>' | 
	 *             sign='>=' | 
	 *             sign='!=' | 
	 *             sign='LIKE'
	 *         ) 
	 *         (Oper=Oper1 | Oper=Oper2 | Oper=Oper3)
	 *     )
	 */
	protected void sequence_WHERE(ISerializationContext context, WHERE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     tableName returns TableName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_tableName(ISerializationContext context, TableName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TABLE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TABLE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTableNameAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
