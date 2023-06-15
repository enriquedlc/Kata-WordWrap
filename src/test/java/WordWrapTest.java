import exception.NegativeNumberException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordWrapTest {

    /*
     * :rotating_light:
     * :white_check_mark:
     */

    private static final String HOLA = "hola";

    private final WordWrap wordWrap = new WordWrap();

    @Test
    public void should_throw_exception_if_a_negative_number_is_given() {
        String exceptionMessage = "Negative column width is not valid";
        assertEquals(exceptionMessage, assertThrows(NegativeNumberException.class, () -> {
            wordWrap.wordWrap(HOLA, -2);
        }).getMessage());
    }

    @Test
    public void should_return_empty_string_if_empty_string_is_given() throws NegativeNumberException {
        String result = wordWrap.wordWrap("", 2);
        assertEquals("", result);
    }

    @Test
    public void should_return_empty_string_if_null_value_is_given() throws NegativeNumberException {
        String result = wordWrap.wordWrap(null, 2);
        assertEquals("", result);
    }

    @Test
    public void should_return_same_string_if_column_length_is_greater_than_string_length() throws NegativeNumberException {
        String result = wordWrap.wordWrap(HOLA, 10);
        assertEquals(HOLA, result);
    }

}
