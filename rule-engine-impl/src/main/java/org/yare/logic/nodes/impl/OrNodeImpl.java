package org.yare.logic.nodes.impl;

import org.yare.api.Node;

/**
 * OR Node (||) Implementation.
 * 
 * Any number of nodes is supported. Once a true is detected 
 * return true.
 *
 * @param <V> the value type
 * @author brad messerle
 * @since 2013
 */
public class OrNodeImpl<V> extends LogicNodeImpl<V> {

	
	/* (non-Javadoc)
	 * @see org.yare.logic.nodes.impl.LogicNodeImpl#execute(java.lang.Object[])
	 */
	public boolean execute(Object... data) {

		for (Node<?> node: this.getNodes()){
			if (node.execute(data) == true){
				return true;
			}
		}

		return false;
		
	}
	
}
