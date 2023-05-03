package com.sparta.dg;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        if(word.length() < 3) return false;

        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();

        return word.equals(reversed);
    }
    public static void main(String[] args) {
    }
}
