package org.yare.api;


/**
 * 
 * @author brad messerle
 * @since 2013`
 *
 */
public interface RuleNode<T,V> extends Node<T,V> {

	/**
	 * Sets the observable class.
	 *
	 * @param observableClass the new observable class
	 */
	void setObservableClass(final Class<T> observableClass);
	
	
	/**
	 * Gets the field name.
	 *
	 * @return the field name
	 */
     String getFieldName();

	/**
	 * Sets the field name.
	 *
	 * @param fieldName the new field name
	 */
	void setFieldName(final String fieldName);
	
	/**
	 * Gets the conditional.
	 *
	 * @return the conditional
	 */
	Condition getConditional();

	/**
	 * Sets the conditional.
	 *
	 * @param conditional the new conditional
	 */
	void setConditional(Condition conditional);
	
	
	
	
}
