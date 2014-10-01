//
// MarkusLang Parser
// A basic language made up of Markus Lumpe quotes
//
// Alex Cummaudo
// 1 October 2014
//
package markuslang.machine;

import markuslang.ast.arguments.NumberArgument;
import markuslang.ast.arguments.StringArgument;
import markuslang.ast.statements.AssignmentStatement;
import markuslang.ast.statements.PrintStatement;

import java.util.*;

/**
 * A Markus Machine reads MarkusLang code and runs the code
 */
public class MarkusMachine implements MarkusLangVisitor
{
  /**
   * The memory in the Markus Machine
   */
  private Hashtable <String, Object> fMemory;
  
  /**
   * Initialises a new Markus Machine
   */
  public MarkusMachine ()
  {
    fMemory = new Hashtable <String, Object> ();
  }
  
  /**
   * Assignment statement visiting will bind the variable to
   * its value
   */
  public void visit (AssignmentStatement aStmt)
  {
    // Bind memory in the hash table
    fMemory.put (aStmt.getVariableName (), aStmt.getVariableValue ());
  }

  /**
   * Print the value to the console
   */
  public void visit (PrintStatement aStmt)
  {
    String lVarName = aStmt.getVariableName ();
    String lMsg;
    if (fMemory.containsKey (lVarName))
      lMsg = fMemory.get (lVarName).toString();
    else
      lMsg = String.format("This is not peachy! No value is bound to '%s'!", lVarName);
    System.out.println (lMsg);
  }

  /**
   * Gets the string value out of the argument
   */
  public String visit (StringArgument aArg)
  {
    return aArg.getValue ();
  }

  /**
   * Gets the number value out of the argument
   */
  public Double visit (NumberArgument aArg)
  {
    return aArg.getValue ();
  }

  /**
   * Prints the content of the RPN machine’s memory to the system console.
   */
  public void printMemoryTrace ()
  {
    System.out.println("Markus Memory:");
    for (String key : fMemory.keySet ())
      System.out.println(String.format("%s\t%s", key, fMemory.get (key)));
  }
}
