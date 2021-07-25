package basicPrograms;

public class TwoDimentionalArray 
{

	public static void main(String[] args) 
	{
		/*
		 * [1 2]
		 * [3 4]
		 * [5 6]
		 * 
		 * [1.0 2.0]
		 * [2.0 3.0]
		 * [3.0 4.0]
		 * [4.0 5.0]
		 * 
		 */
		int sum = 1;
		//First way of initializing
		int numbers[][] = new int[3][2];
		
		//Second way of initializing
		float evenNumbers[][] = new float[][] {{1,2},{2,3},{3,4},{4,5}};
		

		for(int i = 0; i < 3; i++) {
			for(int j=0; j< 2; j++) 
			{
				numbers[i][j]= sum;
				sum += 1;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0 ; j < 2; j++)
				System.out.print(numbers[i][j] + " ");
			System.out.println();
		}
		
		System.out.println("====================================");
		for(int i = 0; i < 4; i++) {
			for(int j = 0 ; j < 2; j++)
				System.out.print(evenNumbers[i][j] + " ");
			System.out.println();
		}
		

	}

}
