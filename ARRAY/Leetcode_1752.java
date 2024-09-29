
//Given an array nums, return true if the array was
// originally sorted in non-decreasing order, then rotated some
// number of positions (including zero). Otherwise, return false.
//Example 1:
//
//Input: nums = [3,4,5,1,2]
//Output: true
//Explanation: [1,2,3,4,5] is the original sorted array.
//You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
public class Leetcode_1752 {
    public static void main(String[] args) {
//int[] arr = {5,5,6,6,6,9,1,2};
int[] arr = {3,4,5,1,2};
        System.out.println(checkSortNMounted(arr));
    }

    static  boolean checkSortNMounted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] > arr[i+1]){
             return checkMountain(arr,i+1);
            }
        }

        return true;
    }

    static boolean checkMountain(int[] arr, int j){
        int start = 0;
        int last  = arr.length-1;

        if (arr[start] < arr[last]){
            return false;
        }

        for (int k = j; k < arr.length-1; k++) {
            if (arr[k] > arr[k+1]){
                return false;
            }
        }
        return true;
    }


}
