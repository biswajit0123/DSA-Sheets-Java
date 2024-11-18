// watch SkipCharecter

public class SkipString {
    public static void main(String[] args) {

        String str= "sappleojfgn";
     String s= skipString(str);
        System.out.println(s);

        System.out.println("app not apple ");
        System.out.println(skipAppNotAplle(str));
    }

    static  String skipString(String str){

        if (str.isEmpty()){
            return  "";
        }

        if (str.startsWith("apple")){
            return  skipString(str.substring(5));
        }else {
            return str.charAt(0) + skipString(str.substring(1));
        }

    }

    static  String skipAppNotAplle(String str){

        if (str.isEmpty()){
            return  "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")){
            return  skipAppNotAplle(str.substring(3));
        }else {
            return str.charAt(0) + skipAppNotAplle(str.substring(1));
        }

    }

}
