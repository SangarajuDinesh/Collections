package comkn.Traversing_Collection_Frameworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Traversing_List_Classes
{
	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(100);
		al.add("Dinesh");
		al.add(12.5);
		al.add('S');
		al.add(true);
		// 1. Using for Loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("**************************************");
		// 2. Using Enhanced For Loop
		for(Object i: al)
		{
			System.out.println(i+" ");
		}
		System.out.println("**************************************");
		// 3. Using Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("*************************************");
		// Backward Traversing Using for loop
		 for(int i=al.size()-1;i>=0;i--)
		 {
			 System.out.println(al.get(i));
		 }
		System.out.println("*************************************");
		// Backward Traversing Using Iterator
		 ListIterator<Object> itr1=al.listIterator(al.size());
		 while(itr1.hasPrevious())
		 {
			 System.out.println(itr1.previous());
		 }
		 
	}
}
