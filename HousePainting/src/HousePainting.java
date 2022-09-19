import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//get inputs
		System.out.print("Please enter the cost per square foot:");
		double cost= sc.nextDouble();

		System.out.print("Please enter the length of the house:");
		double length= sc.nextDouble();
		
		System.out.print("Please enter the width of the house:");
		double width= sc.nextDouble();
		
		System.out.print("Please enter the height of the house:");
		double height= sc.nextDouble();
		
		System.out.print("Please enter the number of windows:");
		double numWindows= sc.nextDouble();
		
		System.out.print("Please enter the length of a window:");
		double lenWindow= sc.nextDouble();
		
		System.out.print("Please enter the width of a window:");
		double widWindow= sc.nextDouble();
		
		System.out.print("Please enter the number of doors:");
		double numDoors= sc.nextDouble();
		
		System.out.print("Please enter the length of a door:");
		double lenDoor= sc.nextDouble();
		
		System.out.print("Please enter the width of a door: ");
		double widDoor= sc.nextDouble();
		
		
		//do calculations
		double sqftPeak;
		double sqftNormal;
		double sqftWindows;
		double sqftDoors;
		double sqftTotal;
		double estimate;
		
		sqftPeak = 2*((length * width) + .5*(length*(height-width)));
		sqftNormal= 2*(length*width);
		sqftWindows= numWindows * (lenWindow*widWindow);
		sqftDoors= numDoors* (lenDoor*widDoor);
		sqftTotal = ((sqftPeak+sqftNormal))-(sqftWindows+sqftDoors);
		estimate = sqftTotal * cost;
		
		
		String strEstimate = String.format("Your estimate is %.0f",estimate);
		String strTotalsqft = String.format("Your total paintable surface area is %.0f", sqftTotal);
		
		//output results
		System.out.println(strTotalsqft+" square feet");
		System.out.println(strEstimate+ " dollars");
		
	}

}
