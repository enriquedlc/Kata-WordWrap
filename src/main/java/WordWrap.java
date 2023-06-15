import exception.NegativeNumberException;

public class WordWrap {

    public static final String NEW_LINE = "\n";

    private boolean isNullOrEmpty(String text) {
        return text == null || text.isEmpty();
    }

    public String wordWrap(String text, int columnLength) throws NegativeNumberException {
        if (isNullOrEmpty(text)) return "";
        if (columnLength < 0) throw new NegativeNumberException("Negative column width is not valid");

        StringBuilder wrappedText = new StringBuilder();
        int startIndex = 0;

        while (startIndex < text.length()) {
            int endIndex = startIndex + columnLength;
            if (endIndex >= text.length()) {
                endIndex = text.length();
            } else {
                while (endIndex > startIndex && !Character.isWhitespace(text.charAt(endIndex - 1))) {
                    endIndex--;
                }
                if (endIndex == startIndex) {
                    endIndex = startIndex + columnLength;
                } else {
                    while (endIndex < text.length() && Character.isWhitespace(text.charAt(endIndex))) {
                        endIndex++;
                    }
                }
            }

            wrappedText.append(text, startIndex, endIndex);
            startIndex = endIndex;

            if (startIndex < text.length()) {
                wrappedText.append(NEW_LINE);
            }
        }

        return wrappedText.toString().replace(" ", "");
    }
}
