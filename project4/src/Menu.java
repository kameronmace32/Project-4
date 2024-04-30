import java.util.Scanner;

public class Menu {
    Scanner scnr = new Scanner(System.in);
    StudentRecord studentRecord = new StudentRecord();

    public void displayMenu() {
        while (true) {
            System.out.printf("%sMenu%s\n", "*********", "*********");
            System.out.print("Please make a selection\n");
            System.out.print("1) Add a student\n");
            System.out.print("2) Remove a student\n");
            System.out.print("3) Display student info\n");
            System.out.print("4) Display all student info\n");
            System.out.print("5) Exit\n");
            System.out.print("6) Faculty Options\n");
            System.out.println(">>");
            int input = Integer.parseInt(scnr.nextLine());
            if (input == 1) {
                createStudent();
            } else if (input == 2) {
                deleteStudent();
            } else if (input == 3) {
                displayStudent();
            } else if (input == 4) {
                displayAllStudents();
            } else if (input == 5) {
                break;
            }else if (input == 6) {
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }

    private void createStudent() {
        String name;
        String id;
        Student student;
        String courseName;
        int credits;
        Course course;

        System.out.println("Enter Student name: ");

        name = scnr.nextLine();

        System.out.println("Enter Student id: ");

        id = scnr.nextLine();

        student = new Student(name, id);

        System.out.printf("Enter courses for %s.\n", name);

        while (true) {
            System.out.println("Type \"q\" to finish entering courses.");
            System.out.println("Enter course name: ");
            courseName = scnr.nextLine();
            if (courseName.equals("q")) {
                break;
            }
            System.out.println("Enter course credits: ");
            credits = Integer.parseInt(scnr.nextLine());
            course = new Course(courseName, credits);
            student.addCourse(course);
        }
        studentRecord.addStudent(id,  student);
        System.out.printf("%s added to Record\n\n", name);
    }

    private void deleteStudent() {
        String id;
        Student student;
        System.out.printf("Enter id of Student to delete: ");
        id = scnr.nextLine();
        student = studentRecord.getStudent(id);
        if (id == (null)) {
            System.out.println("Student not found.");
        } else {
            System.out.println(student + " is deleted.");
            studentRecord.removeStudent(id);
        }
    }

    private void displayStudent() {
        String id;
        Student student;
        System.out.println("Enter the name of the Student to see info: ");
        id = scnr.nextLine();
        student = studentRecord.getStudent(id);
        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println(student);
        }
    }

    public void displayAllStudents() {
        System.out.println(studentRecord.getAllStudents());
    }
}
