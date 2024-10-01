public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {2,4,7,8,9};
        int target = 9;
int result = binarySearch(arr,target,0,arr.length-1);
        System.out.println(result);
    }

    static  int binarySearch(int[] arr, int target,int start,int end) {

        if (start > end){
            return  -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] < target){
            return binarySearch(arr,target,mid+1,end);
        }
        return binarySearch(arr,target,start,mid-1);

    }
}


