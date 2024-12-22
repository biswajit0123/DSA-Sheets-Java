import java.util.*;



public class Leetcode_17 {
    public static void main(String[] args) {

        pad("", "89");
        System.out.println( padret("","12"));

    }
    static void pad(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

         int digit =up.charAt(0) - '0';
        for(int i = (digit -1) * 3 ;i < digit * 3; i++){
            char ch = (char)('a' + i);
            pad(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> padret(String p, String up){
        if (up.isEmpty()){
         ArrayList<String> l = new ArrayList<>();
         l.add(p);
         return l;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit =up.charAt(0) - '0';
        for(int i = (digit -1) * 3 ;i < digit * 3; i++){
            char ch = (char)('a' + i);
           list.addAll( padret(p+ch,up.substring(1)));
        }

        return list;
    }
}
