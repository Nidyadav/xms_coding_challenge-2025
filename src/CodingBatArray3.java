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
    /*A "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
    the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
    Return the size of the largest mirror section found in the given array.*/
    public int maxMirror(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {

                int count = 0;
                int i1 = i;
                int j1 = j;

                while (i1 < nums.length && j1 >= 0 && nums[i1] == nums[j1]) {
                    count++;
                    i1++;
                    j1--;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}
