package lab6;

public class ex1 {

    public static void main(String[] args) {

        String msg = "Hello, IS441";
        System.out.println(msg.length());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());

        String msg2 = "RUTS";
        String msg3 = msg.concat(msg2);// +
        System.out.println(msg3);

        System.out.println(msg3.replace('l','b'));

    }//main
}//ex1
