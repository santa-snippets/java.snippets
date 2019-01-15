package org.w3c.dom;

public interface Entity extends Node {

  public String getPublicId();
  public String getSystemId();
  public String getNotationName();

}
