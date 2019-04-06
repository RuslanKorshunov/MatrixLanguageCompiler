// Generated from D:/3 êóðñ/6sem/ßÏÈÑ/Compiler/src/main/java/antlr\MatrixLanguage.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatrixLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, L_FBR=2, R_FBR=3, L_CBR=4, R_CBR=5, L_BR=6, R_BR=7, COMMA=8, 
		DOT_COMMA=9, EQUALS=10, AND=11, NOT=12, OR=13, IF=14, ELSE=15, PLUS=16, 
		MINUS=17, MULT=18, DIV=19, NULL=20, MORE_THAN=21, LESS_THAN=22, ELEMENT=23, 
		SET=24, WS=25, NAME=26, DIGIT=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FUNCTION", "L_FBR", "R_FBR", "L_CBR", "R_CBR", "L_BR", "R_BR", "COMMA", 
			"DOT_COMMA", "EQUALS", "AND", "NOT", "OR", "IF", "ELSE", "PLUS", "MINUS", 
			"MULT", "DIV", "NULL", "MORE_THAN", "LESS_THAN", "ELEMENT", "SET", "WS", 
			"NAME", "DIGIT"
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


	public MatrixLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MatrixLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\32\6\32\u0086\n\32\r\32\16\32\u0087\3\32"+
		"\3\32\3\33\6\33\u008d\n\33\r\33\16\33\u008e\3\34\6\34\u0092\n\34\r\34"+
		"\16\34\u0093\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\35\3\2\5\4\2\13\f\17\17\4\2C\\c|\3\2\62;\2\u0097\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5B\3\2\2\2\7D\3\2"+
		"\2\2\tF\3\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2"+
		"\2\2\25R\3\2\2\2\27T\3\2\2\2\31X\3\2\2\2\33\\\3\2\2\2\35_\3\2\2\2\37b"+
		"\3\2\2\2!g\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'m\3\2\2\2)o\3\2\2\2+t\3\2\2\2"+
		"-v\3\2\2\2/x\3\2\2\2\61\u0080\3\2\2\2\63\u0085\3\2\2\2\65\u008c\3\2\2"+
		"\2\67\u0091\3\2\2\29:\7h\2\2:;\7w\2\2;<\7p\2\2<=\7e\2\2=>\7v\2\2>?\7k"+
		"\2\2?@\7q\2\2@A\7p\2\2A\4\3\2\2\2BC\7}\2\2C\6\3\2\2\2DE\7\177\2\2E\b\3"+
		"\2\2\2FG\7]\2\2G\n\3\2\2\2HI\7_\2\2I\f\3\2\2\2JK\7*\2\2K\16\3\2\2\2LM"+
		"\7+\2\2M\20\3\2\2\2NO\7.\2\2O\22\3\2\2\2PQ\7=\2\2Q\24\3\2\2\2RS\7?\2\2"+
		"S\26\3\2\2\2TU\7c\2\2UV\7p\2\2VW\7f\2\2W\30\3\2\2\2XY\7p\2\2YZ\7q\2\2"+
		"Z[\7v\2\2[\32\3\2\2\2\\]\7q\2\2]^\7t\2\2^\34\3\2\2\2_`\7k\2\2`a\7h\2\2"+
		"a\36\3\2\2\2bc\7g\2\2cd\7n\2\2de\7u\2\2ef\7g\2\2f \3\2\2\2gh\7-\2\2h\""+
		"\3\2\2\2ij\7/\2\2j$\3\2\2\2kl\7,\2\2l&\3\2\2\2mn\7\61\2\2n(\3\2\2\2op"+
		"\7p\2\2pq\7w\2\2qr\7n\2\2rs\7n\2\2s*\3\2\2\2tu\7@\2\2u,\3\2\2\2vw\7>\2"+
		"\2w.\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7g\2\2{|\7o\2\2|}\7g\2\2}~\7p\2\2~\177"+
		"\7v\2\2\177\60\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7v\2\2\u0083\62\3\2\2\2\u0084\u0086\t\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\b\32\2\2\u008a\64\3\2\2\2\u008b\u008d\t\3\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\66\3\2\2\2\u0090\u0092\t\4\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u00948\3\2\2\2\6\2\u0087\u008e"+
		"\u0093\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}