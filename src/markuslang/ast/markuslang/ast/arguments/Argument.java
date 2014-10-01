package markuslang.ast.arguments;

import markuslang.ast.Position;
import markuslang.parser.Token;

/**
 * Any kind of argument
 */
public abstract class Argument extends Position
{
  /**
   * Constructor for arguments must take the token that constructed
   * the argument
   * @param aToken
   *        The token that constructed this argument
   */
  public Argument (Token aToken)
  {
    // Set the line and column positions
    fBeginLine    = aToken.beginLine;
    fBeginColumn  = aToken.beginColumn;
    fEndLine      = aToken.endLine;
    fEndColumn    = aToken.endColumn;
  }
}
