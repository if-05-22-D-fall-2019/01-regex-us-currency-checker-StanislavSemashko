

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {
    public static Matcher getMatcher(String usCurrencyString) {
        Matcher matcher;
        final String regex = "\\$\\s\\d{3}\\.\\d{2}";

       Pattern pattern = Pattern.compile(regex);
       matcher = pattern.matcher(usCurrencyString);
       return matcher;
    }
}

