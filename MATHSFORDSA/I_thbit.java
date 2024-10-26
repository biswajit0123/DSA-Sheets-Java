

// find the ith bit of a number
public class I_thbit {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(findBit(num,1));
    }

    static int findBit(int n,int pos){
        return  n & (1 << (pos-1));
    }
}
