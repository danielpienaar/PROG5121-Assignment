package coursereport;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class CourseReport {

    public static void printCourseReport(Course_Details course) {
        //Get current date
        //This date formatting code was adapted from:
        //https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/text/SimpleDateFormat.html
        //Accessed June 2021
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = new Date();
        //Print course report
        System.out.println("\nCOURSE REPORT - " + formatter.format(d));
        System.out.println("*******************************************");
        System.out.println("COURSE:\t\t\t" + course.getCourseName());
        System.out.println("STUDENT NUMBERS:\t" + course.getStudentNums());
        System.out.println("LECTURER:\t\t" + course.getLecturer());
        System.out.println("VENUE:\t\t\tVenue " + course.assignVenue());
        System.out.println("*******************************************");
    }

    public static void main(String[] args) {
        //Create course 1
        Course_Details disd = new Course_Details();
        disd.setCourseName("Diploma in Software Development");
        disd.setLecturer("Mr Jones");
        disd.setStudentNums(35);
        //Create course 2
        Course_Details diwd = new Course_Details();
        diwd.setCourseName("Diploma in Web Development");
        diwd.setLecturer("Mrs Smith");
        diwd.setStudentNums(28);
        //Create course 3
        Course_Details didm = new Course_Details();
        didm.setCourseName("Diploma in Data Metrics");
        didm.setLecturer("Mr Ntsinga");
        didm.setStudentNums(39);
        
        //Ask user continuously to view course details
        char exit = 'n';
        while(exit != 'y') {
            int course = Integer.parseInt(JOptionPane.showInputDialog("Select from the following to view the course details:\n1) DISD\n2) DIWD\n3) DIDM"));
            if (course == 1) {
                printCourseReport(disd);
            } else if (course == 2) {
                printCourseReport(diwd);
            } else if (course == 3) {
                printCourseReport(didm);
            } else {
                //MessageDialog error variant adapted from
                //https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
                //Accessed June 2021
                JOptionPane.showMessageDialog(null, "Invalid selection, defaulting to option 1", "Error", JOptionPane.ERROR_MESSAGE);
                printCourseReport(disd);
            }
            exit = JOptionPane.showInputDialog("Would you like to exit the application? Enter (y) to exit or any other key to continue.").toLowerCase().charAt(0);
        }
    }
    
}
