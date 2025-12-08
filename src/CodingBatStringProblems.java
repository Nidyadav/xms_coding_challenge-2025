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


}
