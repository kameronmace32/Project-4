public class Course {
    //Instance variables
    private String courseName;
    private int courseCredit;


    // Constructor

    public Course(String courseName, int courseCredit){

        this.courseName = courseName;
        this.courseCredit = courseCredit;

    }

    //Methods

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    @Override
    public String toString(){
        return String.format("Course: %s\nCredits: %d\n", courseName, courseCredit);
    }
}
