package com.kn.Upcasting;

import java.util.*;

public class Upcasting
{
	public static void main(String[] args)
	{
		List l1=new ArrayList<Object>();
		l1.add(100);
		l1.add('D');
		l1.add(15.5);
		l1.add("Dinesh");
		System.out.println(l1);
		
		List l2=new LinkedList<Object>();
		l2.add(100);
		l2.add('D');
		l2.add(15.5);
		l2.add("Dinesh");
		System.out.println(l2);
		
		Queue q1=new ArrayDeque<Object>();
		q1.add(100);
		q1.add('D');
		q1.add(15.5);
		q1.add("Dnesh");
		System.out.println(q1);
		
		Queue q2=new PriorityQueue();
		q2.add(10);
		q2.add(20);
		q2.add(30);
		q2.add(40);
		System.out.println(q2);
	}
}
