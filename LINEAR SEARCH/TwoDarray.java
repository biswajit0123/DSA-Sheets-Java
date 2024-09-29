import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDarray {
    public static void main(String[] args) {
        int[][] arr={
            {23,45,67,89},
            {23,15,67,81},
            {83,45,62,69},
            {212,99}
        };
        int[] ans=search(arr,457);
        System.out.println(Arrays.toString(ans));
    }

    static  int[] search(int[][] arr, int target){
        for (int row=0; row<arr.length; row++){
            for (int col=0; col<arr[row].length; col++){
int elem=arr[row][col];
if (elem == target){
    return new int[] {row,col};
}
            }

        }
        return new int[] {-1,-1};

    }

}
