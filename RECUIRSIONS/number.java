// print numbers  from 1  to 6 using recuirsion
public class number {
    public static void main(String[] args) {
        fun(6);
        funrev(6);
    }

    static  void fun(int n){
        if (n == 0 )
            return;
        System.out.println(n);
        fun(n-1);
    }

    static  void funrev(int n){
        if (n == 0 )
            return;

        funrev(n-1);
        System.out.print(" "+n);
    }
}
