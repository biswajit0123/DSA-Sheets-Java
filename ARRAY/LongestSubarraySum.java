//https://www.naukri.com/code360/problems/longest-subarray-with-sum-k


public class LongestSubarraySum {
    public static void main(String[] args) {
int[]  arr = {1 ,2 ,3 ,1 ,1 ,1 ,1};
        System.out.println(longestSun(arr,3,7));
    }

    static  int longestSun(int[] arr, int k, int n){
        int length = 0;

        for (int i =0 ; i< n ; i++){
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int l = i; l <=j; l++) {
                    sum = sum+arr[l];
                }
                if (sum == k){
                    length = Math.max(length,j-i+1);
                }
            }
        }
        return  length;
    }
}
