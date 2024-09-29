
//Given an integer array nums and an integer k, split
// nums into k non-empty subarrays such that the largest sum of any subarray is

// minimized.Input: nums = [7,2,5,10,8], k = 2
//Output: 18

//Explanation: There are four ways to split nums into two subarrays.
//The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.


public class leetcode_410{
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
    int maxSubarray = largetSubarray(nums,k);
        System.out.println(maxSubarray);
    }

    static  int largetSubarray(int[] arr, int k){
//        posible ans will be in the range when k=1 and k=size of array
    int start = 0;
    int end =0;

    for (int i = 0; i < arr.length; i++){
        start = Math.max(start,arr[i]);
        end += arr[i];
    }

    while( start < end){

        //our mid may be the possible qanswer
        int mid = start + (end - start)/2;

        int sum = 0;
        int piecce=1;
        for(int num : arr){
            sum = num + sum;
            if(sum > mid){

                sum =num;
                piecce++;
            }else{
                sum +=num;
            }
        }

        if (piecce > k){
            start = mid+1;
        }else {
            end = mid;
        }

    }
return end;

    }
}
