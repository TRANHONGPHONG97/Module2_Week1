package string_regex.validate_phone;

public class RegularExpressionSDTTest {
    private static String[] arrNumber = {
            "(84)-(0978489648)",
            "(a8)-(22222222)",
            "(814)-(0978489648)",
            "((13)-(123456789101112)"
    };

    public static void main(String[] args) {
        RegularExpressionSDT sdt = new RegularExpressionSDT();
        for (String number : arrNumber) {
            if (sdt.isRegularExpressionSDT(number)) {
                System.out.println(number + " is number phone");
            } else
                System.out.println(number + " is not number ");
        }
    }
}
