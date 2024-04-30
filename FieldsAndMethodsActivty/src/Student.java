public class Student {
    private String name;
    private String school;
    private String major;
    private double GPA;
    private double classHours;

    public Student(String name, String school, String major, double GPA, double classHours){
        this.name = name;
        this.school = school;
        this.major = major;
        this.GPA = GPA;
        this.classHours = classHours;

    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool(){
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA(){
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getClassHours(){
        return classHours;
    }
    public void setClassHours(double classHours) {
        this.classHours = classHours;
    }
}
