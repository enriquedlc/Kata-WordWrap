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

}
