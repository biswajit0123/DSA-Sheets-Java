import java.util.Arrays;

//
//34. Find First and Last Position of Element in Sorted Array
//        Given an array of integers nums sorted in non-decreasing order,
//        find the starting and ending position of a given target value.
//        If target is not found in the array, return [-1, -1].
//        You must write an algorithm with O(log n) runtime complexity.
//        Example 1:
//
//        Input: nums = [5,7,7,8,8,10], target = 8
//        Output: [3,4]

              //my approach
//public class Leetcode_34 {
//    public static void main(String[] args) {
// int[] nums={5,7,7,7,7,8,8,10};
// int[] res=getPosition(nums,7);
//        System.out.println(Arrays.toString(res));
//    }
//    static  int[] getPosition(int[] nums, int target){
//        int start=0;
//        int end=nums.length-1;
//        int index=0;
//     int fp=0;
//     int lp=0;
//     int mid=0;
//        while (start <= end){
//             mid=start+(end-start)/1;
//
//            if (nums[mid] > target) {
//                end = mid-1;
//            }else {
//                start = mid+1;
//            }
//            if (nums[mid] == target){
//                index=mid;
//                break;
//            }
//        }
//        while (nums[index] == target) {
//            lp=index;
//            index++;
//        }index= mid;
//        while (nums[index] == target) {
//             fp=index;
//            index--;
//        }
//
//        return  new int[] {fp,lp};
//    }
//}

                       // second approch using twice binary serch
class Leetcode_34 {
       public static void main(String[] args) {
int[] nums={5,7,7,7,7,8,8,10};
int[] res= searchRange(nums,7);
           System.out.println(Arrays.toString(res));
         }

         static  int[] searchRange(int[] nums,int target){
   int[] ans={-1,-1};
   int start=serchagain(nums,target,true);
             int end=serchagain(nums,target,false);
   ans[0] = start;
   ans[1] = end;
           return  ans;
         }

         static  int serchagain(int[] nums,int target,boolean firstOccurance){
           int ans =-1;
             int start=0;
             int end=nums.length-1;
             while(start <= end) {
                 int mid = start + (end - start) / 2;

                 if (nums[mid] > target) {
                     end = mid - 1;
                 } else if (nums[mid] < target) {
                     start = mid + 1;
                 } else {
                     ans = mid;
                     if (firstOccurance) {
                         end = mid - 1;
                     } else {
                         start = mid + 1;
                     }
                 }
             }
             return  ans;
         }
         }

