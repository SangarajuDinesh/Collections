package com.kn.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Practice
{
	public static void main(String[] args) 
	{
		ArrayDeque<Object> ad=new ArrayDeque<Object>();
		ad.add(100);
		ad.addFirst("Dinesh");
		ad.add(200);
		ad.addLast("Kumar");
		ad.remove();
		Iterator<Object> it=ad.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(Object i:ad)
		{
			System.out.println(i);
		}
		System.out.println(ad);
	}
}
