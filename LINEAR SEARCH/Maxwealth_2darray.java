
//find the max welth and return

public class Maxwealth_2darray {
    public static void main(String[] args) {
        int[][] accounts={
                {2,4,7},
                {1,5,8},
                {12,0,7},
                {100,4,7}
        };
        System.out.println(maxWealth(accounts));
    }
    static  int maxWealth(int[][]  accounts){
        int max=Integer.MIN_VALUE;
         for (int[] person : accounts){
             int sum=0;
             for (int wealth : person ){
                 sum +=wealth;
             }
             if (sum>max){
                 max=sum;
             }
         }
         return  max;
    }
}
