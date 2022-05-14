package coursereport;


public class Course_Details {
    
    private String courseName;
    private int StudentNums;
    private String lecturer;

    //Getters
    public String getCourseName() {
        return courseName;
    }

    public int getStudentNums() {
        return StudentNums;
    }

    public String getLecturer() {
        return lecturer;
    }

    //Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStudentNums(int StudentNums) {
        this.StudentNums = StudentNums;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
    
    //Return a randomly generated venue from 1 to 3
    public int assignVenue() {
        int venue = (int) (Math.random() * (3-1+1) + 1);
        return venue;
    }
    
}
