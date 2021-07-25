package basicPrograms;

import java.util.Scanner;

public class AgeValidation 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		boolean isAgeValid = false;
		do 
		{
			System.out.println("Enter the age: ");
			int age = sc.nextInt();
			
			if(age <= 0 || age > 100)
				System.out.println("Age in invalid! Enter valid Age.");
			else
			{
				System.out.println("Age in valid!");
				isAgeValid = true;
			}
		}while(isAgeValid == false);
		sc.close();
		

	}

}
