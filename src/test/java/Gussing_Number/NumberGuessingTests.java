package Gussing_Number;

import org.junit.Test;

import junit.framework.TestCase;

public class NumberGuessingTests extends TestCase{
	private int sn; 
 	private int ct; 
 	 	
    public NumberGuessingTests(String testName){
        super(testName);
    }
    	
    protected void setUp() throws Exception{
 		super.setUp();
       	sn = 56;//Suppose secrectNumber is 56.
     	ct = 4; //The program will guess 4 times to arrive at the answer.     
     	System.out.println("Initialize variables");
	System.out.println("Test GitHub");
    }  

 	protected void tearDown() throws Exception{
 		super.tearDown();
 		sn = 0;
     	ct = 0;
     	System.out.println("Clear variables");
 	}
 	
 	@Test
    public void testNumberGuessing(){
 		System.out.println("Test case #1");
    	assertEquals("Count must be 4", ct, NumberGuessing.ng(sn));
    }
 	
 	@Test
    public void testNumberGuessing1(){
 		System.out.println("Test case #2");
 		ct = 5;
    	assertEquals("Count must be 4", ct, NumberGuessing.ng(sn));
    }
 	
 	@Test
    public void testFailedNumberGuessing(){
 		System.out.println("Test case #3");
 		assertNotSame("Count must be 4", ct, NumberGuessing.ng(sn));
    }
    
}
