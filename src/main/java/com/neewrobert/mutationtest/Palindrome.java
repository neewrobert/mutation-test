package com.neewrobert.mutationtest;

public class Palindrome {
    public boolean isPalindrome(String palindrome) {
        if (palindrome.length() == 0) {
            return true;
        }
        char firstChar = palindrome.charAt(0);
        char lastChar = palindrome.charAt(palindrome.length() - 1);
        String mid = palindrome.substring(1, palindrome.length() - 1);
        return (firstChar == lastChar) && isPalindrome(mid);
    }
}
