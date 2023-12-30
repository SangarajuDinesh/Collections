package com.kn.Practice_ArrayList;
import java.util.*;
public class Sorting
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
	}
}
