//
// MarkusLang Parser
// A basic language made up of Markus Lumpe quotes
//
// Alex Cummaudo
// 1 October 2014
//
package markuslang.ast.statements;

// Import machine visitors and the token class
import markuslang.machine.MarkusLangVisitor;
import markuslang.parser.Token;
import markuslang.ast.Position;

/**
 * The abstract MarkusLang instruction class, by which
 * all instructions inherit from.
 */
public abstract class Statement extends Position
{
  /**
   * Constructor for a statement must take the token it was
   * derived from
   * @param aStatement
   *        The token that invoked the construction of this statement 
   */
  public Statement (Token aStatement)
  {
    // Set the line and column positions
    fBeginLine    = aStatement.beginLine;
    fBeginColumn  = aStatement.beginColumn;
    fEndLine      = aStatement.endLine;
    fEndColumn    = aStatement.endColumn;
  }
  
  /**
   * Represents the statement as a string
   */
  public abstract String toString ();
  
  /**
   * Accepts a visitor to do work with this statement
   * @param aVisitor
   *        The visitor to do work with
   */
  public abstract void accept (MarkusLangVisitor aVisitor);
}