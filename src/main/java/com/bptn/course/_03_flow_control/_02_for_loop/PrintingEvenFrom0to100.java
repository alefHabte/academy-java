package com.bptn.course._03_flow_control._02_for_loop;

public class PrintingEvenFrom0to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=100; i+=2) {
			System.out.println(i);
			
		}
		//Another approach
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
