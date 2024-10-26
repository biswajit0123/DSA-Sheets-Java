
//28. Find the Index of the First Occurrence in a String

//Given two strings needle and haystack, return the index of the first occurrence of needle
// in haystack, or -1 if needle is not part of haystack.

//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
public class Leetcode_28 {
    public static void main(String[] args) {
       String haystack = "bbbbababbbaabbba";
       String needle = "abb";

        System.out.println(fisrtOccure(haystack,needle));
//optimal than above
        System.out.println(fistOccure(haystack,needle));
    }

    //self
    //show wromg fro this input bbbbababbbaabbba
    static int fisrtOccure(String s, String t){
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
int start = 0;
        int flag = 0;

//sadbutsad but
        for (int i = 0; i < sc.length; i++) {
            
            if (tc[0] == sc[i]) {
                start = i ;
            }
            flag = 0;
            for (int j = 0; j < tc.length; j++) {
if (start > sc.length-1){return -1;}
                if (sc[start] != tc[j] ){
                    flag = 1;
                    break;
                }
                start=start+1;
            }
            if (flag == 0){
                return i;
            }
            }


        return -1;

    }

    //optimal from above
static int fistOccure(String s, String t){

        //find the fist t occure
    for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(0)){
                if (comare(s,t,i) == true) {
                    return i;
                }
                }
            }
    return  -1;
    }

    static  boolean comare(String s,String t, int idx){

        int n1 = s.length();
        int n2 = t.length();

        for (int i = 0; i< n2; i++){
            if (idx >= n1) return false;
            if (s.charAt(idx++) != t.charAt(i) ){
                return  false;
            }
        }

        return  true;
    }


}
