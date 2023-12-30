package com.kn.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Array_List
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Object> al=new ArrayList<Object>();
		List<Object> lst1= new ArrayList<Object>();
		for(int i=0;i<5;i++)
		{
			al.add(sc.nextInt());
			al.add(sc.next());
			lst1.add(al.get(i));
		}
		System.out.println(al);
		
		Iterator<Object> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ListIterator<Object> itr1=al.listIterator(al.size());
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		System.out.println(al.contains(10));
		System.out.println(al.containsAll(lst1));
		System.out.println(al);
		Collections.copy(lst1, al);
		System.out.println(lst1);
		System.out.println(lst1.isEmpty());
		System.out.println(lst1.remove(2));
		System.out.println(lst1.removeAll(lst1));
		System.out.println(lst1);
		System.out.println(al.subList(2,al.size()));
		System.out.println(al.subList(2,4));
		Collections.reverse(al);
		System.out.println(al);
		sc.close();
	}
}
