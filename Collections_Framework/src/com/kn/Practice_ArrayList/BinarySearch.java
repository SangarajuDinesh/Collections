package com.kn.Practice_ArrayList;

import java.util.*;

public class BinarySearch 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Dinesh");
		al.add(200);
		al.add("Mahesh");
		al.add(300);
		al.add("Suresh");
		al.add(400);
		if(al.contains("dinesh"))
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}
