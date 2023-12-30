package com.kn.Practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumbers 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);
		}
		ArrayList<Integer> al1=new ArrayList<Integer>();
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%2==0)
			{
				al1.add(al.get(i));
			}
		}
		System.out.println(al1);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for(int i=0;i<al.size();i++)
		{	int count=0;
			for(int j=1;j<=al.get(i);j++)
			{
				if(al.get(i)%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				al2.add(al.get(i));
			}
		}
		al.add(2, 10);
		al.set(1, 20);
		System.out.println(al);
		System.out.println(al2);
		sc.close();
	}
}
