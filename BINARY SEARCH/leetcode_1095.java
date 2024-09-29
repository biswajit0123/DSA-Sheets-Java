
//Example 1:
//
//Input: array = [1,2,3,4,5,3,1], target = 3
//Output: 2
//Explanation: 3 exists in the array, at index=2 and index=5.
// Return the minimum index, which is 2.
public class leetcode_1095 {
    public static void main(String[] args) {
int[]  array = {1,2,3,4,5,3,1};
int target  = 3;
int res=minIndex(array,target);
        System.out.println(res);
    }
    public static int minIndex(int[] arr, int  target){
// find yhe target in incering and then decreasing
        int range = peek(arr);
        int increasing = incrBinary(arr,0,range,target);
        int decresing =0 ;
        if (increasing == -1){
            decresing = inDeces(arr,range+1,arr.length-1,target);
             if(decresing == -1){
                 return -1;
             }
             return  decresing;
        }

        return  increasing;
    }
    // fiinding the peek
    public  static  int peek(int[]  arr){
        int start =0;
        int end =arr.length -1;

        while( start < end){
            int mid =start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }

        }
        return  end;
    }

    //serachin gin 1st increading  order

    public  static int incrBinary(int[] arr, int start, int end, int target){
      int first = start;
      int last =end;
      while( first <= last){
          int mid =first + (last - first)/2;
          if(arr[mid] == target){
              return  mid;
          }
if(arr[mid] > target){
 last = mid -1;

}else {
    first = mid+1;
}
      }
      return -1;
    }

    public  static  int inDeces(int[] arr,int range,int end, int target){
        int first = range;
        int last =end;
        while( first <= last){
            int mid =first + (last - first)/2;
            if(arr[mid] == target){
                return  mid;
            }
            if(arr[mid] > target){
                first = mid+1;

            }else {
                last = mid -1;

            }
        }
        return -1;
    }
}
