package gov.va.test;

import org.junit.Test;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;

public class ScanGuiAnnotations {

	
	
	@Test
	public void findAllFieldAnnotations(){
		
		
		
		
		Reflections x = new Reflections("", new FieldAnnotationsScanner());
		
		System.out.print(true);
		
	}
	
	
	
}
