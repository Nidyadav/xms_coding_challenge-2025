import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeTop75 {
    public static void main(String[] args) {
//        LeetCodeTop75 leetCodeTop75 = new LeetCodeTop75();
//        System.out.println(leetCodeTop75.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
        CodingBatArray3 codingBatArray3 = new CodingBatArray3();

        codingBatArray3.maxMirror(new int[]{1, 2, 1, 4});
    }

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

    /*Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true*/
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();
        Map<Character, Integer> mapMagazine = new HashMap<>();
        for (char c : magazineChars) {
            mapMagazine.put(c, mapMagazine.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomChars) {
            if ((!mapMagazine.containsKey(c)) || mapMagazine.get(c) <= 0)
                return false;
            mapMagazine.put(c, mapMagazine.get(c) - 1);
        }
        return true;
    }
}
