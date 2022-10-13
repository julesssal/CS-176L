

public class Donations {

	int numIndividual; //The number of individual donations
	double amtIndividual; //The total of all individual donations
	
	int numBusiness; //The number of business donations
	double amtBusiness; //The total of all business donations
	
	int numOther; //The number of other donations
	double amtOther; //The total of all other donations
	
	
	public void processDonations(String cat, double donation) {
		
		if( cat =="individual") {
			numIndividual++;
			
			if(donation<0)
			{
				numIndividual--;
			}
			
			amtIndividual= amtIndividual + donation;
		}
		
		if( cat =="business") {
			numBusiness++;
			
			if(donation<0)
			{
				numBusiness--;
			}
			
			amtBusiness= amtBusiness + donation;
		}
		
		if( cat =="other") {
			numOther++;
			
			if(donation<0)
			{
				numOther--;
			}
			
			amtOther= amtOther + donation;
		}
		
		
	}
	
	public void getStatistics() {
		System.out.println("Individual: #" + numIndividual + " $" + amtIndividual);
		System.out.println("Business: #" + numBusiness + " $" + amtBusiness);
		System.out.println("Other: #" + numOther + " $" + amtOther);
	}
}
