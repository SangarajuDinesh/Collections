package com.kn.Comparator;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	public class StudentDemo
	{
		public static void main(String[] args)
		{
			Student s1=new Student(439, "Dinesh", 81);
			Student s2=new Student(433, "Suleman", 78);
			Student s3=new Student(438, "Raju", 73);
			
			System.out.println(s1); //if we print it without toString method it will print Package_Class_Hashcode
			System.out.println(s2);
			System.out.println(s3);
			
			System.out.println("***********************************");
			ArrayList al=new ArrayList();
			al.add(s1);
			al.add(s2);
			al.add(s3);
			System.out.println(al);
			
			Collections.sort(al,new Comparator<Student>()
			{
				public int compare(Student s1,Student s2)
				{
					if(s1.id>s2.id)
					{
						return 1;
					}
					else if(s1.id<s2.id)
					{
						return -1;
					}
					else
					{
						return 0;
					}
				}
			});
			System.out.println(al);
		}
	}
