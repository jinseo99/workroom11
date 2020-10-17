public class course {
    private String courseName;
    private String title;
    private lecture [] lectureList;
    private tutorial [] tutorialList;

    public course() {
        courseName = null;
        title = null;
        lectureList = null;
        tutorialList = null;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String name){
        courseName = name;
    }

    public void availableLecture(){
        for (int i = 0; i<lectureList.length; i++){
            //lectureList[i].isAvail();
        }
    }

    public void viewAllLectures(){

    }
    public void availableTutorial(){
        for (int i = 0; i<tutorialList.length; i++){
            //tutorialList[i].isAvail();
        }
    }

}
