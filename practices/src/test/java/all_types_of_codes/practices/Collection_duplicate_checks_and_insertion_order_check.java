package all_types_of_codes.practices;

import java.util.*;
import java.io.*;
public class Collection_duplicate_checks_and_insertion_order_check {

	static String[] abc = {"1","2","3","9","8","6","7","4","9","10","15"};
	static List<String> arraylist = Arrays.asList(abc);
//	static List<String> hashset = Arrays.asList(abc);
	static LinkedList<String> lst = new LinkedList<String>();
	static PriorityQueue<String> prq = new PriorityQueue<String>();
	static Set<String> hashset = new HashSet();
	static Set<String> linhashset= new LinkedHashSet();
	
	
	public static void main(String[] args) {
	
		for (String li:arraylist) {
			
			System.out.println("Arrays values = "+li);
			prq.add(li);
			hashset.add(li);
			linhashset.add(li);
		}
		
		for (String ab:hashset) {
			
		    System.out.println("Hashset values = " +ab);	
		}
		
		for (String as:prq) {
			
		    System.out.println("Priority queue values = " +as);	
		}
		
		for (String linhashset:linhashset) {
			
		    System.out.println("Linked Hashset values = " +linhashset);	
		}
		
	}
	
}
