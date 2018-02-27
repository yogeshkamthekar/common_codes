package all_types_of_codes.practices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection_Hashset {

	static HashSet<String> hsh = new HashSet<String>();
	static Iterator<String> itr = hsh.iterator();
	static LinkedHashSet<String> lnkhsh = new LinkedHashSet<String>();
	
	public static void main (String[] args)
	{
	
		hsh.add("yogesh");
		hsh.add("iuj");
		hsh.add(null);
		hsh.add("123");
		hsh.add("yogesh");
		
		lnkhsh.add("yogesh");
		lnkhsh.add("iuj");
		lnkhsh.add(null);
		lnkhsh.add("123");
		lnkhsh.add("yogesh");
		
		for (String h:hsh)
		{
		
			System.out.println("valus from HAshset = "+h);
			
		}	
		
		for (String h:lnkhsh)
		{
		
			System.out.println("valus from LinkedHashset = "+h);
			
		}	
		
	}
	
	
}
