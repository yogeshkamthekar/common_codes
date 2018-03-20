package all_types_of_codes.practices;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class Collection_Comparator    { 

	public static void main (String[] args)
	{
    Set s1 = new TreeSet(new mycompare());
    
    s1.add(10);
    s1.add(0);
    s1.add(20);
    s1.add(50);
    s1.add(5);
    
    for (Object a:s1)
    {
    	System.out.println("Output of descending sorting and fetching of value from set = " +a);
    }
	}
}
	
	class mycompare implements Comparator{
		
	public int compare(Object obj1,Object obj2)
	{
	Integer i1 = (Integer) obj1;
	Integer i2 = (Integer) obj2;
	if (i1 > i2)
	{
	return -1;
	}
	else if (i1 < i2)
	{
	return +1;
	}
	else { return 0; }
		
	}
		
	}
	
	
