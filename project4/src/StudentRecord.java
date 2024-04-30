import java.util.HashMap;

public class StudentRecord {
    //instance variable
    private HashMap<String, Student> studentHashMap = new HashMap<>();

    //Methods
    //add student
    public void addStudent(String id, Student student){
        studentHashMap.put(id, student);
    }
    //remove student
    public void removeStudent(String id) {
        studentHashMap.remove(id);
    }
    //get Student
    public Student getStudent(String id){
        Student foundStudent = null;
        if(studentHashMap.containsKey(id)){
            foundStudent = studentHashMap.get(id);
        }
        return foundStudent;
    }

    public StringBuilder getAllStudents(){
        StringBuilder studentStringBuilder = new StringBuilder();
        studentHashMap.forEach((id, student) -> {
            studentStringBuilder.append(student.toString());
        });
        return studentStringBuilder;
    }
}