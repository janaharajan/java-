//MAXIMUM AND MINIUM NUMBER IN A ARRAY 
import java.util.Scanner;
public class array_max_min{
	public static void main(String[] args){
	
		int size,i;
		int array_value[]	=	new int[30];
		Scanner sc	=	new Scanner(System.in);
		System.out.print("\nSize of the array is :");
		size	= sc.nextInt();
			System.out.print("Enter the ARRAY value's are:");
			for(i=0;i<size;i++)
			{
				System.out.print("\n");
				array_value[i]	= sc.nextInt();
			}
			System.out.print("ARRAY value's are:");	

			for(i=0;i<size;i++)
			{	
				System.out.print("	"+array_value[i]);
					
			}
			
				int maximum=array_value[0];
				
				for(i=0;i<size;i++)
				{
					if(array_value[i]	>	maximum	)
						maximum	= array_value[i];
				}
				System.out.print("\nmaximum is "+maximum);
							
							int minimum=array_value[0];
							
							for(i=0;i<size;i++)
							{
								if(array_value[i]	<	minimum)
									minimum		=	array_value[i]
							}
				System.out.print("\nminimum is "+minimum);			
			}
	
}
