//
// MarkusLang Parser
// A basic language made up of Markus Lumpe quotes
//
// Alex Cummaudo
// 1 October 2014
//
package markuslang.ast.arguments;

import markuslang.machine.MarkusLangVisitor;
import markuslang.parser.Token;

/**
 * An assignable string argument
 */
public class StringArgument extends AssignableArgument
{
  /**
   * The string that is contained in this string argument
   */
  private String fString;
  
  /**
   * The constructor must take the string token that constructed it
   * @param aString
   *        The invoking string
   */
  public StringArgument (Token aString)
  {
    super (aString);
    
    // Scoop the string out, removing the leading and ending quotes
    fString = aString.image.substring (1, aString.image.length () - 1);
  }
  
  /**
   * Gets the string value in this string argument
   * @return The string value
   */
  public String getValue ()
  {
    return fString;
  }
  
  /**
   * Accepts the string argument to have work done on it by the visitor
   */
  public void accept (MarkusLangVisitor aVisitor)
  {
    // The visitor visits this object
    aVisitor.visit (this);
  }
}
