import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {


        int[] arr ={-56,74,-2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // we think that 1 st elemenmt is already sorted
    static void insertionSort(int arr[]){

        for (int i=0; i < arr.length-1; i++){
            for (int j= i+1; j>0; j--){

                if (arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }

            }
        }
    }

    //swap

    static  void swap(int arr[],int j,int k){
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
