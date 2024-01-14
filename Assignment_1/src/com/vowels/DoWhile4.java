package com.vowels;

public class DoWhile4 {

	public static void main(String[] args) {
		int n=10;
		int[] arr=new int[n];
		arr[0]=0;
		arr[1]=1;
		int i=2;
		do {
		arr[i]=arr[i-1]+arr[i-2];
			i=i+1;
	    }while(i<n);
		
        System.out.println("Frist 10 numbers of fibbonacci series :");
        for (i=0;i<n;i++) {
          System.out.println(arr[i]+"");
        }
	}

}

