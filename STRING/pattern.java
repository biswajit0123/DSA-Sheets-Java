public class pattern {
    public static void main(String[] args) {

//        pattern1(4);
//        System.out.println();
//        pattern2(4);
//        System.out.println();
//        pattern3(4);
//        System.out.println("pattern 4");
//        pattern4(5);
//        System.out.println("patterrn 5 #important");
//        pattern5(5);
//        System.out.println("pattern 6");
//        pattern6(5);
//        System.out.println("pattren 7");
//        pattern7(5);
//
//        System.out.println("pattern 8");
//        pattern8(5);
        System.out.println("pattern 9 ##VVI");
        pattern9(4);
    }

    static  void pattern1(int n){
        for (int row= 1; row <= n; row++){
            for (int col = 1; col <= row; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static  void pattern2(int n){
        for (int row= 1; row <= n; row++){
            for (int col = 1; col <= n; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


//
//    static  void pattern3(int n){
//        int m=n;
//        for (int row= 1; row <= n; row++){
//            for (int col = 1; col <= m; col ++){
//                System.out.print("*");
//            }
//            m--;
//            System.out.println();
//        }
//    }
    //optimal way of 3
    static  void pattern3(int n){
        for (int row= 1; row <= n; row++){
            for (int col = 1; col <= n-row+1; col ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static  void pattern4(int n){
        for (int i=1; i <= n; i++){
            for (int j=1; j<= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){

        for (int row = 1; row <= (2*n)-1; row++){
            if (row <= n){
                for (int incol = 1; incol <= row; incol++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for (int decol = 1; decol <= n-(row-n); decol++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            }


        }


//    static void pattern6(int n){
//
//        for (int row = 1; row <= (2*n)-1; row++){
//            if (row <= n){
//                int spaces = n-row;
//                for (int i = 0; i < spaces; i++) {
//                    System.out.print(" ");
//                }
//                for (int incol = 1; incol <= row; incol++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }else{
//                int spaces = row-n;
//                for (int i = 0; i < spaces; i++) {
//                    System.out.print(" ");
//                }
//                for (int decol = 1; decol <= n-(row-n); decol++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//
//        }
//
//
//    }
    //optimal way of pattern6
    static  void pattern6(int n)  {
        for (int row = 0; row <= 2 * n; row++) {
            int totalcol = row <= n ? row : (2 * n) - row ;
            int spaces = n - totalcol;

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void  pattern7(int n){
        for (int row = 1; row <= n; row++) {

            int spaces = n - row;
            for (int i = 1; i <=  spaces; i++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static  void  pattern8(int n){
        for (int row = 1; row <= 2*n-1 ; row++) {
int totalcol = row > n ? (2*n)-row : row;
            for (int space = 1; space <= n-totalcol; space++) {
                System.out.print("  ");
            }
            for (int col = totalcol; col >= 1 ; col--) {
                System.out.print(col+" ");
            }

            for (int col = 2; col <=totalcol ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static  void pattern9(int n){

        int N = 2*n;
        for (int row = 0; row <= N; row++) {
            for (int col = 0; col <= N; col++) {
int atEveryIndex =n-( Math.min(Math.min(row,col),Math.min(N-row,N-col)))+1;
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
