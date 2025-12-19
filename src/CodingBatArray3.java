public class CodingBatArray3 {
    /*Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
      linearIn([1, 2, 4, 6], [2, 4]) → true*/
    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0; // pointer for inner
        int j = 0; // pointer for outer
        while (i < inner.length && j < outer.length) {
            if (inner[i] == outer[j]) {
                i++;
                j++;
            } else if (outer[j] < inner[i]) {
                j++;
            } else {
                return false; // inner[i] is missing
            }
        }
        return i == inner.length;
    }
}
