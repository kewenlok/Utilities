package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {

    // Three part format: methodBeingTested_inputGiven_expectedOutput

    /**
     * Tests the successful case: Happy path
     */
    @Test
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = "Hello|World";
        String separator = "\\|";
        List<String> stringParts = sp.splitString(inputString, separator);
        assertEquals(2, stringParts.size());
    }

    @Test
    void splitString_nullInput_expectException() {
        StringParser sp = new StringParser();
        String inputString = null;
        String separator = "\\|";

        assertThrows(InvalidStringInputException.class, () -> {
            sp.splitString(inputString, separator);
        });
    }
}