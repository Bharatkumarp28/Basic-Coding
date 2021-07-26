package basicPrograms;

import java.util.Scanner;

public class NextMultiple {

	public static void main(String[] args) {
		//Getting i/p using scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input: ");
		int input = sc.nextInt();
		sc.close();
		
		//Print the next multiple of 100
		System.out.println(NextMultiple.getNextMultipleOf100(input));

	}
	
	public static int getNextMultipleOf100(int number) {
		//Declaration
		int answer = 0;
		
		//Logic
		if(number < 0)
			return -1;
		answer = (((number/100) + 1) * 100);
		return answer;
	}

}
