package org.yare.logic.nodes.impl;

import org.yare.api.Node;


/**
 *  And (&&) Node Implementation 
 *  
 *  Any number of nodes is supported. Once a false detected
 *  return false other wise return true
 * 
 * @author brad messerle
 * @since 2013
 *
 * @param <V> the value type
 */
public class AndNodeImpl<V> extends LogicNodeImpl<V>  {

	
	/* (non-Javadoc)
	 * @see org.yare.logic.nodes.impl.LogicNodeImpl#execute(java.lang.Object[])
	 */
	public boolean execute(Object... data) {

		for (Node<?> node: this.getNodes()){
			if (node.execute(data) == false){
				return false;
			}
		}

		return true;
	}

	
	
}
