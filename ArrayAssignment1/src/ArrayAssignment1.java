
public class ArrayAssignment1 {

	public static void main(String[] args) {
		
		double[] values = {25.3 ,100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double largest = values[0];
		int numNegative = 0;
		
		for (int i = 0; i < values.length; i++)
		{
			
			if(values[i] > largest)
			{
				largest = values[i];
			}
			
			System.out.print(values[i] + " ");
			
			if (values[i]< 0)
			{
				numNegative++;
			}
			
		}
		
		System.out.println("\nThe largest element in the array is " + largest);
		System.out.println("There are "+ numNegative+ " negative numbers in the array");

	}

}
