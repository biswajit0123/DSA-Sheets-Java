//Left Rotate an Array by One
//
//        Given an array 'arr' containing 'n' elements, rotate this array left once and return it.
//
//        Rotating the array left by one means shifting all elements by one place
//        to the left and moving the first element to the last position in the array.

//        Example:
//        Input: 'a' = 5, 'arr' = [1, 2, 3, 4, 5]
//
//        Output: [2, 3, 4, 5, 1]
import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4,5};
    int  k = 2;

//    leftRotate(nums,k);
//        System.out.println(Arrays.toString(nums));
//        rightRotate(nums,k);
//        System.out.println(Arrays.toString(nums));


        //most optimal
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    //brute force

//    static  void leftRotate(int[] arr,int k){
//        int n=0;
//        while(n <= k){
//
//            int value= arr[0];
//            for (int i=0 ; i< arr.length-1; i++){
//                arr[i] = arr[i+1];
//
//            }
//            arr[arr.length-1] = value;
//        n++;
//        }
//    }
//    static  void rightRotate(int[] arr,int k){
//        int n=0;
//        while(n < k){
//
//            int value= arr[arr.length-1];
//            for (int i=arr.length-1 ; i> 0; i--){
//                arr[i] = arr[i-1];
//
//            }
//            arr[0] = value;
//            n++;
//        }
//    }


//    optimal approach
//
//  i was rotating multiple times in before 0(n*k)

//    static  void leftRotate(int[] arr,int k){
//        int n = arr.length;
//        //find number of rotation
//        k = k % n;
////now make a temp arr and store the value upto we wanna rotate
//        int[] temp = new int[k];
//        for (int i = 0; i < k; i++) {
//            temp[i] = arr[i];
//        }
//
//        // now we replace the elemennt to left
//        for (int i = 0; i < n-k; i++) {
//            arr[i] = arr[i+k];
//        }
//
//        // now store temp array to main narray
//        for (int i = n-k; i < n; i++) {
//            arr[i] = temp[i + k - n];
//        }
//
//
//
//    }
//
//    static  void rightRotate(int[] arr,int k){
//        int n = arr.length;
//        //find number of rotation
//        k = k % n;
////now make a temp arr and store the value upto we wanna rotate
//        int[] temp = new int[k];
//        for (int i = n - k; i < n; i++) {
//            temp[k + i -n] = arr[i];
//        }
//        System.out.println(Arrays.toString(temp));
//        // now we replace the elemennt to left
//        for (int i = n - k -1; i >= 0; i--) {
//            arr[i + k ]= arr[i];
//        }
//
//        // now store temp array to main narray
//        for (int i = 0; i < k; i++) {
//            arr[i] = temp[i];
//        }
//
//
//
//    }


static  void reverse(int[] arr,int start,int end){

        while( start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
}

}
