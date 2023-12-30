package com.kn.LinkedList;

	import java.util.*;

	public class Inbuilt_Methods
	{
		public static void main(String[] args)
		{
			LinkedList list1=new LinkedList();
			list1.add(10); //Used to add elements into ArrayList
			list1.add(20);
			list1.add(30);
			list1.add(40);
			list1.add(50);
			LinkedList list2=new LinkedList();
			list2.add("one");
			list2.add("Two");
			list2.add("Three");
			list2.add("Four");
			list2.add("Five");
			
			//*******************************
			list1.add(1,20); //add elements at specified index and move the elements to right 
							 // which are at after that index
			//*****************************
			list2.set(0,"One"); // update the element which is specified element
			
			//********************************
			 list1.indexOf(10);
			 list1.lastIndexOf(20); 
			//****************************
			 list1.addAll(list2);
			 
			 System.out.println(list1);
			 list2.addAll(list1);
			 System.out.println(list2);
			 System.out.println("**************************");
			 list1.addAll(2,list2);
			 System.out.println(list1);
			 
		}
	}

