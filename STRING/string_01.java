import java.util.concurrent.LinkedTransferQueue;

public class string_01 {
    public static void main(String[] args) {
//// 1
//        ///  str and a reference to same object so inside string pool objectr
//        // will be created only once   and hence it is immutable chnage by one will not affect to other variable
//
//        String str = "biswajit muduli";
//        String a = "biswajit muduli";
//
//        // you can check by using ==
//
//        System.out.println(str == a);
//        System.out.println(str);



// 2

        // create two different object

        String name1= new String("false");
        String name2= new String("false");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

    }
}
