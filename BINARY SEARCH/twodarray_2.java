import java.util.Arrays;

public class twodarray_2 {

    public static void main(String[] args) {
        int[][] arr = {
                {1,   2,  3,  4, 5},
                {6,   7,  8,  9, 10},
                {11, 12 ,13, 14, 15},
                {16, 17, 18, 19, 20},
        };

        int target= 1;
        int res[] = searchtarget(arr,target);
        System.out.println(Arrays.toString(res));
    }

    // retun res in aray format
    public  static int[] searchtarget(int[][] matrix, int target){
        int rowstart= 0;
        int rowend = matrix.length - 1;
        int colstart = 0;

        while( rowstart <= rowend){
            int mid = rowstart + (rowend - rowstart)/2;
            int colend= matrix[mid].length -1;

            if(target <= matrix[mid][colend] && target >= matrix[mid][colstart]){
                return binarySearch(matrix,mid,target);
            }

            if(target >  matrix[mid][colend]){
                rowstart = mid +1;
            }else{
                rowend = mid-1;
            }
        }
        return  new int[] {-1,-1};
    }


    //binary seach on that particul;ar roow

    public  static  int[] binarySearch(int[][] matrix, int row, int target){
        int start = 0;
        int end = matrix[row].length - 1;

        while(start <= end){
            int mid = start + (end- start)/2;

            if (matrix[row][mid] == target){
                return  new int[] {row, mid};
            }

            if(matrix[row][mid] < target){
                start = mid +1;
            }else {
                end = mid-1;
            }
        }
        return  new int[] {-1, -1};
    }
}
