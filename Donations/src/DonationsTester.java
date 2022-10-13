import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException {
		String typeOfDonation = null; 
		String data = null;
		Donations don = new Donations();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to process donations now? (enter ‘Yes’ to continue): ");
		if ((sc.next()).toLowerCase().equals("yes")) {
		
		
		
		try {
		      File donationsFile = new File("Donations.txt");
		      Scanner in = new Scanner(donationsFile);
		      
		      
		      while (in.hasNextLine()) 
		      {
		    	
		        data = in.nextLine();  
		        
		        String data2 = data.replaceAll("<", "");
		        
		        
		        if(data2.startsWith("i")) {
		        	typeOfDonation = "individual";
		        }
		        else if(data2.startsWith("b")) {
		        	typeOfDonation = "business";
		        }
		        else if(data2.startsWith("o")) {
		        	typeOfDonation = "other";
		        }
		        else if(data2.startsWith("E")) {
		        	break;
		        }
		        	        
		        data = data.replaceAll("[^0-9,-]", " ");
		        
		        data = data.replaceAll(" +", " ");
		        
		        double doubleData = Double.parseDouble(data);
		        
		        don.processDonations(typeOfDonation, doubleData);
		        
		      }
		      
		      in.close();
	    	} catch (FileNotFoundException e) 
				{
	    		System.out.println("An error occurred.");
	    		e.printStackTrace();
				}
		
		
		don.getStatistics();

	}
		else
		{
			System.out.println("Ending now without processing donations");
		}
		sc.close();
	}
}
