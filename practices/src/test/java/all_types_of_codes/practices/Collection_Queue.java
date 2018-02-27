package all_types_of_codes.practices;

import java.util.PriorityQueue;

import java.util.Iterator;

public class Collection_Queue {

	static PriorityQueue<String> prq = new PriorityQueue<String>();
	
	static Iterator<String> itr = prq.iterator();
	
	public static void main(String [] args) {
		
	prq.add("fgfg");
	prq.add("dff");
	
	for(String a:prq)
	{
	
	System.out.println("value from priority queue = " +a);	
		
		
	}
	}
	
}
