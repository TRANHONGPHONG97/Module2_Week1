package string_regex.validate_class;

public class Main {
    public static String[] arrClass = {"P5463G", "C0318G1", "C0322G1"};

    public static void main(String[] args) {
        ValidateClass check = new ValidateClass();
        for (String string : arrClass) {
            if (check.isClass(string)) {
                System.out.println(string + " is class");
            } else
                System.out.println(string + " is not class ");
        }
    }
}
