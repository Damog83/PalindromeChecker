package com.sparta.dg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeCheckerTests {

    @Test
    @DisplayName("When word is less than 3 letters return false")
    void checkForWordLengthUnder3() {
        Assertions.assertEquals(false, PalindromeChecker.isPalindrome("No"));
    }

    @Test
    @DisplayName("When a word passed is not a palindrome returns false")
    void checkNonPalindrome() {
        Assertions.assertEquals(false, PalindromeChecker.isPalindrome("Not"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"pop", "deed", "kayak", "testset"})
    @DisplayName("When a palindrome is passed returnds true")
    void checkPalindrome(String word) {
        Assertions.assertEquals(true, PalindromeChecker.isPalindrome(word));
    }
}
