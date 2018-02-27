package all_types_of_codes.practices;

import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.SortedMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Vector;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Queue;
import java.util.Set;
import java.io.*;

public class Collection_All_with_Addition_operations {

static int i;
static List lnklist = new LinkedList();
static List arraylist= new ArrayList();
static Set hashset = new HashSet();
static Set linhashset= new LinkedHashSet();
static Map map1 = new HashMap();
static SortedMap hashmap1 = new TreeMap();
static Map map2 =new LinkedHashMap();

public static void main (String args[]) throws NumberFormatException, IOException
{
/*BufferedReader input = new BufferedReader(new InputStreamReader(System.in));	
int n = Integer.parseInt(input.readLine());*/
String [] array = new String[5];

for (i=0;i<5;i++)
{
array[i] ="i";	

//------------------------------------------------------------------------------------------
//Link List to add element	
//------------------------------------------------------------------------------------------
lnklist.add(i);
//-----------------------------------------------------------------------------------------
//Array List to add element
//-----------------------------------------------------------------------------------------
arraylist.add(i);
//----------------------------------------------------------------------------------------
//Hashset and Linked Hashset to add element
//----------------------------------------------------------------------------------------
hashset.add(i);
linhashset.add(i);

//-----------------------------------------------------------------------------------------
//Map,Treemap,Linkedhashmap to Add Elements
//-----------------------------------------------------------------------------------------
map1.put("key"+i, i);
map2.put("Key"+i,i);
hashmap1.put("key"+i,i);
for (Object ls:lnklist) {
System.out.println("Linked List outcome = "+lnklist);
}
System.out.println("Array List outcome = "+arraylist);
System.out.println("Hashset outcome = "+hashset);
if (linhashset.contains(2))
{
System.out.println("Linked Hashset outcome = "+linhashset);
}
System.out.println("Map key outcome = "+map1.keySet());
System.out.println("Map value outcome ="+map1.values());
System.out.println("LinkedMap key outcome = "+map2.keySet());
System.out.println("LinkedMap value outcome ="+map2.values());
System.out.println("TreeMap key outcome = "+hashmap1.keySet());
System.out.println("TreeMap value outcome ="+hashmap1.values());

}


}
}
