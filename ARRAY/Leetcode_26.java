//26. Remove Duplicates from Sorted Array

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given an integer array nums sorted in non-decreasing order,
// remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same. Then
// return the number of unique elements in nums.
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements
// of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
public class Leetcode_26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,5};
        removeDuplicate(nums);
        System.out.println(Arrays.toString(nums));
    }
//static  void removeDuplicate(int[] arr){
//
//        //insert the element int o set
//    Set<Integer> set = new HashSet<>();
//    for (int i = 0; i < arr.length; i++) {
//        set.add(arr[i]);
//    }
//int index = 0 ;
//    for (int elem : set) {
//        arr[index++] = elem;
//    }
// sout(index+1);
//}

    static  void  removeDuplicate(int[] arr) {
        int i = 0 ;
        for (int j = i+1; j < arr.length; j++) {
            if ( arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
       // System.out.println(Arrays.toString(arr));
        System.out.println(i+1);
    }
}
