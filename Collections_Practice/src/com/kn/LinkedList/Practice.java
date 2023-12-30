package com.kn.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String arr[]=input.split(" ");
		LinkedList lst=new LinkedList();
		for(int i=0;i<arr.length;i++)
		{
			lst.add(arr[i]);
		}
		lst.add(" ");
		lst.removeFirst();
		System.out.println(lst);
		sc.close();
	}
}
