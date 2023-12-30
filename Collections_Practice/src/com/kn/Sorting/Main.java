package com.kn.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main 
{
	public static void main(String[] args)
	{
		Student s1=new Student(439, "Dinesh", 81);
		Student s2=new Student(433, "Suleman", 80);
		Student s3=new Student(438, "Raju", 75);
		List<Student> lst=new ArrayList<Student>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		Collections.sort(lst,new Comparator<Student>()
		{


			@Override
			public int compare(Student o1, Student o2)
			{
				if(o1.id>o2.id)
				{
					return 1;
				}
				else if(o1.id<o2.id)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		});
		System.out.println(lst);
	}
}
