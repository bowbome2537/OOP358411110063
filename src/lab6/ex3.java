package lab6;

import java.util.StringTokenizer;

public class ex3 {

    public static void main(String[] args) {

        String myMsg = "I am working at RUTS 2018";
        StringBuffer strBuf = new StringBuffer(myMsg);

        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.append(" Happy New Year, 2019");
        System.out.println(strBuf);

        //StringTokenizer
        StringTokenizer token = new StringTokenizer(strBuf.toString());
        System.out.println(token);
        System.out.println(token.countTokens());

        //cutting words form String
        while (token.hasMoreElements()){
            System.out.println(token.nextToken());
        }


    }//main
}//ex3
