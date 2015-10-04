package org.yare.api;

import java.util.ArrayList;


/**
 * Business Rule Interface 
 * 
 * @author bradmesserle
 * @since 2013
 *
 */
public interface Rule {
	
	/**
	 * Gets the list of rule nodes.
	 *
	 * @return the nodes
	 */
	ArrayList<Node<?,?>> getNodes();
	
	
	/**
	 * Execute the collection of rule nodes
	 *
	 * @param data the data
	 * @return true, if successful
	 */
	boolean execute(Object... data);

}
