// Generated from D:/3 êóðñ/6sem/ßÏÈÑ/Compiler/src/main/java/antlr\MatrixLanguage.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MatrixLanguageParser}.
 */
public interface MatrixLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#programInitialization}.
	 * @param ctx the parse tree
	 */
	void enterProgramInitialization(MatrixLanguageParser.ProgramInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#programInitialization}.
	 * @param ctx the parse tree
	 */
	void exitProgramInitialization(MatrixLanguageParser.ProgramInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MatrixLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MatrixLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#addictiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddictiveExpression(MatrixLanguageParser.AddictiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#addictiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddictiveExpression(MatrixLanguageParser.AddictiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#multilicativeException}.
	 * @param ctx the parse tree
	 */
	void enterMultilicativeException(MatrixLanguageParser.MultilicativeExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#multilicativeException}.
	 * @param ctx the parse tree
	 */
	void exitMultilicativeException(MatrixLanguageParser.MultilicativeExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MatrixLanguageParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MatrixLanguageParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MatrixLanguageParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MatrixLanguageParser.ElementContext ctx);
}