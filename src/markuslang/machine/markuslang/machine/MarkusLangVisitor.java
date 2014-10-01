//
// MarkusLang Parser
// A basic language made up of Markus Lumpe quotes
//
// Alex Cummaudo
// 1 October 2014
//
package markuslang.machine;

import markuslang.ast.arguments.*;
import markuslang.ast.statements.*;

/**
 * A visitor on MarkusLang code
 */
public interface MarkusLangVisitor
{
  // Statements
  public void visit (AssignmentStatement aStmt);
  public void visit (PrintStatement aStmt);
  
  // Arguments
  public String visit (StringArgument aArg);
  public Double visit (NumberArgument aArg);
}
