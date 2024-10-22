//485. Max Consecutive Ones

//        Given a binary array nums, return the maximum
//        number of consecutive 1's in the array.

//        Input: nums = [1,1,0,1,1,1]
//        Output: 3

import javax.swing.plaf.IconUIResource;

public class MaximumCosequtive {

    public static void main(String[] args) {
int[] arr = {0,1,1,0,1,1,1,1};
int ans = maxConsequtive(arr);
        System.out.println(ans);
    }

    static int maxConsequtive(int[] arr){
        int maxLength = 0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1){
                count = count+1;
            }
            if (arr[i] == 0) {
                if (count > maxLength){
                    maxLength = count;
                }
                count =0;
            }

        }
        // cuz lastly zero is not there so second conditonj will njot be checked,
        // hence check once again in between count and maxlength
        maxLength = Math.max(maxLength,count);
        return  maxLength;
    }

}
