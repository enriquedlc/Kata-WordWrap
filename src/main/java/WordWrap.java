import exception.NegativeNumberException;

import java.util.Arrays;

public class WordWrap {

    public static final String NEW_LINE = "\n";

    public String wordWrap(String text, int columnLength) throws NegativeNumberException {
        if (text == null || text.isEmpty()) {
            return "";
        } else if (columnLength < 0) {
            throw new NegativeNumberException("Negative column width is not valid");
        } else if (text.length() <= columnLength) {
            return text;
        }
        return text.substring(0, columnLength) + NEW_LINE + wordWrap(text.substring(columnLength), columnLength);
    }


}
