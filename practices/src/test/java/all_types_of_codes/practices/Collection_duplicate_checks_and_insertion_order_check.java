package all_types_of_codes.practices;

import java.util.*;
import java.io.*;
public class Collection_Array_List {

	static String[] abc = {"1","2","3","4","5","6","7","8","9","10","15"};
	static List<String> arraylist = Arrays.asList(abc);
	
	public static void main(String[] args) {
	
		for (String li:arraylist) {
			
			System.out.println("Arrays values = "+li);
		}
		
	}
	
}
