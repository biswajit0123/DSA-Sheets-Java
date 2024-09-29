//https://leetcode.com/problems/search-in-rotated-sorted-array/
//
//search in roteted arrayExample 1:
//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4

public class leetcode_33 {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int target = 3;

        //find the pivet 1st whic is the largest element in the array
        int Pivet = findPivet(nums);

        System.out.println(Pivet);
//        case 1
        if (Pivet == -1){
           int res = binarySearch(nums,0,nums.length-1,target);
            System.out.println(res);
        }
        //case2
        if(nums[Pivet] == target) {
            System.out.println(Pivet);
        }
        //case 2
        else if(nums[0] <= target){
            int res = binarySearch(nums,0,Pivet-1,target);
            if(res == -1 ){
                System.out.println(-1);
            }else{
                System.out.println(res);
            }
        }else{
            int res = binarySearch(nums,Pivet+1,nums.length-1,target);
            if(res == -1 ){
                System.out.println(-1);
            }else{
                System.out.println(res);
            }
        }
    }

    static int binarySearch(int[] nums, int start, int end ,int target){
        int fast = start;
        int last = end;

        while(fast <= last){
            int mid = fast + (last - fast)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                last = mid -1;
            }else
            {
                fast = mid+1;

            }

        }
        return -1;
    }

    ///it will not work for duplicate value in array
    public  static  int findPivet(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while( start <= end ){
            int mid = start +(end - start )/2;

            // case 1
            if(mid<end && nums[mid] > nums[mid+1]){
                return  mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return  mid-1;
            }

            //case 3
            if(nums[start]  >  nums[mid]){
                end = mid-1;
            }else {
                start = mid +1;
            }
        }
        return  -1;

    }

    // for dulplicvate value

    //for duplicate
//    public  static  int findPivetWithupkivcate(int[] nums){
//        int start = 0;
//        int end = nums.length - 1;
//
//        while( start <= end ){
//            int mid = start +(end - start )/2;
//
//            // case 1
//            if(mid<end && nums[mid] > nums[mid+1]){
//                return  mid;
//            }
//            if(mid > start && nums[mid] < nums[mid-1]){
//                return  mid-1;
//            }
//
//            //if duplicate
//            if( nums[start] == nums[mid] &&  nums[end] == nums[mid]){
//                //befpore skipping check is that starts or end is pivet or not
//
//                if(nums[start] > nums[start+1]){
//                    return start;
//                }
//                start++;
//
//                if(nums[end] < nums[end+1]){
//                    return start;
//                }
//                end--;
//            } else if (nums[start]  >=  nums[mid]) {
//                end = end-1;
//
//            }else {
//                start = start +1;
//
//            }
//        }
//        return  -1;
//
//    }

}
