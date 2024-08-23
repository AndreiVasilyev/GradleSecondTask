package by.gradle.second;

import by.gradle.first.StringUtils;

import java.util.Arrays;

public class Utils {

    private final StringUtils stringUtils = new StringUtils();

    public boolean isAllPositiveNumbers(String... str) {
        long posNumberCount = Arrays.stream(str)
                .filter(stringUtils::isPositiveNumber)
                .count();
        if (str.length == posNumberCount) {
            System.out.println("All strings are positive numbers");
            return true;
        }
        System.out.println("All strings are not positive numbers");
        return false;
    }
}
