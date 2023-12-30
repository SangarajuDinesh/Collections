package com.kn.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDemo
{
	public static void main(String[] args)
	{
		Car c1=new Car("Toyota", 200000, 4);
		Car c2=new Car("Mercedes", 500000, 4);
		Car c3=new Car("Scoda", 300000, 6);
		ArrayList al=new ArrayList();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}
