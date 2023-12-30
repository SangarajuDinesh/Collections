package com.kn.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo 
{
	public static void main(String[] args)
	{
		PriorityQueue pq1=new PriorityQueue();
		pq1.add(10);
		pq1.add(20);
		pq1.add(5);
		pq1.add(30);
		pq1.add(40);
		System.out.println(pq1);
		System.out.println("*************************");
		PriorityQueue pq2=new PriorityQueue();
		pq2.add("ten");
		pq2.add("two");
		pq2.add("thirty");
		pq2.add("thousand");
		System.out.println(pq2);
	}
}
