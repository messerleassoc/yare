package org.yare.conditionals.impl;

import org.yare.api.Condition;

/**
 * Less than (<) Condition Implementation 
 * 
 * @author bradmesserle
 * @since 2013
 */
public class LessThanConditionImpl implements Condition {

	/** The Constant ENGLISH_TEXT. */
	private static final String ENGLISH_TEXT = " less than ";
	
	/* (non-Javadoc)
	 * @see org.yare.api.Condition#evaluate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public <L, R> boolean evaluate(L leftValue, R rightValue) {
		
		if (leftValue.getClass().isAssignableFrom(Integer.class) && 
				rightValue.getClass().isAssignableFrom(Integer.class)) {
			
			Integer intLeftValue = (Integer) leftValue;
			Integer intRightValue = (Integer) rightValue;
			
			return intLeftValue < intRightValue;

		}
		
		return false;
	}

	/* (non-Javadoc)
	 * @see org.yare.api.Condition#toEnglishText()
	 */
	@Override
	public String toEnglishText() {
		return ENGLISH_TEXT;
	}


	

}
