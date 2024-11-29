package dsa_practice;

public class FindMinimumValue 
{
	public static void main(String args[]) 
	{
		// Initialize an array with integers
		int[] array = {7, 5, 3, 4, 1, 10};
		int minimumValue = array[0];
		
		// for Loop through the array and compare each element with the minimum value
		for(int i=0; i<array.length; i++) 
		{
			// if the element is less than the minimum value, update the minimumValue
			if(array[i] < minimumValue)
			{
				// update the minimum value
				minimumValue = array[i];
			}
		}
		// print the minimum value
		System.out.println("Minimum value in the array is: "+ minimumValue);
	}
}
