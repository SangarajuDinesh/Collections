package com.kn.Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reverse_an_Array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String arr[]=input.split(" ");
		List<String> al=Arrays.asList(arr);
		Collections.reverse(al);
		System.out.println(al);
		sc.close();
		
	}
}
