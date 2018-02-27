package all_types_of_codes.practices;

import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.SortedMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Vector;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Queue;
import java.util.Set;
import java.io.*;

public class collection_iterators {
	
	static List<String> lst = new ArrayList<String>();
	static Iterator itr = lst.iterator();

	public static void main (String[] args) {

		
        lst.add("test");
        lst.add("test1");
        lst.add("test2");
        
     
        for (String s:lst)
        {
        	
        System.out.println("value in Arraylist = " +s);	
        }
        
      /*  while (itr.hasNext())
        {
        
         	
            System.out.println("value in Arraylist = " +itr.next());	
        }	*/
	}




}
