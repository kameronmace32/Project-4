public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Kameron Mace","Ball State","CS",2.7, 16.0);

    System.out.println(student1.getName());
    student1.setName("John Doe, Jr.");
    System.out.println(student1.getName());

    System.out.println(student1.getSchool());
    student1.setSchool("Purdue");
    System.out.println(student1.getSchool());

    System.out.println(student1.getMajor());
    student1.setMajor("Engineering");
    System.out.println(student1.getMajor());

    System.out.println(student1.getGPA());
    student1.setGPA(4.0);
    System.out.println(student1.getGPA());

    System.out.println(student1.getClassHours());
    student1.setClassHours(200);
    System.out.println(student1.getClassHours());

    }
}
