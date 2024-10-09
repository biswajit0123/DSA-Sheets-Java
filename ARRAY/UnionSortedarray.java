import java.util.*;

public class UnionSortedarray {
    public static void main(String[] args) {
   int[]  arr1 = {1, 2, 3, 4, 5};
    int[] arr2  = {1, 2, 3, 6, 7};

//    unionSortedArray(arr1, arr2);
        System.out.println("optimal approach");
    optimalUnion(arr1,arr2);
    }

    static  void unionSortedArray(int[] arr1, int[] arr2){

        Set<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }

        for (int i : arr2) {
            set1.add(i);
        }

        int[] union = new int[set1.size()];
        int index =0;
   for (int i : set1){
       union[index++] = i;
   }
        System.out.println(Arrays.toString(union));
    }


    static  void optimalUnion(int[] arr1, int[] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;
        int i =0;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();

        while( i < n1 && j < n2){

            if( arr1[i] <= arr2[j]){
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while(i < n1){
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j < n2){
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        System.out.println(list);
        }
    }

