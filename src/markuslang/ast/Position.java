//
// MarkusLang Parser
// A basic language made up of Markus Lumpe quotes
//
// Alex Cummaudo
// 1 October 2014
//
package markuslang.ast;

/**
 * The position class keeps track of the line and column
 * number that this node in the AST was parsed from.
 */
public class Position
{
  /**
   * The beginning line of the node
   */
  protected int fBeginLine;
  
  /**
   * The beginning column of the node
   */
  protected int fBeginColumn;
  
  /**
   * The ending line of the node
   */
  protected int fEndLine;
  
  /**
   * The ending column of the node
   */
  protected int fEndColumn;
}
