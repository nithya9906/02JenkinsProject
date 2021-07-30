package com.revature.simpleJava;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class TestMain {
	 @Test
	    public void testInputIsEven(){
	        System.out.println("Executing test");
	        assertTrue(MainClass.checkIfInputIsAnEvenNumber(22)); // Assertion
	    }
}
