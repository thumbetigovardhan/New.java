public class String_Methods {

        public static void main(String[] args) {

        String str = "Govardhan info tech";
        String s1=str.toLowerCase();
        String s2=str.toUpperCase();
        String s3=str.substring(5,9);
        String s4=str.substring(8);
        String s5=str.concat("++");
        String s6[]=str.split("_");
      // char ch[]=str.tochar("");


        System.out.println("Str:"+str);
        System.out.println("S1:"+s1);
        System.out.println("S2:"+s2);
        System.out.println("S3:"+s3);
        System.out.println("S4:"+s4);
        System.out.println("S5:"+s5);
        System.out.println("S6:"+s6);
      //  System.out.println("char:"+ch);
    }
}
