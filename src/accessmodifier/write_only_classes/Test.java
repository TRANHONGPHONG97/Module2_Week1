package accessmodifier.write_only_classes;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());
        student.setName("Phong");
        student.setClasses("CO322G1");
        System.out.println(student.toString());
    }
}

