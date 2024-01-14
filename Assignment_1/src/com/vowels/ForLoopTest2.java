package com.vowels;

import java.util.Scanner;
public class ForLoopTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc =new Scanner(System.in);

		  System.out.println("Enter the no:");
	 	  int x=sc.nextInt();
          
          int result=1;
          for(int i=1;i<=x;i++) {
        	 result=result*i; 
          }
          System.out.println(result);
	}

}
