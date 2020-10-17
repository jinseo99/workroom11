import java.util.*;

public class Controller {
    List<String> coursesList = new ArrayList<String>();
    List<String> lecturesList = new ArrayList<String>();
    List<String> tutorialsList = new ArrayList<String>();

    public Controller() {
        //Dummy Code
        coursesList.add("Math");
        coursesList.add("Science");
        coursesList.add("English");

        lecturesList.add("Lecture 1");
        lecturesList.add("Lecture 2");

        tutorialsList.add("Tutorial 1");
        tutorialsList.add("Tutorial 2");
    }

    public String[] getCourses() {
        String[] coursesArray = new String[coursesList.size()]; 
        coursesArray = coursesList.toArray(coursesArray); 
        return coursesArray;
    }

    public String[] getLectures() {
        String[] lecturesArray = new String[lecturesList.size()]; 
        lecturesArray = lecturesList.toArray(lecturesArray); 
        return lecturesArray;
    }

    public String[] getTutorials() {
        String[] tutorialsArray = new String[tutorialsList.size()]; 
        tutorialsArray = tutorialsList.toArray(tutorialsArray); 
        return tutorialsArray;
    }
}
