import java.util.*;
public class student {
    Vector <course>courseList;

    public student(){
        courseList = new Vector<course>();
    }
    public void addCourse(course c){
        courseList.append(c);
    }
    public void availableCourse (course c){
        c.availableCourse();
    }
    public void viewCourse(course c) {
        c.viewAllCourses();;
    }
}
