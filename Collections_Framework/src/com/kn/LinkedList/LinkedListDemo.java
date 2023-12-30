package com.kn.LinkedList;

import java.util.*;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList list1=new LinkedList();
		list1.add(10);
		list1.add(20.3);
		list1.add('D');
		list1.add("Dinesh");
		list1.add(true);
		list1.add(20); //Duplicates are allowed
		list1.add(20);
		list1.add(false);
		System.out.println(list1);
		System.out.println(list1.size());
	}
}

