package com.kn.Practice_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(129);
		al.add(119);
		al.add(159);
		al.add(109);
		al.add(159);
		al.add(199);
		al.add(179);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println("***************************");
		ArrayList al1=new ArrayList();
		al1.add("Dinesh");
		al1.add("Mahesh");
		al1.add("Suresh");
		al1.add("Akash");
		al1.add("Rajesh");
		al1.add("Jagadeesh");
		al1.add("Vignesh");
		Collections.sort(al1);
		System.out.println(al1);
		Collections.reverse(al1);
		System.out.println(al1);
	}
}
