//
// MarkusLang Parser
// A basic language made up of Markus Lumpe quotes
//
// Alex Cummaudo
// 1 October 2014
//
package markuslang.ast.arguments;

import markuslang.parser.*;

/**
 * An argument that is assignable
 */
public abstract class AssignableArgument extends Argument
{
  /**
   * The token which caused the argument
   */
  private Token fToken;
  
  /**
   * The assignable argument 
   * @param aToken
   *        Token which constructed the argument
   */
  public AssignableArgument (Token aToken)
  {
    // Just call super
    super (aToken);
    fToken = aToken;
  }

  /**
   * Gets the token stored in this argument
   * @return The token stored in this argument
   */
  public Token getToken ()
  {
    return fToken;
  }
  
  /**
   * Gets the value stored in this argument
   * @return The value stored in this argument
   */
  public abstract Object getValue ();
}