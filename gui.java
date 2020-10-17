import java.awt.*;
import javax.swing.*;

public class gui{
    public static void main(String args[]){
        // Frame Details
        JFrame frame = new JFrame("Courses Scheduler");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(800,800);

       // Initiate object instance of Student class
       Controller allData = new Controller();

       // Define the various options used
       String coursesOptions[] = allData.getCourses();
       String lectureOptions[] = allData.getLectures();
       String tutorialOptions[] = allData.getTutorials();

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
