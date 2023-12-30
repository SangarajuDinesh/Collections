package comkn.Traversing_Collection_Frameworks;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Traversing_ArrayDeque
{
	public static void main(String[] args)
	{
		ArrayDeque<Object> ad=new ArrayDeque<Object>();
		ad.add(200);
		ad.add(300);
		ad.addFirst(100);
		ad.addLast(400);
		
		// Backward Traversing using Iterator
		Iterator<Object> itr=ad.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
