public class CodingBatStringProblems {
    public String firstHalf(String str) {

      char[] charArray = str.toCharArray();
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < charArray.length/2; i++) {
          stringBuilder.append(charArray[i]);
      }
      return  stringBuilder.toString();
    }

}
