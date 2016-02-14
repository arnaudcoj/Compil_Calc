/*
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalCalculatriceParser;
import org.xtext.example.mydsl.services.CalculatriceGrammarAccess;

public class CalculatriceParser extends AbstractAntlrParser {

	@Inject
	private CalculatriceGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCalculatriceParser createParser(XtextTokenStream stream) {
		return new InternalCalculatriceParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Calculatrice";
	}

	public CalculatriceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CalculatriceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
