package com.kn.Sorting_Complex_Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortElementById 
{
	public static void main(String[] args) 
	{
		Student student1=new Student(439, "Dinesh", 81);
		Student student2=new Student(433, "Suleman", 80);
		Student student3=new Student(440, "Raju", 75);
		ArrayList al=new ArrayList();
		al.add(student1);
		al.add(student2);
		al.add(student3);
		System.out.println(al);
		SortElements s1=new SortElements();
		Collections.sort(al,s1);
		System.out.println(al);
		Collections.sort(al,new Comparator<Student>()
		{
			public int compare(Student s1,Student s2)
			{
				return s1.getName().compareTo(s2.getName());
			}
		});
		System.out.println(al);
	}
}
