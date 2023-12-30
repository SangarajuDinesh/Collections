package com.kn.ArrayList;

import java.util.*;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		list1.add(10);
		list1.add(20.3);
		list1.add('D');
		list1.add("Dinesh");
		list1.add(true);
		list1.add(20); //Duplicates are allowed
		list1.add(20);
		list1.add(false);
		System.out.println(list1);
		list1.add(2, 'K');
		list1.set(3, "DINESH");
		System.out.println(list1);
		System.out.println(list1.size());
		ListIterator<Object> itr=list1.listIterator(list1.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
	}
}
