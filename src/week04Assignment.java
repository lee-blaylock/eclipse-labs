package Projects;

public class week04Assignment {


	week04Assignment(String concatWord, String word, int n ,
			String fullName, String firstName, 
			String space,	String lastName, double[] myArray, 
			double doubleSum, double averageOfArray,
			double[] newArray, double average, 
			boolean isHotOutside, double temp, 
			double moneyInPocket)		{}

	//	 * create methods here and call below main
	 //Step 7 method 
	public static String concatWord(String word, int n)	{
		String concatWord = " ";
		for (int i = 0; i < n; i++)		{
			concatWord = word.repeat(n);
		}
		return concatWord;		}
	//step 8 method
public static String fullName(String firstName, String space,
			String lastName)	{
 String fullName = (firstName + space + lastName);
	return fullName;
}
// Step 9 method, called below main 
public static boolean isSumGreaterThan100(int[] ages, int sum)	{
	for (int age : ages)	{
		sum += age;
	}
	return sum > 100;
}
//Step 10 method
	public static double averageOfDoubleArray(double[] myArray, double doubleSum,
		 double averageOfMyArray, double length)	{
		myArray = new double[7];
		length = myArray.length;
		 doubleSum = 0;
		 averageOfMyArray = doubleSum / length;

		 for (int y = 0; y < myArray.length; y++)		{
			 			doubleSum +=  myArray[y];
		 }
		 return averageOfMyArray;
	}
	// Step 11 method
	public boolean isAverageGreaterThan(double[] myArray, double[] newArray, double average, 
			double length, double averageOfDoubleArray, double newArraySum)	{
		 newArraySum = 0;
		length = newArray.length;
	  
	  
	  for (double newArr : newArray)	{
		  newArraySum += newArr;
	  }
	  average = newArraySum / length;
	
		 return averageOfDoubleArray > average;
	}
	//Step 12 method
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)		{
int temp; 
isHotOutside = temp > 80;
moneyInPocket = 0;
boolean willBuyDrink = ((isHotOutside) && (moneyInPocket > 10.50));	

if (isHotOutside)	{
		if (moneyInPocket > 10.50)	{
			System.out.println(true);
		} else {
			System.out.println(false);		
	}
	}
	return willBuyDrink;
}
// Step 13 methoda
public static String error(String messageError) {
String asteriskLine = "********************";
String asterisk= "***";
messageError = "Install Not Successful. Missing required software";
//	System.out.println(asteriskLine);
//	System.out.println(asterisk+ "Error: " +
//				messageError+ asterisk);
//	System.out.println(asteriskLine);

return asteriskLine + asterisk + "Error: " + 
		messageError + asterisk + asteriskLine;
}
	public static void main(String[] args) {
	// Step 1 create ages array
	 
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int index = 0;
		int sum = 0;
		//* 1a. created variables to stand for first and last element of Array
		//  as well as sum variable  avgSum variable 
		int firstAge = ages[index];
		int lastAge = ages[ages.length - 1];
		int result = lastAge - firstAge;
		
		
		System.out.println("First element of array: " + firstAge);
		System.out.println("Last element of array: " + lastAge);
		System.out.println("Step 1a: " + result);
		/* Step 1b with VAR for 1st and last elements as well
		 * as sum and avg
		 */
		int[] moreAges		= {5, 7,  9, 11, 13, 15, 17, 19, 21};
		int firstMoreAge = moreAges[index];
		int lastMoreAges = moreAges[moreAges.length - 1];
		int newResult = lastMoreAges - firstMoreAge;
		int newSum = 0;
		
		
		System.out.println("Step 1b result: " +	newResult);

	for (int age : ages) 	{
			sum += age;
			}
	for (int more : moreAges) 	{
	newSum += more;
	}
	System.out.println("Step 1c: Average Age of int[] ages: " + 
			 (sum/ ages.length));
	System.out.println("Average Age of int[] moreAges: " +
			 (newSum / moreAges.length));
	
	/* 
	 * Step 2*/
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
/*
 *  step 2a*/
	int namesLengthSum = 0;

	for (String name : names)		{
		 namesLengthSum +=   name.length();
	}
	int averageNamesLength = namesLengthSum / names.length;
	System.out.println("Step 2a result: " +	(averageNamesLength));

	/*Step 2b concat names in string array*/
	String concatNames = String.join(" ", names);
	System.out.println("Step 2b result: " + concatNames);
	
	/*3 access last of array*/
	/* 
	 * enter name of array and use .length() -1 inside of square
	 * brackets*/
	System.out.println("Step 3 answer: " + (names[names.length-1]));
	
	//Step 4 how to access first element of array
	// using same array as above String[] names
	 // you can  use 0 inside the square brackets 
	 
	System.out.println("Step 4 answer: " + (names[0]));

	// Step 5 new int array with loop to add length of names

	int[] nameLengths = new int[names.length];
	
	for (int i = 0; i <names.length; i++)	{
		nameLengths[i] = names[i].length();
	}
	System.out.print("Step 5 int[] nameLengths: ");
	for (int x = 0; x < nameLengths.length; x++)	{
	System.out.print(nameLengths[x] + " ");
	}
	System.out.println();
	
	int nameLengthSum = 0;
	
for (int nameLength : nameLengths)		{
	 nameLengthSum += nameLength;
}
System.out.println("Step 6 sum: " + nameLengthSum);
	

// * 7. Write a method that takes a 
// * String, word, and an int, n, as arguments and 
// * returns the word concatenated to itself n times. 
// * (i.e. if I pass in “Hello” and 3, I expect the 
// * method to return “HelloHelloHello”).
String word = "Random";
int n = 3;	
	System.out.println("Step 7: "+ concatWord(word, n));

	//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
// method written in class above main and called below*/
	String firstName =  "Lee";
	String space = " ";
	String lastName = "Blaylock";
	
	System.out.println("Step 8 Full Name: " + 
	(fullName(firstName, space, lastName)));
	
	
//		9. Write a method that takes an array
//  of int and returns true if the sum of all the ints 
//  in the array is greater than 100. 
// * method created below class above main and called below
// * using int[] ages from previous question

System.out.println("Step 9 Boolean result using int[] ages: " + 
isSumGreaterThan100(ages, sum));
	



//	10. Write a method that takes an array of double and returns the average of all the elements in the array.
double[] myArray = new double[]{1.5, 2.5, 5.5, 7.5, 10.5, 12.5, 15.0};
double length = myArray.length;
double doubleSum = 0;

for (int y = 0; y < myArray.length; y++)		{
		doubleSum +=  myArray[y];
}
double averageOfDoubleArray = doubleSum / length;

System.out.println("Step 10 Avg of double[] array: " + 
		averageOfDoubleArray);
	

	
//	11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
double[] newArray = {12.5, 25.00, 37.50, 50.00, 62.50, 75.00};
double newArrayLength = newArray.length;
double newArraySum = 0;
	
for (double newArr : newArray)		{
	newArraySum += newArr;
}
double average = newArraySum / newArrayLength;
boolean isAverageGreaterThan = averageOfDoubleArray > average;

System.out.println("Step 11 Greater Than: " + isAverageGreaterThan );
	
	

//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
double temp = 98;
double moneyInPocket = 27.25;
 boolean isHotOutside = temp > 80;
 boolean willBuyDrink = ((isHotOutside) && (moneyInPocket > 10.50));	
	
	
	System.out.println("Step 12 : " + willBuyDrink);


//	13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
// i created a method for week 6 error(messageError)...this will print out and error message that
	//includes asterisks to separate out the message
	//This method solves the problem of knowing what error you are getting
String messageError =  "Install Not "
		+ "Successful. Missing required software";

System.out.println("Step 13: " + error(messageError));
}
}