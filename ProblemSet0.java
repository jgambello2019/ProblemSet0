public class ProblemSet0
{
/**
* Various function problems
* @author Jack Gambello
* @version 1.0
*/
	/**
	 * Takes base 10 unt and returns binary string
	 * @param n for the base 10 number >= 0 that will be converted
	 * @return string of binary result
	 */
	 public static String toBinary(int n)
	 {
	 	if (n == 0)
	 		return "0000";
	 	String remainders = "";
	 	while (n != 0)
	 	{
	 		int intToChange = n % 2;
	 		remainders += String.valueOf(intToChange);
	 		n = n / 2;
	 	}
	 	String binary = "";
	 	for (int i = remainders.length() - 1; i >= 0; i--)
	 	{
	 		binary += remainders.substring(i, i + 1);
	 	}
	 
	 	return binary;
	
	 }

	/**
	 * rolls a die with n sides and returns result
	 * @param n for the amount of sides on the die
	 * @return int value of side
	 * @return 0 if n is not a valid amount of sides
	 */
	 public static int rollDie(int n)
	{
		if (n <= 0)
			return 0;
		else
			return (int)(Math.random() * n + 1);
	
	}
	
	/**
	 * prints multiple table
	 * @param n for amount of rows
	 * @return string of the multiple table
	 */
	public static String multiples(int n)
	{
		if (n == 0)
			return "0";
		String output = "";
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				output += (String.valueOf(j * i) + "  ");	
			
			}
			if (i != n)
				output += "\n";
			
		
		}
		return output;
		
	}
	
	
	/*
	*Takes an int, flips the digits in the ones and tens places
	* @param n for the number that the swapping will be performed on 
	* @return int with ones and tens flipped
	*/
	public static int swap(int n)
	{
		if(n / 10 == 0)
			return (n * 10);
			
		int toSubtract = ((n % 10) + (((n/10) % 10) * 10));
		int toAdd = (((n % 10) * 10) + (((n/10) % 10)));
		n = n - toSubtract + toAdd;
		return n;
	
	
	
	}
	

	/**
	 * prints 3 possible interpretations of xor
	 */
	public static void xor()
	{
		System.out.println("X != Y");
		System.out.println("(!X && Y) || (!Y && X)");
		System.out.println("(X || Y) && (!Y || !X)");
		
	}
	
	/**
	 * prints n amount of *'s
	 * @param n for of amount *
	 * @return string of *'s
	 */
	public static String printStars(int n)
	{
		String output = "";
		for(int i = 1; i <= n; i ++)
			output += "*";
		return output;
	}
	
	/**
	 * prints n amount of rows of *'s
	 * amount of * matches the row on
	 * Example: first row will have one *, eighth row would have 8 *s
	 * @param n for the amount of rows
	 * @return string of *'s
	 */
	 public static String printTriangle(int n)
	 {
	 	String output = "";
	 	for(int i = 1; i <= n; i++)
	 	{
	 		output += printStars(i);
	 		if(i != n)
	 			output += "\n";
	 	}
	 	return output;
	 	
	 }
	 
	 /**
	 * prints n amount of rows of *'s
	 * amount of * matches the row on
	 * Example: first row will have one *, eighth row would have 8 *s
	 * RECURSIVELY
	 * @param n for the amount of rows
	 * @return string of *'s
	 */
	 public static String printRecursive(int n)
	 {
	 	if( n <= 0 ) 
	 		return "";
    	String output = printRecursive(n - 1);
    	if (output.length() > 0)
    		System.out.println(output);
    	output = output + "*";
 
	 	
	 	return output;
	 }
	 		
	 /**
	 * prints n amount of rows of *'s
	 * amount of * matches the row on
	 * Example: first row will have one *, eighth row would have 8 *s
	 * Prints in a reverse order than printRecursive; highest number first
	 * RECURSIVELY
	 * @param n for the amount of rows
	 * @return string of *'s
	 */
	 public static String printRecursive2(int n)
	 {
	 		if(n <= 0) 
	 			return "";
	 		String output = printStars(n);
	 		if(n == 1)
    			System.out.print(output);
    		else
    			System.out.println(output);
    		output = printRecursive2(n - 1);
	 		
	 		return output;
	}

	/**
	* Takes a non negative int and adds the value of each individual digit in the int
	* @param n for the number of which the digits will be added together
	* @return sum of digits in int
	*/
	public static int sumDigits(int n)
	{
		if(n < 0)
			return 0;
		int output = 0;
		String stringNum = String.valueOf(n);
		for(int i = 0; i < stringNum.length(); i++)
			output += Integer.parseInt(stringNum.substring(i, i + 1));
		return output;
	}
	
	/**
	* Takes an int and returns true if it is divisible by 3, false if not
	* doesn't use modulo division
	* @param n for the number that will be checked to see if it is divisible by 3
	* @return boolean true if int is divisible by 3, false if not
	*/
	public static boolean isDivisible(int n)
	{
		if(n < 0)
			n = n * -1;
			
		if(sumDigits(n) == 0)
			return true;
		else if(sumDigits(n) < 3)
			return false;
		return isDivisible(n - 3);
	}



	/**
	* Prints a diamond shape with *'s
	* The diamond will have n *'s per edge
	* @param n will state the amount of stars per edge
	*/
	public static void printMoreStars(int n)
	{
		for(int i = 1; i <= n * 2; i += 2)
		{
			for(int s = (n*2-1 - i) / 2; s >= 0; s--)
				System.out.print(" "); 
			System.out.println(printStars(i));
		}
		for(int i = n * 2 - 3; i >= 0; i -= 2)
		{
			for(int s = (n*2-1 - i) / 2; s >= 0; s--)
				System.out.print(" "); 
			System.out.println(printStars(i));
		}
				

	}
	
	/**
	* Takes an amount of cents and gives the ideal combination of coins
	* @param n represents the cent amount
	* @return string of coin combination
	*/
	public static String leastCoins(int n)
	{
		if(n >= 0)
		{
			String output = "";
			output += "Quarters: " + n / 25 + "\n";
			n = n % 25;
			output += "Dimes: " + n / 10 + "\n";
			n = n % 10;
			output += "Nickels: " + n / 5 + "\n";
			n = n % 5;
			output += "Pennys: " + n + "\n";
		
			return output;
		}
		else
			return ("Can't have a negative coin value");
	}
	

	/**
	* Takes an amount of cents and prints every possible combination of coins
	* @param j represents the cent amount
	*/
	public static void coins(int j)
	{
		if (j >= 0)
		{
			int p = 0;
			int n = 0;
			int d = 0;
			int q = 0;
			int combinationCounter = 0;
			for(q = 0; q * 25 <= j ; q++)
			{	
				for(d = 0; d * 10 <= j - (q * 25); d++)
				{
					for(n = 0; n * 5 <= j - ((d * 10) + (q * 25)); n++)
					{
						p = j - ((q * 25) + (d * 10) + (n * 5));
						combinationCounter += 1;
						System.out.println("Quarters: " + (q));
						System.out.println("Dimes: " + (d));
						System.out.println("Nickels: " + (n));
						System.out.println("Pennys: " + p + "\n");
					}
		
				}
		
			}
			System.out.println("Combination Count: " + combinationCounter);
		}
		else
			System.out.println("Can't have a negative coin value");
		
			
	}















}








































