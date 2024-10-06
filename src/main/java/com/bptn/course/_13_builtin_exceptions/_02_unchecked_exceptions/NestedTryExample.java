package com.bptn.course._13_builtin_exceptions._02_unchecked_exceptions;

public class NestedTryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] nums= {1,2,3,4};
			int division=0;
			String text=null;
			
			try {
				int result=10/0;
				System.out.println("The result is: "+result);
			}catch(ArithmeticException e) {
				System.out.println("An arithmatic exception occured: "+e.getMessage());
				
				
			}
			try {
				System.out.println("The length of string is: " + text.length());

			} catch (NullPointerException e) {
				System.out.println("A nullpointer exception occurred: " + e.getMessage());
			}
			try {
				System.out.println(nums[4]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("An Array Index Out Of Bounds Exception occured: " + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("A general exception occured: " + e.getMessage());
			
		}
		

	}

}
