package org.w3c.dom;

public interface DocumentType extends Node {
  
  public String       getName();
  public NamedNodeMap getEntities();
  public NamedNodeMap getNotations();
  public String       getPublicId();
  public String       getSystemId();
  public String       getInternalSubset();

}