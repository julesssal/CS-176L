import java.util.*;
public class Medals
 {
	 public static void main(String[] args)
	 
	 {
	 final int COUNTRIES = 8;
	 final int MEDALS = 3;
	 
	 ArrayList<String> countries= new ArrayList<String>(COUNTRIES);
	 ArrayList<ArrayList<Integer>> counts = new ArrayList<ArrayList<Integer>>(MEDALS);
	 
	 ArrayList<Integer> gold= new ArrayList<Integer>();
	 gold.add(0);
	 gold.add(0);
	 gold.add(0);
	 gold.add(1);
	 gold.add(0);
	 gold.add(3);
	 gold.add(0);
	 gold.add(1);

	 ArrayList<Integer> silver= new ArrayList<Integer>();
	 silver.add(3);
	 silver.add(0);
	 silver.add(0);
	 silver.add(0);
	 silver.add(0);
	 silver.add(1);
	 silver.add(1);
	 silver.add(0);
	 
	 ArrayList<Integer> bronze= new ArrayList<Integer>();
	 bronze.add(0);
	 bronze.add(1);
	 bronze.add(1);
	 bronze.add(0);
	 bronze.add(1);
	 bronze.add(1);
	 bronze.add(0);
	 bronze.add(1);

	 countries.add("Canada");
	 countries.add("Italy");
	 countries.add("Germany");
	 countries.add("Japan");
	 countries.add("Kazakhstan");
	 countries.add("Russia");
	 countries.add("South Korea");
	 countries.add("United States");
	 
	 counts.add(gold);
	 counts.add(silver);
	 counts.add(bronze);

	
	 
	System.out.println("Country \tGold\tSilver\tBronze\tTotal");
	 
	 
	
	
	// Print countries, counts, and row totals
	int total = 0;
	int goldTotal = 0;
	int silverTotal = 0;
	int bronzeTotal = 0;
	int medalsTotal = 0;
	
	for (int i = 0; i < COUNTRIES; i++)
		
		{
			total = 0;
			total =counts.get(0).get(i) + counts.get(1).get(i) + + counts.get(2).get(i);
			
			if(countries.get(i).length()<10)
			{
				System.out.println(countries.get(i)+ "   \t"+ counts.get(0).get(i) + "\t"+ counts.get(1).get(i)+ "\t"+ counts.get(2).get(i) +"\t"+ total);
			}
			
			else 
			{
				System.out.println(countries.get(i)+ "  \t"+ counts.get(0).get(i) + "\t"+ counts.get(1).get(i)+ "\t"+ counts.get(2).get(i) +"\t"+ total);
			}
			
			
			
			goldTotal = goldTotal + counts.get(0).get(i);
			silverTotal = silverTotal + counts.get(1).get(i);
			bronzeTotal = bronzeTotal + counts.get(2).get(i);
			
		}
	
		medalsTotal = goldTotal + silverTotal + bronzeTotal;
		System.out.println("Totals  \t" +goldTotal +"\t" + silverTotal + "\t" + bronzeTotal + "\t" + medalsTotal);
	 }
 }
