package org.yare.api;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Interface Node.
 * 
 * @author bradmesserle
 * @since 2013
 *
 * @param <V> the value type
 */
public interface Node<V> {

	/**
	 * Execute.
	 *
	 * @param data the data
	 * @return true, if successful
	 */
	 boolean execute(Object... data);
	
	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	 V getValue();

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	 void setValue(V value);
	
	
	/**
	 * Gets the nodes.
	 *
	 * @return the nodes
	 */
	 ArrayList<Node<?>> getNodes();
	
	
}
