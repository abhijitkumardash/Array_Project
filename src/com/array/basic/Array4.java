package com.array.basic;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		String s="java is very easy";
		String s1="";
		String[] arr=s.split(" ");
		Arrays.sort(arr);
		for(String str:arr)
		{
			s1+=str+" ";
		}
		s1=s1.trim();
		System.out.println(s1);
	}

}
