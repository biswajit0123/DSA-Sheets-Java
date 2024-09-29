
//peek element in mountaiin array
//Input: arr = [0,1,0]
//Output: 1
//162 is also same approach
    public class leetcode_852 {
    public static void main(String[] args) {
int[] arr = {12,34,56,78,65,43,21};
int res = peekElement(arr);
        System.out.println(arr[res]);;
    }
    public  static  int peekElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while( start < end ){
            int mid= start + (end-start)/2;

            if( arr[mid] > arr[mid+1]) {
                //im in the decreasing part of the array
                end = mid;

            }else{
                start = mid+1;
            }
        }
        return  end;
    }
}
