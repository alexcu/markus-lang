//
// MarkusLang Parser
// A basic language made up of Markus Lumpe quotes
//
// Alex Cummaudo
// 1 October 2014
//
package markuslang.ast.statements;

import markuslang.parser.*;
import markuslang.ast.arguments.*;
import markuslang.machine.MarkusLangVisitor;

/**
 * The assignment statement contains the variable to
 * assign to and the value which it will be assigned
 */
public class AssignmentStatement extends Statement
{
  /**
   * The variable name stored in the assignment statement
   */
  private String fVariableName;

  /**
   * The value of the variable
   */
  private Object fVariableValue;
  
  /**
   * Gets the variable name out of the assignment statement
   * @return The variable name
   */
  public String getVariableName ()
  {
    return fVariableName;
  }

  /**
   * Gets the variable value out of the assignment statement
   * @return The variable value
   */
  public Object getVariableValue ()
  {
    return fVariableValue;
  }
  
  /**
   * Constructor for an assignment statement
   * @param aStatement
   *        The token which invoked construction
   * @param aVariable
   *        The variable name
   * @param aArg
   *        The argument value
   */
  public AssignmentStatement (Token aToken, Token aVariable, AssignableArgument aArg)
  {
    super (aToken);
    
    // Reassign the end column and line to reflect the argument accepted
    fEndLine = aArg.getToken ().endLine;
    fEndColumn = aArg.getToken ().endColumn;
    
    fVariableName = aVariable.image;
    fVariableValue = aArg.getValue ().toString ();
  }
  
  /**
   * Represents the assignment statement as a string
   */
  public String toString ()
  {
    return String.format ("this little piggy %s is %s", fVariableName, fVariableValue);
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
