
public class Quiz implements Measurable
{
	private double score;
	
	public Quiz()
	{
		score = 0;
	}
	
	public Quiz(double initialScore)
	{
		score = initialScore;
	}

	public double getScore()
	{
		return score;
	}
	
	public double getMeasure() {
		
		return score;
	}
	
}
