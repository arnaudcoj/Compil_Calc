/*
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalCalculatriceParser;
import org.xtext.example.mydsl.services.CalculatriceGrammarAccess;

public class CalculatriceParser extends AbstractContentAssistParser {

	@Inject
	private CalculatriceGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCalculatriceParser createParser() {
		InternalCalculatriceParser result = new InternalCalculatriceParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCalcAccess().getAlternatives(), "rule__Calc__Alternatives");
					put(grammarAccess.getCalcExprAccess().getOpAlternatives_1_1_0(), "rule__CalcExpr__OpAlternatives_1_1_0");
					put(grammarAccess.getTermAccess().getOpAlternatives_1_1_0(), "rule__Term__OpAlternatives_1_1_0");
					put(grammarAccess.getFactorAccess().getAlternatives(), "rule__Factor__Alternatives");
					put(grammarAccess.getBoolExprAccess().getOpAlternatives_1_1_0(), "rule__BoolExpr__OpAlternatives_1_1_0");
					put(grammarAccess.getBoolAccess().getAlternatives(), "rule__Bool__Alternatives");
					put(grammarAccess.getBoolAccess().getBoolValueAlternatives_1_1_0(), "rule__Bool__BoolValueAlternatives_1_1_0");
					put(grammarAccess.getCalculatriceAccess().getGroup(), "rule__Calculatrice__Group__0");
					put(grammarAccess.getCalcAccess().getGroup_0(), "rule__Calc__Group_0__0");
					put(grammarAccess.getCalcAccess().getGroup_2(), "rule__Calc__Group_2__0");
					put(grammarAccess.getCalcAccess().getGroup_2_0(), "rule__Calc__Group_2_0__0");
					put(grammarAccess.getCalcExprAccess().getGroup(), "rule__CalcExpr__Group__0");
					put(grammarAccess.getCalcExprAccess().getGroup_1(), "rule__CalcExpr__Group_1__0");
					put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
					put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
					put(grammarAccess.getFactorAccess().getGroup_0(), "rule__Factor__Group_0__0");
					put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
					put(grammarAccess.getFactorAccess().getGroup_2(), "rule__Factor__Group_2__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getConditionAccess().getGroup_4(), "rule__Condition__Group_4__0");
					put(grammarAccess.getBoolExprAccess().getGroup(), "rule__BoolExpr__Group__0");
					put(grammarAccess.getBoolExprAccess().getGroup_1(), "rule__BoolExpr__Group_1__0");
					put(grammarAccess.getBoolAccess().getGroup_0(), "rule__Bool__Group_0__0");
					put(grammarAccess.getBoolAccess().getGroup_1(), "rule__Bool__Group_1__0");
					put(grammarAccess.getCalculatriceAccess().getCalculsAssignment_0(), "rule__Calculatrice__CalculsAssignment_0");
					put(grammarAccess.getCalcAccess().getBoolNameAssignment_0_1(), "rule__Calc__BoolNameAssignment_0_1");
					put(grammarAccess.getCalcAccess().getBAssignment_0_3(), "rule__Calc__BAssignment_0_3");
					put(grammarAccess.getCalcAccess().getDeclAssignment_2_0_0(), "rule__Calc__DeclAssignment_2_0_0");
					put(grammarAccess.getCalcAccess().getVarNameAssignment_2_0_1(), "rule__Calc__VarNameAssignment_2_0_1");
					put(grammarAccess.getCalcAccess().getEAssignment_2_1(), "rule__Calc__EAssignment_2_1");
					put(grammarAccess.getCalcExprAccess().getOpAssignment_1_1(), "rule__CalcExpr__OpAssignment_1_1");
					put(grammarAccess.getCalcExprAccess().getRightAssignment_1_2(), "rule__CalcExpr__RightAssignment_1_2");
					put(grammarAccess.getTermAccess().getOpAssignment_1_1(), "rule__Term__OpAssignment_1_1");
					put(grammarAccess.getTermAccess().getRightAssignment_1_2(), "rule__Term__RightAssignment_1_2");
					put(grammarAccess.getFactorAccess().getNegAssignment_1_1(), "rule__Factor__NegAssignment_1_1");
					put(grammarAccess.getFactorAccess().getValueAssignment_1_2(), "rule__Factor__ValueAssignment_1_2");
					put(grammarAccess.getFactorAccess().getVarCallAssignment_2_1(), "rule__Factor__VarCallAssignment_2_1");
					put(grammarAccess.getConditionAccess().getThenBlockAssignment_3(), "rule__Condition__ThenBlockAssignment_3");
					put(grammarAccess.getConditionAccess().getElseBlockAssignment_4_1(), "rule__Condition__ElseBlockAssignment_4_1");
					put(grammarAccess.getBoolExprAccess().getOpAssignment_1_1(), "rule__BoolExpr__OpAssignment_1_1");
					put(grammarAccess.getBoolExprAccess().getRightAssignment_1_2(), "rule__BoolExpr__RightAssignment_1_2");
					put(grammarAccess.getBoolAccess().getBoolValueAssignment_1_1(), "rule__Bool__BoolValueAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalCalculatriceParser typedParser = (InternalCalculatriceParser) parser;
			typedParser.entryRuleCalculatrice();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CalculatriceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CalculatriceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
