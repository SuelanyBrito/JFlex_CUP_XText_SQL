/*
 * generated by Xtext 2.23.0
 */
package mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import mydsl.services.MyDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FromAndWhereClauses_ANDKeyword_2_2_0_0_or_ORKeyword_2_2_0_1;
	protected AbstractElementAlias match_SELECT_AsteriskKeyword_1_0_q;
	protected AbstractElementAlias match_UPDATE_ANDKeyword_5_2_0_0_or_ORKeyword_5_2_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_FromAndWhereClauses_ANDKeyword_2_2_0_0_or_ORKeyword_2_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFromAndWhereClausesAccess().getANDKeyword_2_2_0_0()), new TokenAlias(false, false, grammarAccess.getFromAndWhereClausesAccess().getORKeyword_2_2_0_1()));
		match_SELECT_AsteriskKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getSELECTAccess().getAsteriskKeyword_1_0());
		match_UPDATE_ANDKeyword_5_2_0_0_or_ORKeyword_5_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUPDATEAccess().getANDKeyword_5_2_0_0()), new TokenAlias(false, false, grammarAccess.getUPDATEAccess().getORKeyword_5_2_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getNOTNULLRule())
			return getNOTNULLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal NOTNULL: "not null";
	 */
	protected String getNOTNULLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "not null";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_FromAndWhereClauses_ANDKeyword_2_2_0_0_or_ORKeyword_2_2_0_1.equals(syntax))
				emit_FromAndWhereClauses_ANDKeyword_2_2_0_0_or_ORKeyword_2_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SELECT_AsteriskKeyword_1_0_q.equals(syntax))
				emit_SELECT_AsteriskKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UPDATE_ANDKeyword_5_2_0_0_or_ORKeyword_5_2_0_1.equals(syntax))
				emit_UPDATE_ANDKeyword_5_2_0_0_or_ORKeyword_5_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'AND' | 'OR'
	 *
	 * This ambiguous syntax occurs at:
	 *     z+=WHERE (ambiguity) z+=WHERE
	 */
	protected void emit_FromAndWhereClauses_ANDKeyword_2_2_0_0_or_ORKeyword_2_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '*'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'SELECT' (ambiguity) x=FromAndWhereClauses
	 */
	protected void emit_SELECT_AsteriskKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'AND' | 'OR'
	 *
	 * This ambiguous syntax occurs at:
	 *     z+=WHERE (ambiguity) z+=WHERE
	 */
	protected void emit_UPDATE_ANDKeyword_5_2_0_0_or_ORKeyword_5_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}