package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private Pattern pattern;
    private Matcher matcher;
    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean validate(String text) {
        matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
