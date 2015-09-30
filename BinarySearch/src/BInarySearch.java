import java.util.Scanner;

public class BInarySearch 
{
	//Main method asks user to think of a number between a certain range
	public static void main(String[] args)
	{
		System.out.println("Think of a number between 1 and 1000000");
		guess(1 , 1000000);
		
	}
	//Recursive method that splits the inputed number based on whether the number 
	//less than or greater than
	public static void guess(int low, int high)
	{
		Scanner kb = new Scanner(System.in);
		String userInput;
		int midpoint;
		if(low == high)
		{
			System.out.println("Your number is: " + low);
			System.exit(0);
		}
		if(low < high)
		{
		 	midpoint = (low + high) / 2;
		 	System.out.println("Is this your number?" + midpoint );
		 	userInput = kb.next();
		 	if(userInput.equals("yes"))
		 	{
		 		System.out.println("Your number is: " + midpoint);
		 		System.exit(0);
		 	}
		 	if(userInput.equals("no"))
		 	{
		 		System.out.println("IS your number greater or less than :" + midpoint + " ?");
		 		userInput = kb.next();
		 		if(userInput.equals("greater"))
		 		{
		 			guess(midpoint+1, high);
		 		}
		 		if(userInput.equals("less"))
		 		{
		 			guess(low, midpoint -1);
		 		}
		 	}
		}
	}
	
}
