// set the bit to 1
// reset the bit to 0


public class Set_Reset_bit {
    public static void main(String[] args) {
        int n =2;
       int result= set(n,1);
        System.out.println(result);
        int result2= reset(n,2);
        System.out.println(result2);
    }
    static  int set(int n,int pos){
        int result=0;

        //crearte a mask
        int mask = 1 << ( pos - 1);
        result = n | mask;

        return  result;
    }



    static  int reset(int n,int pos){
        int result=0;

// create a mask
        int mask = ~(1 << (pos - 1));

        result = n & mask;
        return  result;
    }


}
