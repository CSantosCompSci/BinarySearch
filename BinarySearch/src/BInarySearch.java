import java.util.Scanner;

public class BInarySearch 
{

	public static void main(String[] args)
	{
		//int userInput;
		//Scanner kb = new Scanner(System.in);
		System.out.println("Think of a number between 1 and 1000000");
		/*
		userInput = kb.nextInt();
		if(userInput< 0 || userInput > 1000000)
		{
			System.out.println("Invalid number entered!!!");
			System.exit(0);
		}
		*/
		guess(1 , 1000000);
		
	}
	
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
