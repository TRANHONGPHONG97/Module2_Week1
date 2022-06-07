package string_regex.validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static final String CLASS_REGEX =
            "^[C|A|P]+\\d{4}[G|H|I|K|L|M]";
    public boolean isClass(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
