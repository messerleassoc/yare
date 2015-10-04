package org.yare.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.yare.api.Condition;
import org.yare.api.Node;
import org.yare.api.RuleNode;

/**
 * Rule node implementation 
 * 
 * @author bradmesserle
 * @since 2013
 */
public class RuleNodeImpl<T,V> implements RuleNode<T,V> {

	/** The observable class. */
	private Class<T> observableClass;

	/** The field name. */
	private String fieldName;

	/** The value. */
	private V value;
	
	/** The conditional. */
	private Condition conditional;
	

	/**
	 * Gets the observable class.
	 *
	 * @return the observable class
	 */
	public final Class<T> getObservableClass() {
		return observableClass;
	}

	/**
	 * Sets the observable class.
	 *
	 * @param observableClass the new observable class
	 */
	public final void setObservableClass(final Class<T> observableClass) {
		this.observableClass = observableClass;
	}

	/**
	 * Gets the field name.
	 *
	 * @return the field name
	 */
	public final String getFieldName() {
		return fieldName;
	}

	/**
	 * Sets the field name.
	 *
	 * @param fieldName the new field name
	 */
	public void setFieldName(final String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * Gets the conditional.
	 *
	 * @return the conditional
	 */
	public Condition getConditional() {
		return conditional;
	}

	/**
	 * Sets the conditional.
	 *
	 * @param conditional the new conditional
	 */
	public void setConditional(Condition conditional) {
		this.conditional = conditional;
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

	
	/**
	 * Execute the rule node
	 *
	 * @param dataObject the data object
	 * @return true, if successful
	 */
	public boolean execute(final Object dataObject) {

		if (dataObject.getClass().isAssignableFrom(observableClass)) {

			try {
				
				final Field thisField = observableClass.getDeclaredField(this.getFieldName());	
				thisField.setAccessible(true);
				return this.getConditional().evaluate(this.getValue(), thisField.get(dataObject));

			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

		} else {
			//We might want to do some logging since the data passed in was not what we expected.
		}

		return false;

	}

	/* (non-Javadoc)
	 * @see org.yare.api.Node#execute(java.lang.Object[])
	 */
	@Override
	public boolean execute(Object... data) {
		return this.execute(data[0]);
	}

	@Override
	public ArrayList<Node<?, ?>> getNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
