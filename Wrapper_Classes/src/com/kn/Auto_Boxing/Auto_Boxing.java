package com.kn.Auto_Boxing;
import java.util.*;
public class Auto_Boxing
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		//Auto-Boxing
		al.add(100);   //al.add(new Integer(100))
		al.add(100);
		al.add(100);
		al.add(100);
		System.out.println(al);
	}
}
