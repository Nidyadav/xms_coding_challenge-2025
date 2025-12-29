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
    /*
Return an array that contains exactly the same numbers as the given array,
but rearranged so that every 3 is immediately followed by a 4.
Do not move the 3's, but every other number may move.
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
fix34([1, 3, 1, 4]) → [1, 3, 4, 1]*/
    public int[] fix34(int[] nums) {
        int fourIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                //find index of 4
                while(nums[fourIndex] != 4) {
                    fourIndex++;
                }
                //swap
                int temp=nums[i+1];
                nums[i+1]=4;
                nums[fourIndex]=temp;
                fourIndex++;
            }
        }
        return nums;
    }
    /*Return an array that contains exactly the same numbers as the given array, but rearranged so that
    every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move.
    The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
    In this version, 5's may appear anywhere in the original array.
     */
    public int[] fix45(int[] nums) {
        int fiveIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i+1]!=5) {
                // find a free 5
                while (nums[fiveIndex] != 5 ||
                        (fiveIndex > 0 && nums[fiveIndex - 1] == 4)) {
                    fiveIndex++;
                }
                   //swap
                int temp=nums[i+1];
                nums[i+1]=5;
                nums[fiveIndex]=temp;
            }
        }
        return nums;
    }

}
