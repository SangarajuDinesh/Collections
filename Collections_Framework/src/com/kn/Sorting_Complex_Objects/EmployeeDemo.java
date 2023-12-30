package com.kn.Sorting_Complex_Objects;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
public class EmployeeDemo
{
	public static void main(String[] args)
	{
		Employee emp1=new Employee(439, "Dinesh", 30000);
		Employee emp2=new Employee(433, "Suleman", 28000);
		Employee emp3=new Employee(438, "Raju", 35000);
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		System.out.println("*************Before sorting*****************");
		System.out.println(al);
		System.out.println();
		
		
		System.out.println("*************After Sorting by emp_Id In Ascending**************");
		Collections.sort(al,new Comparator<Employee>()
		{
			public int compare(Employee e1,Employee e2)
			{
				if(e1.getEmp_id()>e2.getEmp_id())
				{
					return 1;
				}
				else if(e1.getEmp_id()<e2.getEmp_id())
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
		System.out.println();
		
		
		System.out.println("***************After Sorting by Emp_Name In Ascending order****************");
		Collections.sort(al,new Comparator<Employee>()
		{
			public int compare(Employee e1,Employee e2)
			{
				return e1.getEmp_name().compareTo(e2.getEmp_name());
			}
		});
		System.out.println(al);
		System.out.println();
		
		System.out.println("****************After sorting by emp_salary in Ascending order**************");
		Collections.sort(al,new Comparator<Employee>()
		{
			public int compare(Employee e1,Employee e2)
			{
				if(e1.getSalary()>e2.getSalary())
				{
					return 1;
				}
				else if(e1.getSalary()<e2.getSalary())
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
		System.out.println();
		
		System.out.println("************** After sorting by Emp_Id in Descending order****************");
		Collections.sort(al,new Comparator<Employee>()
		{
			public int compare(Employee e1,Employee e2)
			{
				if(e1.getEmp_id()<e2.getEmp_id())
				{
					return 1;
				}
				else if(e1.getEmp_id()>e2.getEmp_id())
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
		System.out.println();
		
		System.out.println("**************** After sorting the Emp_Name in Descending order***********");
		Collections.sort(al,new Comparator<Employee>()
		{
			public int compare(Employee e1,Employee e2)
			{
				if(e1.getEmp_name().compareTo(e2.getEmp_name())<0)
				{
					return 1;
				}
				else if(e1.getEmp_name().compareTo(e2.getEmp_name())>0)
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
		System.out.println();
		
		System.out.println("************** After sorting by Salary in Descending order***********");
		Collections.sort(al,new Comparator<Employee>()
		{
			public int compare(Employee e1,Employee e2)
			{
				if(e1.getSalary()<e2.getSalary())
				{
					return 1;
				}
				else if(e1.getSalary()>e2.getSalary())
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
		System.out.println();
	}
}
