package org.yare.conditionals.impl;

import org.yare.api.Condition;

/**
 * Equal (=) Condition Implementation
 * 
 * @author bradmesserle
 * @since 2013
 */
public class EqualsConditionImpl implements Condition {

	/** The Constant ENGLISH_TEXT. */
	private static final String ENGLISH_TEXT = " equals ";
	
	
	/* (non-Javadoc)
	 * @see org.yare.api.Condition#evaluate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public <L, R> boolean evaluate(L leftValue, R rightValue) {
		return leftValue.equals(rightValue);
	}

	/* (non-Javadoc)
	 * @see org.yare.api.Condition#toEnglishText()
	 */
	@Override
	public String toEnglishText() {
		return ENGLISH_TEXT;
	}

}
