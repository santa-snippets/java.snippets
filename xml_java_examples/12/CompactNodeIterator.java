package org.w3c.dom.traversal;

public interface NodeIterator {
  
    public Node       getRoot();
    public int        getWhatToShow();
    public NodeFilter getFilter();
    public boolean    getExpandEntityReferences();
    
    public Node       nextNode() throws DOMException;
    public Node       previousNode() throws DOMException;
    
    public void       detach();

}