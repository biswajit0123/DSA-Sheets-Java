public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,11,22,33,34,36,44,55,61,83,93};
        int[] arr={12,11,10,7,4,2};
        int result= search(arr, 1);
        System.out.println(result);
    }
    static  int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

while(start <= end){
    int mid = start + (end - start)/2;
    if (arr[mid] == target){
        return  mid;
    }
    if (arr[start] < arr[end]){
       if (arr[mid] > target) {
            end = mid-1;
        }else {
            start = mid+1;
        }
    }else{
      if (arr[mid] > target) {
            start = mid+1;
        }else {
            end = mid-1;
        }
    }

}
return -1;
    }
}
