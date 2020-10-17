public class Lecture {

	private int lectureNum;
	private int capacity;
	private int seatsFilled;
	private String instructor;
	private Occurance[] occuranceList;
	
	public Lecture(int lectureNum, int capacity, int seatsFilled,
			String instructor, Occurance[] occuraseList)
	{
	   this.lectureNum=lectureNum;
	   this.capacity=capacity;
	   this.instructor=instructor;
	   this.occuranceList=occuranceList;
	   this.seatsFilled=seatsFilled;
	}
	
}
