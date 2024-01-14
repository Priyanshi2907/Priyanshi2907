package com.vowels;

import java.util.Scanner;

public class WhileLoop3 {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the digit:");
      int num=sc.nextInt();
      int originalnum=num;
      String reversednum="";
      while(num!=0) {
      int n=num%10;
      reversednum=reversednum+n;
      num=num/10;
      System.out.println(reversednum);
      }
      int newint=Integer.parseInt(reversednum);
      System.out.println("originalnum="+originalnum);

      System.out.println("newint="+newint);

      if (newint==originalnum) {
    	  System.out.println(newint+"is palindrome");
      }
      else {
    	  System.out.println(newint+"is not palindrome");
  
      }
    
      
      
    	  }
      }
//      456      45      4
//      n=6      n=5     n=4
//      s=6      s=65    s=654
//      num=45   num=4   num=0
//	


