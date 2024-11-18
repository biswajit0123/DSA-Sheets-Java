// check ifd the array is sortde or not using recuirsion


public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSOrted(arr,0));
    }

    static boolean isSOrted(int[] arr, int index){

        if(index == arr.length -1){
            return true;
        }

        boolean isSort = arr[index] < arr[++index] && isSOrted(arr,index++);

        return isSort;
    }
}
