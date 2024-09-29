//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]

import java.util.Arrays;

public class towsum_002_1 {
    public static void main(String[] args) {

        int[] nums={1,3,4,2};
        int[] result=twoSum(nums,6);
        System.out.println(Arrays.toString(result));
    }
     static int[] twoSum(int[] nums, int target) {
        int SecondIndex=0;
        int index;
        for( index=0; index<nums.length; index++){
            int secondValue=target-nums[index];
            SecondIndex=indexCheck(nums,secondValue,index+1);
            if(SecondIndex !=0){
                return new int[]{index,SecondIndex};

            }
        }
        return new int[]{index,SecondIndex};
    }
    static int indexCheck(int[] nums ,int Value,int start){
        int ans=0;
        for(int index=start; index<nums.length; index++){
            if(nums[index] == Value){
                ans=index;
            }
        }
        return ans;
    }


}
