package string_regex.validate_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionSDT {
    //Số điện thoại hợp lệ: (xx)-(0xxxxxxxxx)
    private static final String NUMBER_REGEX =
            "^\\(\\d{2}\\)-\\([0-9]{10,}\\)$";
    public boolean isRegularExpressionSDT(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
