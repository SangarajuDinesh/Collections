package com.kn.Practice_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Copy 
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
		ArrayList al1=new ArrayList();
				al1.add(129);
				al1.add(119);
				al1.add(159);
		Collections.copy(al1, al);;//copieng from al to al1
		System.out.println(al1);
	}
}
