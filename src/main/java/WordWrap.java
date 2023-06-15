import exception.NegativeNumberException;

public class WordWrap {
    public String wordWrap(String text, int columnLength) throws NegativeNumberException {
        if (text == null || text.isEmpty()) return "";
        if (columnLength < 0) throw new NegativeNumberException("Negative column width is not valid");
        return text;
    }

}
