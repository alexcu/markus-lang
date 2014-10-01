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

public class NumberArgument extends AssignableArgument
{
  /**
   * The number containing the variable value
   */
  private Double fVariableNumber;
  
  /**
   * Initialize a new variable argument
   * @param aVariable
   *        The variable by which this number was initialized with
   */
  public NumberArgument (Token aVariable)
  {
    super (aVariable);

    fVariableNumber = new Double (aVariable.image);
  }
  
  /**
   * Gets the value stored in this number argument
   * @return 
   */
  public Double getValue ()
  {
    return fVariableNumber;
  }
  
  /**
   * Accepts the number argument to have work done on it by the visitor
   */
  public void accept (MarkusLangVisitor aVisitor)
  {
    // The visitor visits this object
    aVisitor.visit (this);
  }
}
