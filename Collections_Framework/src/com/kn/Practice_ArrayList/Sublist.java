package com.kn.Practice_ArrayList;

import java.util.ArrayList;

public class Sublist
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println(al.subList(0,5));
	}
}
