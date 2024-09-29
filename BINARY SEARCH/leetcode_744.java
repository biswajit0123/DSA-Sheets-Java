//
//You are given an array of characters letters that is sorted in non-decreasing
// order, and a character target. There are at least two different characters in letters.
//
//        Return the smallest character in letters that is lexicographically
//        greater than target. If such a character does not exist, return the first
//        character in letters.
//
//        Example 1:
//        Input: letters = ["c","f","j"], target = "a"
//        Output: "c"
//        Explanation: The smallest character that is lexicographically greater than 'a'
//        in letters is 'c'.

public class leetcode_744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target= 'c';
        System.out.println(smasllestLetter(letters,target));
    }

    static  char smasllestLetter(char[] letters,char target){
        int start= 0;
        int end=letters.length-1;

        while(start <= end){
            int mid=start+ (end-start)/2;
            if(letters[mid] > target){
                end = mid-1;
            }else {
                start=start+1;
            }
        }
return letters[start%letters.length];
    }
}
