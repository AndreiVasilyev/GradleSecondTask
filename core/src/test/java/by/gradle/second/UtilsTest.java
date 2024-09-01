package by.gradle.second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UtilsTest {

    Utils utils = new Utils();

    @Test
    void returnTrueIfAllStringsArePositiveNumbers() {
        assertTrue(utils.isAllPositiveNumbers("12", "79"));
    }

    @Test
    void returnFalseIfAllStringsAreNotPositiveNumbers() {
        assertFalse(utils.isAllPositiveNumbers("12", "-79"));
    }
}
