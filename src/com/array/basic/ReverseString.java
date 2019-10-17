package com.array.basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = scn.nextLine();
	//	String s="java is very easy";
		scn.close();
		char[] arr=s.toCharArray();
		String s1="";
		int i=0,j=0,k=0;
		while(j<arr.length)
		{
			while(j<arr.length && arr[j]!=' ')
			{
				j++;
			}
			k=j-1;
			String s2="";
			while(i<=k)
			{
				s2+=arr[k];
				k--;
			}
			s1+=s2;
			if(j<arr.length)
			{
				s1+=" ";
			}
			j++;
			i=j;
		}
		System.out.println(s1);
	}
}

