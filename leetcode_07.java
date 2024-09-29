//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside
// the signed 32-bit integer range [-231, 231 - 1], then return 0.

public class leetcode_07 {
    public static void main(String[] args) {
int x = 236577756;
        System.out.println(reverseInt(x));
        System.out.println(Integer.MAX_VALUE);
    }

    public  static  int reverseInt(int x){
        int reversed = 0;
        int dg = 0;
        while(x != 0){
            dg = x % 10;

            //check ur revesred value is not exeeding the condition given

            if( reversed > (Integer.MAX_VALUE-dg)/10 || reversed < (Integer.MIN_VALUE-dg)/10){
                return 0;
            }


            reversed = reversed *10 +dg;
            x = x / 10;

        }
        return reversed;
    }
}


