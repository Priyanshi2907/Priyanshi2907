package com.vowels;

public class BreakTest5 {

	public static void main(String[] args) {
		for(int i=2;i<100;i++) {
			for(int j=2;j<i;i++) {
//				System.out.println("i="+i);
//
//				System.out.println("j="+j);
			if(i%j==0) {
					break;
				}
			else{
					
					System.out.println(i);
				}

				}
				
			}
		}
	}


