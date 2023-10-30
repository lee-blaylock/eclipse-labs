package Projects;

import java.util.HashMap;
import java.util.Map;

public class practice 	{

	
	public static void main(String args[]) {
	
		System.out.println("JavaDictionary");
	
		/*
		 * Map<(K,V)> K is the key, V is the value
		 */
				Map<String, String>javaDictionary=new HashMap<>();
				
		
			
			javaDictionary.put("array", "A Java Object that contains a "
					+ "collection of data items, "
					+ "all of the same type, accessed by an integer index.");
			javaDictionary.put("API",  "Application Programming Interface.  "
					+ "The way that a programmer writing an application "
					+ "will access the behavior and state of classes and objects.");
			javaDictionary.put("autoboxing" ,  "The automatic "
					+ "conversion between reference and primitive types.");
			javaDictionary.put("primitive type" ,  "A Java datatype in which the "
					+ "variable's value is of the appropriate size and format for its type.  "
					+ "There are 8 primitive datatypes in Java.");
			javaDictionary.put("reference type" ,  
					"A variable data type in which the variable's "
					+ "value is an address.");
			javaDictionary.put("stream " , "A byte-stream of data "
					+ "that is sent from a sender to a receiver.");
			javaDictionary.put("class" , "A type that defines the "
					+ "implementation of an object.");
				System.out.println(("Number of entries in javaDictionary: " + 
					javaDictionary.size()));
			System.out.println(javaDictionary);
			}		

}
	
		

	
			
			


		
		
		
		
		
/*		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		int num5 = in.nextInt();
		System.out.println(squaredList(num1,num2,num3,num4,num5));
	}

	static List<Integer> squaredList(int num1, int num2, int num3, int num4, int num5) {
		// TODO Auto-generated method stub
		 int numbers[] = new int[5];
		    numbers[0] = num1;
		    numbers[1] = num2;
		    numbers[2] = num3;
		    numbers[3] = num4;
		    numbers[4] = num5;
		    
		    int squared = 0;
		  List<Integer> squaredNums = new ArrayList<Integer>(numbers.length);
		   for (int i=0; i <numbers.length; i++) {
		       int result = (numbers[i]) * (numbers[i]);
	          
			squaredNums.add(result);
	             }
	             
	        Return squaredNums;*/
		
			