//Input: s = "  hello world  "
//        Output: "world hello"

import java.util.Arrays;

public class Q151 {
    public static void main(String[] args) {
//        System.out.println(reverseString("   hello india you uj"));

        System.out.println(reverse2("heelo j"));

    }

    static  String reverseString(String str){
        int i=0;
        int j=0;
        int  n = str.length();

String result="";

while (j<n){
    while (i < n && str.charAt(i) == ' '){
        i++;
    }
    j=i+1;

    while (j<n && str.charAt(j) != ' '){
        j++;
    }
    String word = str.substring(i,j);
    result = word+" "+result;

    i=j+1;

}

        return result;
    }

    //another way

    static  String reverse2(String str){
        StringBuilder sb =new StringBuilder();

        String[] words = str.split(" +");
        for (int i = words.length-1; i >=0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return  sb.toString();
    }
}
