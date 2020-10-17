import java.awt.*;
import javax.swing.*;

public class gui{
    public static void main(String args[]){
        // Frame Details
        JFrame frame = new JFrame("Courses Scheduler");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(800,800);

       // Initiate object instance of Student class
       Student std1 = new Student();

       // Define the various options used
       String coursesOptions[] = Student.getCourses();
       String lectureOptions[] = {"Lecture 1", "Lecture 2"};
       String tutorialOptions[] = {"Tutorial 1", "Tutorial 2"};

       // Create Combo Box instances of the selections
       JComboBox courses = new JComboBox(coursesOptions);
       JComboBox lectures = new JComboBox(lectureOptions);
       JComboBox tutorials = new JComboBox(tutorialOptions);

       // Add the 
       frame.getContentPane().add(courses); // Adds Courses selection to content pane of frame
       frame.getContentPane().add(lectures); // Adds Lecture selection to content pane of frame
       frame.getContentPane().add(tutorials); // Adds Tutorial selection to content pane of frame

       frame.setLayout(new FlowLayout(FlowLayout.LEFT));
       frame.setVisible(true);
    }
}
