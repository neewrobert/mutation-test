package com.neewrobert.mutationtest;

import org.junit.Assert;
import org.junit.Test;
public class PalindromeTest {

    @Test
    public void testIfIsAPalindrome() {
        Palindrome palindrome = new Palindrome();
        Assert.assertTrue(palindrome.isPalindrome("noon"));
        Assert.assertTrue(palindrome.isPalindrome("anna"));
    }

    @Test
    public void testIfIsAPalindrome_withNomPalindromeWord() {
        Palindrome palindrome = new Palindrome();
        Assert.assertFalse(palindrome.isPalindrome("note"));
        Assert.assertFalse(palindrome.isPalindrome("neon"));
    }
}
