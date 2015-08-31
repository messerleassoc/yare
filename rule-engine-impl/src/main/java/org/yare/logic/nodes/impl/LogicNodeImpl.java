package org.yare.logic.nodes.impl;

import java.util.ArrayList;

import org.yare.api.Node;

/**
 * Logic Node Implementation 
 * Super class for all logic classes (&& || !)
 * 
 * @author bradmesserle
 * @since 2013
 *
 * @param <V> the value type
 */
public class LogicNodeImpl<V> implements Node<V> {

	/** The value. */
	private V value;

	/** The nodes. */
	private ArrayList<Node<?>> nodes = new ArrayList<Node<?>>();

	/**
	 * Gets the nodes.
	 *
	 * @return the nodes
	 */
	public ArrayList<Node<?>> getNodes() {
		return nodes;
	}

	/**
	 * Sets the nodes.
	 *
	 * @param nodes the new nodes
	 */
	public void setNodes(ArrayList<Node<?>> nodes) {
		this.nodes = nodes;
	}
	
	/* (non-Javadoc)
	 * @see org.yare.api.Node#getValue()
	 */
	public V getValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see org.yare.api.Node#setValue(java.lang.Object)
	 */
	public void setValue(V value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see org.yare.api.Node#execute(java.lang.Object[])
	 */
	public boolean execute(Object... data) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
