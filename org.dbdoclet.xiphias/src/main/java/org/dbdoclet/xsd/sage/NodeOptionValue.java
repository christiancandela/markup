/* Generated By:JJTree: Do not edit this line. NodeOptionValue.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=Node,NODE_EXTENDS=SampleDataNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.dbdoclet.xsd.sage;

public
class NodeOptionValue extends SimpleNode {
  public NodeOptionValue(int id) {
    super(id);
  }

  public NodeOptionValue(SampleDataParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SampleDataParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3b87dddf0593d4e72f1271fd4aadc1e8 (do not edit this line) */
