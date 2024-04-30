public class Main{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Don");
        Student student3 = new Student("John","Ball State", "Comp Sci", 1.0, 2.0);

        System.out.println("Original name: " + student3.getName());
        student3.setName("Joe");
        System.out.println("Set name: "+ student3.getName());
        student3.setName("Joe", student3.getSchool());
        System.out.println("Set name with school: "+ student3.getName());
    }
}
