package org.yare.logic.nodes.impl;


/**
 * Not logic (!) implementation
 * 
 * Node depth should only be one deep.
 *
 * @author bradmesserle
 * @since 2013
 *
 * @param <V> the value type
 */
public class NotNodeImpl<T,V> extends LogicNodeImpl<T,V> {
	
	/* (non-Javadoc)
	 * @see org.yare.logic.nodes.impl.LogicNodeImpl#execute(java.lang.Object[])
	 */
	public boolean execute(Object... data) {

		boolean result = false;
		
		if (this.getNodes() != null && this.getNodes().size() == 1){
			result = !this.getNodes().get(0).execute(data);
		}
		
		return result;
	}
	
	
}
