import javax.swing.*;

public class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("Courses Scheduler");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(800,800);

       JButton button1 = new JButton("Select Course");
       JButton button2 = new JButton("Select Lecture");
       JButton button3 = new JButton("Select Tutorial");

       frame.getContentPane().add(button1); // Adds Courses selection to content pane of frame
       frame.getContentPane().add(button2); // Adds Lecture selection to content pane of frame
       frame.getContentPane().add(button3); // Adds Tutorial selection to content pane of frame
       frame.setVisible(true);
    }
}
