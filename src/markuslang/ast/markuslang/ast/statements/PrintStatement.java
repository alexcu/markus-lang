//
// MarkusLang Parser
// A basic language made up of Markus Lumpe quotes
//
// Alex Cummaudo
// 1 October 2014
//
package markuslang.ast.statements;

import markuslang.parser.*;
import markuslang.machine.MarkusLangVisitor;

/**
 * The print statement contains the variable that is to
 * be printed and prints it to the console
 */
public class PrintStatement extends Statement
{
  /**
   * The string to be printed that represents the variable value
   */
  private String fVariableName;
  
  /**
   * Constructor for the print statement
   * @param aToken
   *        The token which invoked construction
   * @param aVar
   *        The variable name to print
   */
  public PrintStatement (Token aToken, Token aVar)
  {
    super (aToken);
    
    // Reassign the end column and line to reflect the argument accepted
    // (+1 for the ending '?')
    fEndLine = aVar.endLine + 1;
    fEndColumn = aVar.endColumn + 1;
    
    // Cut the leading and last element (i.e., the quotes!)
    fVariableName = aVar.image;
  }
  
  /**
   * Gets the variable name to print
   * @return The variable name to print
   */
  public String getVariableName ()
  {
    return fVariableName;
  }
  
  /**
   * Represents the assignment statement as a string
   */
  public String toString ()
  {
    return String.format ("what is this thingy %s?", fVariableName);
  }

  /**
   * Accepts the assignment statement to have work done on it by the visitor
   */
  public void accept (MarkusLangVisitor aVisitor)
  {
    // The visitor visits this object
    aVisitor.visit (this);
  }
}
