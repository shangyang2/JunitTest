/**
 * 
 */
package test;

import org.junit.Test;

/**
 * @author leyang
 *
 */
public class Demo4_Variable_parameter {
	
	@Test
	public void testSum(){
		sum(1,2,3,4,5,6);
	}
	
	public void sum(int ...nums){
		
		int sum = 0;
		
		System.out.println(nums.length);
	}
}
