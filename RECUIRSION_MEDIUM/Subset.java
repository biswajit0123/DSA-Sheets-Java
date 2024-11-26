import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        String str = "abc";
        subset("",str);

        // retuern in array list

        System.out.println(substRet("",str));
    }

    static  void subset(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subset(p,up.substring(1));
        subset(p+ch,up.substring(1));
    }

    //rerun list

    static ArrayList<String> substRet(String p, String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = substRet(p+ch,up.substring(1));
        ArrayList<String> right = substRet(p,up.substring(1));

left.addAll(right);
return left;
    }

}
