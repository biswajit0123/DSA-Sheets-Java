import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {


        permutation("","str");

        //return array list
        ArrayList<String> list = permutationlist("","abc");
        System.out.println(list);

        //number of permutation
        System.out.println(permutatonCount("","abc"));
    }
    static  void permutation(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i =0 ; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f + ch + s,up.substring(1));
        }
    }


    //returning asraay list
    static  ArrayList<String> permutationlist(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
ArrayList<String> ans = new ArrayList<>();
        for (int i =0 ; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           ans.addAll( permutationlist(f + ch + s,up.substring(1)));
        }
    return ans;
    }

    static int permutatonCount(String p,String up){
        if (up.isEmpty()){
        return 1;
        }
        char ch = up.charAt(0);
int count =0;
        for (int i =0 ; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
           count = count + permutatonCount(f + ch + s,up.substring(1));
        }
    return  count;
    }
}
