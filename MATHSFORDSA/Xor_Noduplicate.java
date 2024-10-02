
// find the elemnt which is not duplicate

public class Xor_Noduplicate {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,7,4,1,2,5};
        System.out.println(notAduplicate(arr));
    }
    static  int notAduplicate(int[] arr){
        int unique =0;

        for (int elem : arr){
            unique = unique ^ elem;
        }

        return unique;
    }
}
