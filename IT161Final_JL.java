
//-----------------------------------------------|
// CINCINNATI STATE | IT - 161 | SP24            |
//-----------------------------------------------|
// Abstract  : IT161 Test 1 Practical 		     |
// Professor : T. Gartland                       |
//     @author Jack Lorenz                       |         
//-----------------------------------------------|


//-----------------------------------------------
// Imports
//-----------------------------------------------
import java.io.*;
/**
 * Class Name  : IT161Final
 * purpose 	   : Solution to Test 1
 ------------------------------------------*/
public class IT161Final_JL 
{
	/**
	 * Method Name : MAIN METHOD
	 * purpose 	   : THIS IS WHERE THE PROGRAM STARTS
	 ------------------------------------------*/
	public static void main(String[] args)
	{		
		//Declare Variables
		int intYears = 0;
		double dblLoanAmount = 0;
		double dblAnnualInterestRate = 0;
		double dblMonthlyRate = 0;
		double dblMonthlyPayment = 0;
		double dblTotalPayment = 0;
		double dblRemainingBalance = 0;
		double dblInterest = 0;
		double dblPrincipleAmount = 0;
		int intIndex = 0;
		
        System.out.println("Your Name – Loan Amortization Schedule");
        System.out.println("Class – IT-161-###\n");
        
        System.out.println("Enter Loan Amount: ");
        dblLoanAmount = ReadFloatFromUser();

        System.out.println("Enter Number of Years: ");
        intYears = ReadIntegerFromUser();

        System.out.println("Enter Annual Interest Rate: ");
        dblAnnualInterestRate = ReadFloatFromUser();

        // Calculate monthly interest rate
        dblMonthlyRate = dblAnnualInterestRate / 1200;

        // Calculate monthly payment
        dblMonthlyPayment = dblLoanAmount * dblMonthlyRate /
                (1 - 1 / Math.pow(1 + dblMonthlyRate, intYears * 12));

        // Calculate total payment
        dblTotalPayment = dblMonthlyPayment * 12 * intYears;

        System.out.printf("Monthly Payment: %.2f\n", dblMonthlyPayment);
        System.out.printf("Total Payment: %.2f\n\n", dblTotalPayment);

        System.out.println("Payment#     Interest     Principal     Balance");

        dblRemainingBalance = dblLoanAmount;
        
        for (intIndex = 1; intIndex <= intYears * 12; intIndex+=1) 
        {
        	dblInterest = dblRemainingBalance * dblMonthlyRate;
        	dblPrincipleAmount = dblMonthlyPayment - dblInterest;
            dblRemainingBalance -= dblPrincipleAmount;
            if (dblRemainingBalance < 0) 
            {
            	dblRemainingBalance = 0; // To ensure the balance does not go negative
            }
            System.out.printf("%d            %.2f        %.2f       %.2f\n", intIndex, dblInterest, dblPrincipleAmount, dblRemainingBalance);
        }
    }

	
	
	
	/**
	 * Method Name : Read Float From user
	 * purpose 	   : Reads Float from user
	 ------------------------------------------*/
	public static float ReadFloatFromUser( )
	{
		float sngValue = 0;
		
		try
		{
			String strBuffer = "";	

			// Input stream
			BufferedReader burInput = new BufferedReader( new InputStreamReader( System.in ) ) ;

			// Read a line from the user
			strBuffer = burInput.readLine( );
			
			// Convert from string to float
			sngValue = Float.parseFloat( strBuffer );
		}
		catch( Exception excError )
		{
			System.out.println( excError.toString( ) );
		}
		

		// Return float value
		return sngValue;
	}


	
	/**
	 * Method Name : Read Integer From user
	 * purpose 	   : Reads Integer from user
	 ------------------------------------------*/
	public static int ReadIntegerFromUser( )
	{

		int intValue = 0;

		try
		{
			String strBuffer = "";	

			// Input stream
			BufferedReader burInput = new BufferedReader( new InputStreamReader( System.in ) ) ;

			// Read a line from the user
			strBuffer = burInput.readLine( );
			
			// Convert from string to integer
			intValue = Integer.parseInt( strBuffer );
		}
		catch( Exception excError )
		{
			System.out.println( excError.toString( ) );
		}
		

		// Return integer value
		return intValue;
	}
}
