
//1342. Number of Steps to Reduce a Number to Zero

//Given an integer num, return the number of steps to reduce it to zero.
//
//In one step, if the current number is even, you have to divide it by 2,
// otherwise, you have to subtract 1 from it.

//Example 1:
//
//Input: num = 14
//Output: 6
//Explanation:
//Step 1) 14 is even; divide by 2 and obtain 7.
//Step 2) 7 is odd; subtract 1 and obtain 6.
//Step 3) 6 is even; divide by 2 and obtain 3.
//Step 4) 3 is odd; subtract 1 and obtain 2.
//Step 5) 2 is even; divide by 2 and obtain 1.
//Step 6) 1 is odd; subtract 1 and obtain 0.
public class CountSteps {
    public static void main(String[] args) {

        int num = 3;
//       int steps =  countSterps(num);
//        System.out.println(steps);

        //using recuirstion
        int steps =  countSterps2(num,0);
        System.out.println(steps);
    }

    static  int countSterps(int num){
        int steps = 0;
//        if (num == 0){
//            return steps;
//        }
        while(num > 0){
            if (num % 2 == 0 ){
                num = num / 2;
                steps++;
            }else{
                num = num - 1;
                steps++;
            }
        }
        return  steps;

    }

    //using recuirsion

    static  int countSterps2(int num, int ct){
        if (num == 0){
            return ct;
        }

        if (num % 2 == 0){
            return countSterps2(num/2, ++ct);
        }else {
            return countSterps2(num - 1, ++ct);
        }
    }
}
