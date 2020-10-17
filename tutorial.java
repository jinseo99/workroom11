public class Tutorial {

	
	private int tutorialNum;
	private int capacity;
	private int seatsFilled;
	private String instructor;
	private Occurance[] occuranceList;
	
	public Tutorial(int tutorialNum, int capacity, int seatsFilled,
			String instructor, Occurance[] occuraseList)
	{
	   this.tutorialNum=tutorialNum;
	   this.capacity=capacity;
	   this.instructor=instructor;
	   this.occuranceList=occuranceList;
	   this.seatsFilled=seatsFilled;
	}
}
