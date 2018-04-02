import java.util.Scanner;

public class Fibonacci {
	
	protected static String sUserInput = "";
	
	
	public static void main(String[] args) {
		// Write a program that computes the Nth number in a Fibonacci sequence
		Run();
	}
	
	private static void Run()
	{
		int iUserNumber = 0; 
		
		Scanner inputScanner = new Scanner(System.in);
		
		while(iUserNumber >= 0)
		{
			UserOutput("Enter a Fibonacci sequence  index: or -1 to exit: ");
			
			sUserInput = inputScanner.next();
					
			iUserNumber = Integer.valueOf(sUserInput);
			
			if(iUserNumber >= 0)
			{
				UserOutput(String.valueOf(Formula.F(iUserNumber,0,1,0)));
			}
			else
			{
				UserOutput("Good Bye.");
			}
		}
		inputScanner.close();
	}
	
	public static void UserOutput(String Output)
	{
		System.out.println(Output);
	}

}
