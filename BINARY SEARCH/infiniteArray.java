
//find ther position of an element in infinite array
public class infiniteArray {
    public static void main(String[] args) {
int[] arr={1,2,4,6,9,12,23,45,67,78,81,89,100};
int res = findRange(arr, 100);
        System.out.println(res);
    }
    static  int findRange(int[] arr, int tartget){
        int start = 0;
        int end = 1;

        //now if target is there in bet range otherwuse double range

        while ( tartget > arr[end]){
            int temp = end +1;  // dont update start here cuz we wanna use start value in end
            //give value to end
            // end = previousend + boxsize * 2;
            //box size = end - start +1;
            end = end +(end - start + 1) * 2;  //upadet end
            start = temp;     //update start
        }
        System.out.println(start);
        System.out.println(end);
        return binasySearch(arr, tartget, start, end);
    }

    static  int binasySearch(int[] arr, int target,int start,int end ){
        while (start <= end){
            int mid = start + (end- start)/2;
            if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return  mid;
            }
        }
        return  -1;
    }
}
