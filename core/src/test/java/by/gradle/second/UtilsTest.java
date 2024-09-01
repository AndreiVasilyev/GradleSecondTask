package by.gradle.second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
