public class LeetCodeTop75 {

    /*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
 Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.*/
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char charFirst = s.charAt(start);
            char charLast = s.charAt(end);
            if (!Character.isAlphabetic(charFirst)) start++;
            else if (!Character.isAlphabetic(charLast)) end--;
            else {
                if (Character.toLowerCase(charFirst) != Character.toLowerCase(charLast)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    A subsequence of a string is a new string that is formed from the original string
    by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
(   i.e., "ace" is a subsequence of "abcde" while "aec" is not).
    */
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;
    while (sPointer < s.length() && tPointer < t.length()) {
        if (s.charAt(sPointer) == t.charAt(tPointer)) {
            sPointer++;
        }
        tPointer++;

    }
    return sPointer == s.length();
    }
}
