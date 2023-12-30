package com.kn.Practice_ArrayList;

import java.util.ArrayList;

public class Question1 
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Violet");
		al.add("Indigo");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		al.add("Orange");
		al.add("Red");
		System.out.println(al); //Prints data in List form
		for(String i: al)
		{
			System.out.print(i+" "); //Prints data in Normal form
		}
		System.out.println();
		//************************************
		
		al.add(0,"Pink");
		System.out.println(al);
		
		//************************************
		System.out.println(al.get(4));
		
		//************************************
		al.set(0, "Brown");
		al.set(1,"Black");
		System.out.println(al);
		
		//************************************
		al.remove(3);
		System.out.println(al);
	}
}
