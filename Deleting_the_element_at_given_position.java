package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Deleting_the_element_at_given_position 
{
	
	public static void main(String[] args) 
	{
		
		System.out.println("Enter the array size");
		
		   Scanner scanner=new Scanner(System.in);
		   
		  int size    = scanner.nextInt();
		  int [] arr=new int [size];
		  
		  
		  System.out.println("Enter the array elements");
		  
		  for (int i = 0; i < arr.length; i++) 
		  {
			 arr[i]   =scanner.nextInt();
		}
		  
		 System.out.println("Enter the position of the element to be deleted");
		 
		 int pos   =scanner.nextInt();
		 
		   int temp   = arr[pos-1];
		 
		 for (int i = pos-1; i<size-1; i++) 
		 {
			arr[i]   =arr[i+1];
		}
		
		 
		 for (int i = 0; i < arr.length-1; i++) 
		 {
			System.out.print( arr[i]+" ");
		}
		 System.out.println();
		 System.out.println("the deleted element is");
		 System.out.println(temp);
	}

}
