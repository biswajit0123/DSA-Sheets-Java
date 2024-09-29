
public class RotatedDuplicate {
    public static void main(String[] args) {

        int[] arr= {2,2,2,9,10,10,12,2,2,2,2};
        System.out.println(findPivetWithupkivcate(arr));

    }
    public  static  int findPivetWithupkivcate(int[] nums){
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

            //if duplicate
            if( nums[start] == nums[mid] &&  nums[end] == nums[mid]){
                //befpore skipping check is that starts or end is pivet or not

                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;

                if(nums[end] < nums[end+1]){
                    return start;
                }
                end--;
            } else if (nums[start]  >=  nums[mid]) {
                end = end-1;

            }else {
                start = start +1;

            }
        }
        return  -1;

    }

}
