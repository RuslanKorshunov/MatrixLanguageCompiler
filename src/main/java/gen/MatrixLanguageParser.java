// Generated from D:/3 êóðñ/6sem/ßÏÈÑ/Compiler/src/main/java/antlr\MatrixLanguage.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatrixLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, L_FBR=2, R_FBR=3, L_CBR=4, R_CBR=5, L_BR=6, R_BR=7, COMMA=8, 
		DOT_COMMA=9, EQUALS=10, AND=11, NOT=12, OR=13, IF=14, ELSE=15, PLUS=16, 
		MINUS=17, MULT=18, DIV=19, NULL=20, MORE_THAN=21, LESS_THAN=22, ELEMENT=23, 
		SET=24, WS=25, NAME=26, DIGIT=27;
	public static final int
		RULE_programInitialization = 0, RULE_block = 1, RULE_addictiveExpression = 2, 
		RULE_multilicativeException = 3, RULE_element = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"programInitialization", "block", "addictiveExpression", "multilicativeException", 
			"element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'{'", "'}'", "'['", "']'", "'('", "')'", "','", 
			"';'", "'='", "'and'", "'not'", "'or'", "'if'", "'else'", "'+'", "'-'", 
			"'*'", "'/'", "'null'", "'>'", "'<'", "'element'", "'set'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "L_FBR", "R_FBR", "L_CBR", "R_CBR", "L_BR", "R_BR", 
			"COMMA", "DOT_COMMA", "EQUALS", "AND", "NOT", "OR", "IF", "ELSE", "PLUS", 
			"MINUS", "MULT", "DIV", "NULL", "MORE_THAN", "LESS_THAN", "ELEMENT", 
			"SET", "WS", "NAME", "DIGIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MatrixLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MatrixLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramInitializationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MatrixLanguageParser.FUNCTION, 0); }
		public TerminalNode NAME() { return getToken(MatrixLanguageParser.NAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode L_FBR() { return getToken(MatrixLanguageParser.L_FBR, 0); }
		public TerminalNode R_FBR() { return getToken(MatrixLanguageParser.R_FBR, 0); }
		public ProgramInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterProgramInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitProgramInitialization(this);
		}
	}

	public final ProgramInitializationContext programInitialization() throws RecognitionException {
		ProgramInitializationContext _localctx = new ProgramInitializationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programInitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(FUNCTION);
			setState(11);
			match(NAME);
			setState(12);
			block();
			setState(13);
			match(L_FBR);
			setState(14);
			match(R_FBR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddictiveExpressionContext extends ParserRuleContext {
		public List<MultilicativeExceptionContext> multilicativeException() {
			return getRuleContexts(MultilicativeExceptionContext.class);
		}
		public MultilicativeExceptionContext multilicativeException(int i) {
			return getRuleContext(MultilicativeExceptionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MatrixLanguageParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MatrixLanguageParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MatrixLanguageParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MatrixLanguageParser.MINUS, i);
		}
		public AddictiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addictiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterAddictiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitAddictiveExpression(this);
		}
	}

	public final AddictiveExpressionContext addictiveExpression() throws RecognitionException {
		AddictiveExpressionContext _localctx = new AddictiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_addictiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			multilicativeException();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(19);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(20);
				multilicativeException();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultilicativeExceptionContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MatrixLanguageParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MatrixLanguageParser.DIV, 0); }
		public MultilicativeExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multilicativeException; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterMultilicativeException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitMultilicativeException(this);
		}
	}

	public final MultilicativeExceptionContext multilicativeException() throws RecognitionException {
		MultilicativeExceptionContext _localctx = new MultilicativeExceptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multilicativeException);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			element();
			{
			setState(27);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(28);
			element();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ELEMENT() { return getToken(MatrixLanguageParser.ELEMENT, 0); }
		public TerminalNode L_BR() { return getToken(MatrixLanguageParser.L_BR, 0); }
		public AddictiveExpressionContext addictiveExpression() {
			return getRuleContext(AddictiveExpressionContext.class,0);
		}
		public TerminalNode R_BR() { return getToken(MatrixLanguageParser.R_BR, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixLanguageListener ) ((MatrixLanguageListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_element);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(ELEMENT);
				}
				break;
			case L_BR:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(L_BR);
				setState(32);
				addictiveExpression();
				setState(33);
				match(R_BR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\7\4\30\n\4\f\4\16\4\33\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6&"+
		"\n\6\3\6\2\2\7\2\4\6\b\n\2\4\3\2\22\23\3\2\24\25\2$\2\f\3\2\2\2\4\22\3"+
		"\2\2\2\6\24\3\2\2\2\b\34\3\2\2\2\n%\3\2\2\2\f\r\7\3\2\2\r\16\7\34\2\2"+
		"\16\17\5\4\3\2\17\20\7\4\2\2\20\21\7\5\2\2\21\3\3\2\2\2\22\23\3\2\2\2"+
		"\23\5\3\2\2\2\24\31\5\b\5\2\25\26\t\2\2\2\26\30\5\b\5\2\27\25\3\2\2\2"+
		"\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\7\3\2\2\2\33\31\3\2\2\2"+
		"\34\35\5\n\6\2\35\36\t\3\2\2\36\37\5\n\6\2\37\t\3\2\2\2 &\7\31\2\2!\""+
		"\7\b\2\2\"#\5\6\4\2#$\7\t\2\2$&\3\2\2\2% \3\2\2\2%!\3\2\2\2&\13\3\2\2"+
		"\2\4\31%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}