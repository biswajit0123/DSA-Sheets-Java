//Given an array nums containing n distinct numbers in the range
// [0, n], return the only number in the range that is missing from the
// array.
//        Input: nums = [3,0,1]
//        Output: 2

public class Missingnumber {
    public static void main(String[] args) {
int[] arr = {3,0,1};
int Missing = findNumber(arr,3);
        System.out.println(Missing);

int optimal = optimal(arr,3);
        System.out.println(optimal);
    }

    static  int findNumber(int[] arr, int n){
//        trvaverse from 0 to that range n

        for (int i =0; i <= n; i++){
            //take a fdlag to see if there is missing then flag will be 0
            int flag =0;
            // trvaes the arra to chak present or not
            for (int j = 0; j < n; j++) {

                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            //if the i is missed then flag == 0 so
            if (flag == 0) return i;

        }

        return -1;
    }


    // optimal approach using sum

//    static  int optimal(int[] arr, int n){
//        int total = ( n * (n + 1) ) / 2;
//        int sum =0;
//        // find sum of arr
//        for (int i =0; i< n; i++){
//            sum += arr[i];
//        }
//        return  total - sum;
//    }

    // optimal approach using xor    this is  better than sum

    static  int optimal(int[] arr, int n){
        //fiind xor1 and xor 2
        int xor1=0;
        int xor2 = 0;
        for(int i=0; i< n; i ++){
            xor1 ^= i;
            xor2 ^= arr[i];
        }
        xor1 = xor1 ^ n;
        return  xor1 ^ xor2;
    }
}
