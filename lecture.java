
public class Lecture {

	private int sectionNumber;
	private int seats;
	private int seatsFilled;
	private String instructor;
	private Occurrences[] occurrences;
	
	public Lecture(int sectionNumber, int capacity, int seatsFilled,
			String instructor, Occurrences[] occurrences)
	{
	   this.sectionNumber = sectionNumber;
	   this.seats = capacity;
	   this.instructor = instructor;
	   this.occurrences = occurrences;
	   this.seatsFilled = seatsFilled;
	}
	
}
