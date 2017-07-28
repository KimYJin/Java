package myPackage;

//The class java.util.Arrays provides multiple (overloaded) static sort methods
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int []arr = {7,6,11,17,3,15,5,19,30,14};
		int []arr2 = {7,6,11,17,3,15,5,19,30,14};
		
		int min,temp;
		
		for(int i=0; i<arr.length-1; i++)
		{
			min = i;
			
			for(int j=i; j<arr.length; j++)
			{
				if(arr[min] > arr[j])
					min=j;
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}	
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		//The class java.util.Arrays provides multiple (overloaded) static sort methods
		Arrays.sort(arr2);
		for(int i=0; i<arr2.length; i++)
			System.out.print(arr2[i]+" ");
	}

}
