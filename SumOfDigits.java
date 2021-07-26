package basicPrograms;

import java.util.Scanner;

public class SumOfDigits 
{

	public static void main(String[] args) 
	{
		//creating object
		SumOfDigits obj = new SumOfDigits();
		
		//Getting i/p using scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input");
		int input = sc.nextInt();
		sc.close();
		
		//Printing the sum
		System.out.print(obj.getSumofDigits(input));

	}
	
	public int getSumofDigits(int number) {
		// If the given value lies in between 10 and 99, 
		// return the sum of its digits. Example: if x = 81, return 9.
		
		//Declaration
		int sum = 0;
		
		//Logic
		if(number <10 || number >99)
			return 0;
		sum = (number/10) + (number%10);
		
		return sum;
	}

}
