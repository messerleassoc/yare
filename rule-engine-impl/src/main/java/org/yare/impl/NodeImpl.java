package org.yare.impl;

/**
 * Node Implementation 
 * 
 * @author bradmesserle
 * @since 2031
 *
 * @param <V> the value type
 */
public abstract class NodeImpl<V> {
	
	
	/** The value. */
	private V value;

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(V value) {
		this.value = value;
	}


}
