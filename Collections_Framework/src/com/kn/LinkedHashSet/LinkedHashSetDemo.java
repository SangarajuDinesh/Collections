package com.kn.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
		public static void main(String[] args)
		{
			LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
			set.add(33);
			set.add(22);
			set.add(44);
			set.add(11);
			set.add(55);
			System.out.print(set);
		}
	}