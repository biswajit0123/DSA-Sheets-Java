
public class SkipCharecter {

    public static void main(String[] args) {
//        String str = "baccad";
//        skipChar(str);

        //for reciursion
//        String str = "baccad";
//        String s = "";
//        skipChar(s,str);


        // recuirsion with return type
        String str = "baccad";
        String s = "";
        String res = skipChar(str);
        System.out.println(res);
    }


//    simaple method

//    static  void skipChar(String str){
//        StringBuilder str1 = new StringBuilder();
//        for (int i = 0; i< str
//                .length(); i++){
//
//            if (str.charAt(i) == 'a'){
//                continue;
//            }else {
//                str1.append(str.charAt(i));
//            }
//        }
//        System.out.println(str1);
//    }




    //using  recuirsion

//    static  void skipChar(String p, String up){
//
//        // bae case of recuirsion
//        if ( up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        if (up.charAt(0) == 'a'){
//            skipChar(p,up.substring(1));
//        }else {
//            skipChar(p+up.charAt(0), up.substring(1));
//        }
//
//    }

//    with return type

     static  String skipChar( String up){

         // bae case of recuirsion
         if ( up.isEmpty()){
          return "";
         }
 char ch = up.charAt(0);
         if (up.charAt(0) == 'a'){
            return skipChar(up.substring(1));
         }else {
            return ch + skipChar( up.substring(1));
         }

     }
}
