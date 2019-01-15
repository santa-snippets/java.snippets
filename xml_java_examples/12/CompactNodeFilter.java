package org.w3c.dom.traversal;

public interface NodeFilter {
  
  // Constants returned by acceptNode
  public static final short FILTER_ACCEPT = 1;
  public static final short FILTER_REJECT = 2;
  public static final short FILTER_SKIP   = 3;

  // Constants for whatToShow
  public static final int SHOW_ALL               = 0xFFFFFFFF;
  public static final int SHOW_ELEMENT           = 0x00000001;
  public static final int SHOW_ATTRIBUTE         = 0x00000002;
  public static final int SHOW_TEXT              = 0x00000004;
  public static final int SHOW_CDATA_SECTION     = 0x00000008;
  public static final int SHOW_ENTITY_REFERENCE  = 0x00000010;
  public static final int SHOW_ENTITY            = 0x00000020;
  public static final int SHOW_PROCESSING_INSTRUCTION 
   = 0x00000040;
  public static final int SHOW_COMMENT           = 0x00000080;
  public static final int SHOW_DOCUMENT          = 0x00000100;
  public static final int SHOW_DOCUMENT_TYPE     = 0x00000200;
  public static final int SHOW_DOCUMENT_FRAGMENT = 0x00000400;
  public static final int SHOW_NOTATION          = 0x00000800;

  public short acceptNode(Node n);

}
