import java.util.Scanner;

public class leetcode_709 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a string:");
        String str = sc.nextLine();


        System.out.println(tolow(str));
    }
    static  String tolow(String s){

         StringBuilder sb =new StringBuilder();

         for (char c: s.toCharArray()){
             if (c >= 'A' && c <= 'Z'){
                 c = (char) (c+32);
             }
             sb.append(c);
         }
         return sb.toString();

    }
}
