
//buble sort is stable
// time complexity = 0(n)
// in worst case =0(n2)

import java.util.Arrays;

public class BUBLESORT_01 {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
 boolean swapped = false;
        bubleSort(arr,swapped);
        System.out.println(Arrays.toString(arr));
    }


    // algorithm
    public static  void bubleSort(int[] arr,boolean swapped){
int ct=0;
int m=0;
        for (int i =0; i < arr.length; i++){
m++;
            //the way i increase j will decrease
            for (int j = 1; j < arr.length - i ; j++){
                ct++;

                // compare
                if ( arr[j] < arr[j-1] ){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if (!swapped){
                break;
            }

        }
        System.out.println(ct*m);

    }
}
