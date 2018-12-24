package lab6;

public class ex2 {

    public static void main(String[] args) {

        //compare String
        String m = "Hello";
        String n = "Hello";
        // ==
        if (m==n)
            System.out.println(true);
        else
            System.out.println(false);
        //equal method
        if (m.equals(n))
            System.out.println(true);
        else
            System.out.println(false);
        //compareTo () method
        if (m.compareTo(n)==0)
            System.out.println(true);
        else if (m.compareTo(n)>0)
            System.out.println("m more than n");
        else
            System.out.println("m less than n");


    }//main
}//ex2
