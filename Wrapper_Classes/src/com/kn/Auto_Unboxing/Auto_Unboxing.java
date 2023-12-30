package com.kn.Auto_Unboxing;

import java.util.ArrayList;

public class Auto_Unboxing
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		//Auto-Boxing
		al.add(100);   //al.add(new Integer(100))
		al.add(100);
		al.add(100);
		al.add(100);
		
		//Auto-UnBoxing
		int i=al.get(0);  // (int)al.get(0)
		System.out.println(al);
		System.out.println(i);
	}
}
