import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr= {4,2,7,4,6};
        int[] arr2= {8,2,5,4,6};

        selectionSort(arr);
        selectionSort2(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }

    //method 1
    public static  void selectionSort(int[] arr){
        for ( int i = 0; i < arr.length-1 ; i++){
            int minIndex = i;
            for (int j = i+1; j<arr.length; j++){
if (arr[minIndex] > arr[j]){
    minIndex=j;
}
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i]= temp;
        }
    }

    //method2
    public static void selectionSort2(int[] arr){
for (int i=0 ; i < arr.length; i++){

    int lastIndex= arr.length-1-i;
    int maxINdex= getMaxIndex(arr,lastIndex);

    swap(arr,lastIndex, maxINdex);

}
    }

    static int getMaxIndex(int[] arr, int lastIndex){
        int index=0;
        for (int i=0; i<= lastIndex ; i++){
if (arr[index] < arr[i]){
    index = i;
}
        }
        return index;
    }

    static  void swap(int[] arr, int max, int last){
        int temp= arr[max];
        arr[max] =arr[last];
        arr[last] =temp;
    }


}
