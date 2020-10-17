public class course {
    private String courseName;
    private String title;
    private lecture [] lectureList;
    private tutorial [] tutorialList;

    public course(String courseName, String title, lecture[] lectureList, tutorial[]tutorialList)
    {
        this.courseName = courseName;
        this.title = title;
        this.lectureList = new lecture[lectureList.length];
        for (int i = 0; i<lectureList.length; i++){
            this.lectureList[i] =
             new lecture();
        }

        this.tutorialList = new tutorial[tutorialList.length];
        for (int i = 0; i<tutorialList.length; i++){
            this.tutorialList[i] = new tutorial();
        }
    }
    public course() {
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
