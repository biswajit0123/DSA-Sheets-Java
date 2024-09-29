public class searchChar {
    public static void main(String[] args) {
String str="biswajit";
        System.out.println(searchString(str,'w'));
    }
    public static  int  searchString(String str, char target){
        if (str.length()==0){
            return  -1;
        }
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if (ch == target){
                return  i;
            }
        }
        return  -1;
    }
}
