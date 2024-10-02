//283. Move Zeroes
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
int[] nums = {0,1,0,3,12};
moveZeroToEnd(nums);
        System.out.println(Arrays.toString(nums));
    }

    //brute force
//    static  void moveZeroToEnd(int[] arr){
//
//        ArrayList<Integer> temp = new ArrayList<>();
//
//        for (int elem : arr) {
//            if (elem != 0){
//                temp.add(elem);
//            }
//        }
//
//        for (int i=0; i< temp.size(); i++){
//            arr[i] = temp.get(i);
//        }
//        for (int i = temp.size();i<arr.length; i++){
//            arr[i] = 0;
//        }
//    }

//    optimal you have done it before in removeduplicate Leetcode_26

    static  void moveZeroToEnd(int[] arr){
       //take one pointer and go where zero is there in arr
        int j=-1;
        //now go where 0 is present
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                j = i;
                break;
            }
        }

//means all are non zero number
        if(j == -1){
            return;
        }


        // now swap zero with a non zero value by two pinter
        for (int i = j + 1; i < arr.length; i++) {

            if (arr[i] != 0){
                swap(arr,i,j);
                j++;
            }
        }

    }

 static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;
 }
}
