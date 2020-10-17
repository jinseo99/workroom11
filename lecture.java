
public class Lecture {

	private int sectionNumber;
	private int seats;
	private int seatsFilled;
	private String instructor;
	private Occurance[] occurances;
	
	public Lecture(int sectionNumber, int capacity, int seatsFilled,
			String instructor, Occurance[] occurases)
	{
	   this.sectionNumber=sectionNumber;
	   this.seats=capacity;
	   this.instructor=instructor;
	   this.occurances=occurances;
	   this.seatsFilled=seatsFilled;
	}
	
}
