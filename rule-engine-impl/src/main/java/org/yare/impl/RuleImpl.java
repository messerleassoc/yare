package org.yare.impl;

import org.yare.api.Node;
import org.yare.api.Rule;

import java.util.ArrayList;


/**
 * Rule implementation
 * 
 * @author bradmesserle
 * @since 2013
 */
public class RuleImpl implements Rule {

	/** The nodes. */
	private ArrayList<Node<?>> nodes = new ArrayList<Node<?>>();

	/**
	 * Gets the list of rule nodes.
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
	
	
	/**
	 * Execute the collection of rule nodes
	 *
	 * @param data the data
	 * @return true, if successful
	 */
	public boolean execute(Object... data){

		boolean result = true;
		for (Node<?> node : this.getNodes()){
			if (!node.execute(data)) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	
	
}
