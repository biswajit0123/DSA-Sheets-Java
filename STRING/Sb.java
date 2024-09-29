public class Sb {
    public static void main(String[] args) {



        // this will take 0(n^2)
        String str ="";

        for (int i = 0; i<26; i++){
            char ch =(char)  ('a' + i);
            str += ch;
        }

        System.out.println(str);

        // this will take 0(n)
        StringBuilder builder =new StringBuilder();
        for (int i = 0; i<26; i++){
            char ch =(char)  ('a' + i);
        builder.append(ch);
        }

        System.out.println(builder);

    }
}
