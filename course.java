public class course {
    private String courseName;
    private String title;
    private Lecture [] lectureList;
    private Tutorial [] tutorialList;

    public Course(String courseName, String title, Lecture[] lectureList, Tutorial[]tutorialList)
    {
        this.courseName = courseName;
        this.title = title;
        this.lectureList = new Lecture[lectureList.length];
        for (int i = 0; i<lectureList.length; i++){
            this.lectureList[i] =
             new lecture();
        }

        this.tutorialList = new Tutorial[tutorialList.length];
        for (int i = 0; i<tutorialList.length; i++){
            this.tutorialList[i] = new Tutorial();
        }
    }
    public Course() {
        courseName = null;
        title = null;
        lectureList = null;
        tutorialList = null;
    }

    public void availableCourse(){
        availableLecture();
        availableTutorial();
    }
    private void availableLecture(){
        for (int i = 0; i<lectureList.length; i++){
            //lectureList[i].isAvail();
        }
    }

    public void viewAllCourses(){

    }
    private void availableTutorial(){
        for (int i = 0; i<tutorialList.length; i++){
            //tutorialList[i].isAvail();
        }
    }



    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String name){
        courseName = name;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
