package com.kn.Comparator;

public class Student implements Comparable<Student>
{
	int id;
	String name;
	double cgpa;
	public Student(int id, String name, double cgpa)
	{
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	@Override
	public int compareTo(Student s)
	{
		if(this.id>s.id)
		{
			return 1;
		}
		else if(this.id<s.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}
