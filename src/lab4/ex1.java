package lab4;

public class ex1 {

    public static void B(int a, int b){
        System.out.println("Hello B.");

    }//B

    public static void main(String[] args) {
        System.out.println("Hello Main.");
        //call method
//       for (int i = 0; i < 10; i++){
//        A();
//        }
        B(5,5);
        //int sum = C(10,10);
        System.out.println(C(10,10));
    }//main

    public static void A(){
        //statements
        System.out.println("Hello A.");
    }//A

    public static int C(int a, int b) {
        System.out.println("Hello C.");
        int c = a + b;
        return c;
    }//C


}//class
