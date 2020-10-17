
public class Tutorial {

	
	private int tutorialNum;
	private int seats;
	private int seatsFilled;
	private String instructor;
	private Occurance[] occurances;
	
	public Tutorial(int tutorialNum, int capacity, int seatsFilled,
			String instructor, Occurance[] occurases)
	{
	   this.tutorialNum=tutorialNum;
	   this.seats=capacity;
	   this.instructor=instructor;
	   this.occurances=occurances;
	   this.seatsFilled=seatsFilled;
	}
}
