
public class Instructor extends Person {
	
	

	/**
	   An instructor is represented by a name, a birth year, and a salary.
	   You must enter the class name, instance variable(s), and constructor below
	*/
	private double salary;
	
	public Instructor(String name, int birthyear, double sal) {
		super(name, birthyear);
		this.salary = sal;
		// TODO Auto-generated constructor stub
	}


	   /**
	      Returns the string represention of the object.
	      @return a string representation of the object
	   */
	   public String toString()
	   {
	      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
	   }

}
