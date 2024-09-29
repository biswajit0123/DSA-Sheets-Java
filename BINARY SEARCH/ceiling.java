
class  ceiling{
    public static void main(String[] args) {

int[] arr={1,4,7,9};
int resu=ceil(arr,4);
        System.out.println(resu);
    }
    static  int ceil(int[] arr, int target){
        int start= 0;
        int end=arr.length-1;

        while(start <= end){
        int mid= start + (end-start)/2;
//        if (arr[mid] == target){
//            return mid;
//        }
        if (arr[mid] > target) {
                end = mid-1;
        }else {
                start = mid+1;
        }

        }
        return  start;
    }
}