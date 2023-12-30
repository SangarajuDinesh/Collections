package com.kn.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayQueueDemo
{
	public static void main(String[] args)
	{
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add("DINESH");
		ad.add(30.5);
		ad.add('D');
		ad.add('K');
		ad.add(true);
		ad.addFirst("Sangaraju");
		ad.addLast("Kumar");
		Iterator<Object> itr=ad.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(ad); // indexing will not work in ArrayDeque 
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
	}
}
