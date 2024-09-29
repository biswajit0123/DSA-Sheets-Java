
//search a ytargeted bvalue from an array

public class LINEARsEARCH_01 {

    public static void main(String[] args) {
int[] arr={23,45,67,89,34,6,7,886};
int result=linearSearch(arr , 34);
        System.out.println(result);
        System.out.println(serachElement(arr,0));

    }
    // return idex value if value find in array
    public  static int linearSearch(int[] arr,int  target){
        if (arr.length == 0){
            return  -1;
        }

        for (int index=0; index<arr.length; index++){
            int elemect =arr[index];
            if ( elemect == target){
                return index;
            }
        }
        // if not found then treturn
        return  -1;
    }

    // retyrn element if present inside array

    public static  int serachElement(int[] arr, int target){
        if (arr.length == 0){
            return  -100000;
        }
        for (int a: arr){
            if (a == target){
                return  a;
            }
        }
        return  -100000;

    }
}
