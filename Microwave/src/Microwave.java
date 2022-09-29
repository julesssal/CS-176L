
public class Microwave {

	private int time;
	private int power=1;


	public void time(){
		time += 30;
		System.out.println("Time Button was pressed. Time is "+ time + " seconds");
	}
	
	public void power() {
		power++;
		
		if (power==3) {
			power = 1;
		}
		
		System.out.println("Power Button was pressed. Power level is "+ power);
		
	}
	
	public void start() {
		System.out.println("Cooking for " + time + " seconds" + " at level "+ power);
	}
	
	public void reset() {
		power = 1;
		time = 0;
		System.out.println("Reset Button was pressed. Power level is 1. Time is 0 seconds.");
	}
	
	
}
