
//Given an array nums of integers, return how many of them contain an even number of digits.
//
//
//
//        Example 1:
//
//        Input: nums = [12,345,2,6,7896]
//        Output: 2
public class evennumberdigit_001 {
    public static void main(String[] args) {
int[] arr={1,234,66, 78,1,22};
int ct=envenNumber(arr);
        System.out.println(ct);
    }
    static  int envenNumber(int[] arr){
        int cnt=0;
        for (int num : arr){
                if (isEven(num)){
                    cnt++;
                }
        }
        return  cnt;
    }
    static  int findDigit(int num){
 if (num <0 ){
     num= num * -1;
 }

        if (num == 0 ){
           return  1;
        }
        int count=0;
        while ((num > 0)) {

            count++;
            num=num/10;
        }
        return count;
    }
    static  boolean isEven(int num){
        int digit5= findDigit(num);
        if (digit5 % 2 == 0){
            return  true;
        }
        return  false;
    }
}
