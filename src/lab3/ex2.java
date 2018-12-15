package lab3;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);
        //name
        System.out.print("What is your nickname ? : ");
        name = sc.nextLine();
        System.out.println("Hello,"+ name );

        //age
        System.out.print("How old are you ? : ");
        int age = sc .nextInt();
        System.out.println("You are "+ age +" years old." );

        if (age >30) System.out.println("You are older.");
        else System.out.println("You are younger.");

        //address
        System.out.print("Where are you ? : ");
        int address = sc.nextInt();
        System.out.println("You are "+ address );

        //Telephone
        System.out.print("your phone number ? : ");
        int Telephone = sc.nextInt();
        System.out.println("You Telephone  "+ Telephone );

        String sex;
        Scanner se = new Scanner(System.in);
        //sex
        System.out.print("What sex are you ? : ");
        sex = se.nextLine();
        System.out.println("You sex "+ sex );


    }//main
}//class
