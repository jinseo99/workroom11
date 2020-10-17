import java.util.*;

public class Student {
    Vector <Course>courseList;
<<<<<<< Updated upstream

    // public student(){
    //     courseList = new Vector<Course>();
    // }
    // public void addCourse(Course c){
    //     courseList.append(c);
    // }
    // public void availableCourse (Course c){
    //     c.availableCourse();
    // }
    // public void viewCourse(Course c) {
    //     c.viewAllCourses();;
    // }
=======
    String name;
    public student(String name){
        courseList = new Vector<Course>();
        this.name=name;
    }
    public void addCourse(Course c){
        courseList.append(c);
    }
    public void availableCourse (Course c){
        c.availableCourse();
    }
    public void viewCourse(Course c) {
        c.viewAllCourses();;
    }
>>>>>>> Stashed changes
}
