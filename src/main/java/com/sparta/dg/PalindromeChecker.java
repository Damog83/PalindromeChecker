package com.sparta.dg;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        if (word.length() < 3) return false;
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        return word.equals(reversed);
    }

    public static boolean isPalindromeLoop(String word) {
        if (word.length() < 3) return false;
        int middle = word.length() / 2;
        for (int i = 0; i < middle; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        }
        return true;
    }

    public static String longestPalindrome(String[] words) {

        int length = 0;
        String palindrome = null;

        for (String word : words) {
            if (isPalindrome(word) && word.length() > length) {
                palindrome = word;
                length = word.length();
            } else if (isPalindrome(word) && word.length() == length) {
                palindrome += " and " + word;
            }
        }
        return (palindrome == null) ? "No Palindromes" : palindrome;
    }

    public static void main(String[] args) {

    }
}
