package all_types_of_codes.practices;

import java.util.LinkedList;

public class Collection_LinkedList {

public static void main(String[] args)
	{

	LinkedList<String> lst = new LinkedList<String>();
	
	LinkedList<Integer> lstint = new LinkedList<Integer>();
	
	lst.add("abc");
	lst.add("34df");
	lstint.add(123);
	lstint.add(454);
	
	for (String s:lst)
	{
		System.out.println("values from list " +s);
	}
	
	for (int a:lstint)
	{
		System.out.println("values from list "+a);
		
	}
	}
	
	}
