// find thae value and in arraylist

import java.util.ArrayList;

public class SearchReturnArraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,4,8,4};

//        ArrayList<Integer> list = searchTarget(arr, 5,0,new ArrayList<>());
//        System.out.println(list);

        //return arraylist without taking argument  vvi
        //but the first one optimal than this
        ArrayList<Integer> list2 = searchTarget(arr, 4,0);
        System.out.println(list2);
    }

    static ArrayList searchTarget(int[] arr, int target, int index, ArrayList<Integer> list){

        if (index == arr.length ) return list;

        if (arr[index] == target) {
            list.add(index);
        }

       return searchTarget(arr,target,++index,list);

    }


    //return arraylist without taking in argument
    static ArrayList searchTarget(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length ) return list;

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> prevAns = searchTarget(arr,target,++index);
       list.addAll(prevAns);
return list;
    }
}
