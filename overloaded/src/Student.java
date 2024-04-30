import com.sun.source.tree.UsesTree;

public class Student {
private String name;
private String school;
private String major;
private double GPA;
private double classHours;

public Student(){
}

public Student(String studentName){
    this.name = studentName;
}

public Student(String studentName, String studentSchool, String studentMajor, double studentGPA, double studentClassHours){
    this.name = studentName;
    this.school = studentSchool;
    this.major = studentMajor;
    this.GPA = studentGPA;
    this.classHours = studentClassHours;
}

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
    public void setName(String newName, String school){
        if(school == "Ball State"){
            name = newName;
        }
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getClassHours() {
        return classHours;
    }

    public void setClassHours(double classHours) {
        this.classHours = classHours;
    }
}
