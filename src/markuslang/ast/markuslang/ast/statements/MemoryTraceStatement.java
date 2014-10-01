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
 * The memory trace statement contains a way in which
 * all memory bindings can be printed and their assigned
 * values in the machine
 */
public class MemoryTraceStatement extends Statement
{  
  /**
   * Constructor for the memory trace statement
   * @param aToken
   *        The token which invoked construction
   */
  public MemoryTraceStatement (Token aToken)
  {
    super (aToken);
  }
  
  /**
   * Represents the assignment statement as a string
   */
  public String toString ()
  {
    return "what is this thingy??";
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
