import exception.NegativeNumberException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordWrapTest {

    /*
     * :rotating_light:
     * :white_check_mark:
     */

    public static final String HOLA = "hola";

    @Test
    public void should_throw_exception_if_a_negative_number_is_given() {
        String exceptionMessage = "Negatives not allowed";
        assertEquals(exceptionMessage, assertThrows(NegativeNumberException.class, () -> {
        }).getMessage());
    }

}
