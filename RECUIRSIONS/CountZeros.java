public class CountZeros {
    public static void main(String[] args) {
        int num= 1002;
        int ct = 0;



        int result = countZero(num, ct);
        System.out.println(result);
    }

    static int countZero(int n, int ct){
        if (n == 0 ){
            return ct;
        }

        int dg = n % 10;
        if (dg == 0){
            ct++;
        }

      return   countZero(n / 10, ct);

    }


}
