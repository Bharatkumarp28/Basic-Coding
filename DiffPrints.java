package basicPrograms;

public class DiffPrints 
{

	public static void main(String[] args) 
	{
		float[] numbers = new float[5];
		for(int i = 0; i <5; i++)
			numbers[i] = i;

		System.out.println("=======PRINT==============");
		//Printing numbers using print
		System.out.print(numbers[0] + " ");
		System.out.print(numbers[1] + " ");
		System.out.print(numbers[2] + " ");
		System.out.print(numbers[3] + " ");
		System.out.print(numbers[4] + " ");
		
		System.out.println("\n");
		System.out.println("=======PRINTln==============");
		//Printing numbers using println
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		

	}

}
