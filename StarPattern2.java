package basicPrograms;

public class StarPattern2 
{

	public static void main(String[] args) 
	{
		/* Print the below pattern
			*
			* *
			* * *
			* * * *
			* * * * *
			* * * * * *
		*/
		for(int i = 1; i <= 6; i++) 
		{
			for(int j= 1; j <= i; j++) 
			{
				System.out.print("*");
				if(j != i)
					System.out.print(" ");
			}			
			System.out.println();
		}
		

	}

}
