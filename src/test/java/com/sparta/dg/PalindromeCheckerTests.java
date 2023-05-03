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
        Assertions.assertFalse(PalindromeChecker.isPalindrome("No"));
    }

    @Test
    @DisplayName("When a word passed is not a palindrome returns false")
    void checkNonPalindrome() {
        Assertions.assertFalse(PalindromeChecker.isPalindrome("Not"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"pop", "deed", "kayak", "testset"})
    @DisplayName("When a palindrome is passed returns true")
    void checkPalindrome(String word) {
        Assertions.assertTrue(PalindromeChecker.isPalindrome(word));
    }

    @Test
    @DisplayName("When word is less than 3 letters return false")
    void checkWordLengthUnder3WithLoop() {
        Assertions.assertFalse(PalindromeChecker.isPalindromeLoop("No"));
    }

    @Test
    @DisplayName("When a word passed is not a palindrome returns false")
    void checkNonPalindromeWithLoop() {
        Assertions.assertFalse(PalindromeChecker.isPalindromeLoop("Parrot"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"pop", "deed", "kayak", "testset"})
    @DisplayName("When a palindrome is passed returns true")
    void checkPalindromeWithLoop(String word) {
        Assertions.assertTrue(PalindromeChecker.isPalindromeLoop(word));
    }

    @Test
    @DisplayName("When no palindromes are present in the sentence returns no palindromes")
    void checkSentenceWithNoPalindrome() {
        String[] sentence = {"I", "have", "no", "palindromes"};
        Assertions.assertEquals("No Palindromes", PalindromeChecker.longestPalindrome(sentence));
    }

    @Test
    @DisplayName("When a single palindrome is present in the sentence returns palindrome")
    void checkSentenceWithSinglePalindrome() {
        String[] sentence = {"I", "have", "a", "kayak"};
        Assertions.assertEquals("kayak", PalindromeChecker.longestPalindrome(sentence));
    }

    //tests with longest word in different order
    @Test
    @DisplayName("When a sentence contains more than one palindrome of differing lengths the largest is returned")
    void checkSentenceWithTwoPalindromesOfSameLength() {
        String[] sentence = {"What", "are", "the", "stats", "on", "that", "racecar", "?"};
        Assertions.assertEquals("racecar", PalindromeChecker.longestPalindrome(sentence));
    }

    @Test
    @DisplayName("When more than one palindrome have the lonest length")
    void checkSentenceForMoreThanOnePalindromeOfTheLongestLength() {
        String[] sentence = {"bob", "cat", "kayak", "radar", "noon", "pop"};
        Assertions.assertEquals("kayak and radar", PalindromeChecker.longestPalindrome(sentence));
    }
}
