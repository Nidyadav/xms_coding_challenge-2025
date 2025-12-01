/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
 Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.*/

public class Palindrome {
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
}
