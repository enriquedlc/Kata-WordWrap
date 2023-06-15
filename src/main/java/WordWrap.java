import exception.NegativeNumberException;

public class WordWrap {

    public static final String NEW_LINE = "\n";

    private boolean isNullOrEmpty(String text) {
        return text == null || text.isEmpty();
    }

    public String wordWrap(String text, int columnLength) throws NegativeNumberException {
        if (isNullOrEmpty(text)) {
            return "";
        }

        if (columnLength < 0) {
            throw new NegativeNumberException("Negative column width is not valid");
        }

        StringBuilder wrappedText = new StringBuilder();
        int startIndex = 0;

        while (startIndex < text.length()) {
            if (startIndex + columnLength <= text.length()) {
                wrappedText.append(text, startIndex, startIndex + columnLength);
                startIndex += columnLength;
            } else {
                wrappedText.append(text.substring(startIndex));
                startIndex = text.length();
            }

            if (startIndex < text.length()) {
                wrappedText.append(NEW_LINE);
            }
        }

        return wrappedText.toString();
    }

}
