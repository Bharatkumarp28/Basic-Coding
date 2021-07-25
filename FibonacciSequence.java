package basicPrograms;

import java.util.Scanner;

public class FibonacciSequence 
{
	public static void main(String[] args) 
	{
		int arrayLength;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		arrayLength = sc.nextInt();
		sc.close();
		
		FibonacciSequence obj  = new FibonacciSequence();
		obj.getFibacci(arrayLength);
	}
	
	public void getFibacci(int arrayLength) 
	{		
		int[] series = new int[arrayLength];
		series[0] = 0;
		series[1] = 1;
		
		for(int i = 2; i < series.length; i++) 
		{
			series[i] = series[i-1] + series[i-2];			
		}
		
		//Different forms of array print
		for(int i = 0; i < arrayLength; i++) 
			System.out.println(series[i]);
		
		for(int i = 0; i < series.length; i++)
			System.out.println(series[i]);
		
		for(int a: series) 
			System.out.println(a);
		
		for(var i: series)
			System.out.println(i);
	}
	
		
}