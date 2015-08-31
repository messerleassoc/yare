package org.yare.api;

public interface Condition {

	/**
	 * Evaluate condition from left side by the right side
	 * L == R
	 * @param leftValue
	 * @param object
	 * @return boolean result
	 */
	<L,R> boolean evaluate(L leftValue, R object);
	
	/**
	 * Return the English text of the condition
	 * @return String
	 */
	String toEnglishText();
	
}
