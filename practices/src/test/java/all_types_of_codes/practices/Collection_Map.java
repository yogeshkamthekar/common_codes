package all_types_of_codes.practices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collection_Map {

	static Map<Integer,String> map1 = new HashMap<Integer,String>();
	//static Iterator<Integer,String> itr = map1.values();
	
	public static void main (String[] args)
	{
		
	map1.put(12121, "egdfgdgfd");
	map1.put(2123123121, "123123131");
	
	System.out.println("one value fetched from map = " +map1.get(12121));
	for (Map.Entry m:map1.entrySet())
	{
	System.out.println("value fetched from map for anpother variation = " +m.getValue());
		
	}
}
}
