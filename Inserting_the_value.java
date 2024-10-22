package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Inserting_the_value 
{
  public static void main(String[] args) 
  {
	System.out.println("Enter the array size");
	
	   Scanner scanner=new Scanner(System.in);
	   
	  int size    = scanner.nextInt();
	  int [] arr=new int [size+1];
	  
	  
	  System.out.println("Enter the array elements");
	  
	  for (int i = 0; i < arr.length-1; i++) 
	  {
		 arr[i]   =scanner.nextInt();
	}
//	  System.out.println("Array has been formed out like this");
//	  System.out.println(Arrays.toString(arr));
	  
//	  System.out.println("Enter the array element to be inserted");
//	  
//	   int element      =scanner.nextInt();
	   
	   
//	   System.out.println("Enter the position to be updated");
//		  
//	   int pos      =scanner.nextInt();
//	  
//	  for (int i = size; i>=pos; i--) 
//	  {
//		   arr[size]  = arr[pos-1];
//	}
//	arr[pos-1]     = element;
//	
//	System.out.println("the updated array is");
//	  
////	System.out.println(Arrays.toString(arr));
//	
//	for (int i = 0; i < arr.length-1; i++) 
//	{
//		System.out.print(arr[i]+" ");
//	}
	  
}
}
