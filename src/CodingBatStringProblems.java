import java.util.HashMap;

public class CodingBatStringProblems {
    public String firstHalf(String str) {

      char[] charArray = str.toCharArray();
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < charArray.length/2; i++) {
          stringBuilder.append(charArray[i]);
      }
      return  stringBuilder.toString();
    }
    /*
    Given a string, return the length of the largest "block" in the string. A block is a run of "adjacent chars" that are the same.
    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
     */
    public int maxBlock(String str) {
       int currentCount=1;
       int maxCount=1;
       for(int i=1;i<str.length();i++){
          if(str.charAt(i)==str.charAt(i-1)){
              currentCount++;
          }else{
              currentCount=1;
          }
           maxCount = Math.max(maxCount, currentCount);
       }
      return maxCount;
    }
    /*
    Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
     */
    public int sumDigits(String str) {
      char[] charArray= str.toCharArray();
      int sum=0;
      for(char c:charArray){
          if(Character.isDigit(c)){
              sum+=Integer.parseInt(String.valueOf(c));
          }
      }
      return sum;
    }
    /*
    Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
    equalIsNot("This is not") → false
    equalIsNot("This is notnot") → true
    equalIsNot("noisxxnotyynotxisi") → true
    */
    public boolean equalIsNot(String str) {
        int countOfIs = 0, countOfNot = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.startsWith("is", i)) {
                countOfIs++;
            }
            if (i + 2 < str.length() && str.startsWith("not", i)) {
                countOfNot++;
            }
        }
        return countOfIs == countOfNot;
    }
    /*
    Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
    mirrorEnds("abXYZba") → "ab"
    mirrorEnds("abca") → "a"
    mirrorEnds("aba") → "aba"
     */
    public String mirrorEnds(String string) {
        StringBuilder mirrorString = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                mirrorString.append(string.charAt(i));
            } else {
                break;
            }
        }
        return mirrorString.toString();
    }
    /*Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
    withoutString("Hello there", "llo") → "He there"
    withoutString("Hello there", "e") → "Hllo thr"
    withoutString("Hello there", "x") → "Hello there"*/
    public static String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();
        int idx = 0;
        while (idx < base.length()) {
            //do not replace substring() with startsWith() it does not despite intelliJ suggestion
            if (idx + remove.length() <= base.length() && base.substring(idx, idx + remove.length()).equals(remove)) {
                idx = idx + remove.length();
            } else {
                result.append(base.charAt(idx));
                idx++;
            }
        }
        return result.toString();
    }
    /*
    Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
    For example, sameEnds("abXab") is "ab".
    sameEnds("abXYab") → "ab"
    sameEnds("xx") → "x"
    sameEnds("xxx") → "x"
     */
    public String sameEnds(String string) {
        int n=string.length();
        int maxLen=n/2;
        for(int i=maxLen;i>0;i--) {
            if(string.substring(0,i).equals(string.substring(n-i))){
                return string.substring(0,i);
        }
    }
    return "";
    }

}
