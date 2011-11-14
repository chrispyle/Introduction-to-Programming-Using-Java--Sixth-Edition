import java.util.Scanner;  // Make the Scanner class available.

public class Interest2WithScanner {
   
   public static void main(String[] args) {
      
      Scanner stdin = new Scanner( System.in );  // Create the Scanner.
      
      double principal;  // The value of the investment.
      double rate;       // The annual interest rate.
      double interest;   // The interest earned during the year.
      
      System.out.print("Enter the initial investment: ");
      principal = stdin.nextDouble();
      
      System.out.print("Enter the annual interest rate (decimal, not percent!): ");
      rate = stdin.nextDouble();
      
      interest = principal * rate;       // Compute this year's interest.
      principal = principal + interest;  // Add it to principal.
      
      System.out.print("The value of the investment after one year is $");
      System.out.println(principal);
      
   } // end of main()
   
} // end of class Interest2With Scanner