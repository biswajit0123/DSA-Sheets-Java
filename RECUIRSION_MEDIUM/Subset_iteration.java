
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Subset_iteration {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        List<List<Integer>> list = subset(arr);

        for (List l : list){
            System.out.print(l+" ");
        }

        //in case duplicate
        System.out.println("in case of duplicate");
        int[] arr2 = {1,2,2};
        List<List<Integer>> list2 = subset2(arr2);

        for (List l : list2){
            System.out.print(l+ " ");
        }
    }

    static List<List<Integer>> subset(int[] arr){

        // make outer loop with one empty list
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        //then for each elemnt in array
        for (int num : arr){
            //find the outer size so that we copy and the num and then add to outer list

            int n = outer.size();
            for(int i =0; i< n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }


        return outer;
    }


    //in case of duplicate
    static List<List<Integer>> subset2(int[] arr){
        Arrays.sort(arr);
        // make outer loop with one empty list
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        //then for each elemnt in array
        for (int i=0; i< arr.length; i++){
            //find the outer size so that we copy and the num and then add to outer list
int start = 0;
if (i > 0 && arr[i] == arr[i-1]){
    start = outer.size()/2;
}
            int n = outer.size();
            for(int j =start; j< n; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }


        return outer;
    }
}
