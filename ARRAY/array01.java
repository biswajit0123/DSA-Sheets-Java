public class array01 {
    public static void main(String[] args) {
     //find second largest
        int[] arr = {2,5,3,8,4,9,10,56};
        System.out.println(secondLargest(arr));
    }
    static  int secondLargest(int[] arr){
        int largest = arr[0];
        int Slargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest){
                Slargest = largest;
                largest = arr[i];
            }

            if (arr[i] > Slargest && arr[i] < largest){
                Slargest = arr[i];
            }
        }
        return Slargest;
    }
}
