package com.kn.HashSet;

import java.util.HashSet;

public class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(33);
		set.add(22);
		set.add(44);
		set.add(11);
		set.add(55);
		System.out.print(set);
	}
}
