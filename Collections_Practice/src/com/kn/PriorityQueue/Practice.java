package com.kn.PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class Practice
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(20);
		pq.add(10);
		System.out.println(pq);
		PriorityQueue<String> pq1=new PriorityQueue<String>();
		pq1.add("dinesh");
		pq1.add("kumar");
		pq1.add("raju");
		pq1.add("sanju");
		List<String> al=new ArrayList<String>();
		Iterator<String> it=pq1.iterator();
		while(it.hasNext())
		{
			al.add(it.next());
		}
		System.out.println(al);
		ListIterator<String> it1=al.listIterator(al.size());
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
		System.out.println(pq1.peek());
		System.out.println(pq1);
		Collections.sort(al);
		System.out.println(al);
	}
}
