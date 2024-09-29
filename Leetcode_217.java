import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
public class Leetcode_217 {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,8};
        System.out.println(containDuplicate(nums));
        System.out.println(containDuplicate2(nums));
    }


    static  boolean containDuplicate(int[] nums){

        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }
        if (set.size() == nums.length){
            return  false;
        }else {
            return true;
        }

    }
    //sorted fisrdt then check

    static  boolean containDuplicate2(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return  false;

    }



    }

