import java.util.ArrayList;
public class Student {
    //Instances
    String name;
    String id;

    //key is course name
    //value is Course object
    //private HashMap<String, Course> courseHashMap = new HashMap<>();
    private ArrayList<Course> courseArrayList = new ArrayList<>();
    //constructors
    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    //methods

    //add
    public void addCourse(Course course) {
        courseArrayList.add(course);
    }
    //remove
    public void removeCourse(Course course) {
        courseArrayList.remove(course);
    }
    //get a course
    public Course getCourse(int index) {
        return courseArrayList.get(index);
    }

    // get all courses info
    public String getAllCoursesInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Course course : courseArrayList) {
            stringBuilder.append(course.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString(){
        return String.format("""
                Name: %s
                ID: %s
                """, name,id);
    }
}
