package lab3;

import java.util.Scanner;

public class Quiz1_BMI {

    public static void main(String[] args) {
        double w,h;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        w = sc.nextDouble();
        System.out.print("Enter your height (m): ");
        h = sc.nextDouble();

        //calculate BMI
        double bmi = w / (h * h);
        System.out.println("BMI = "+bmi);
        //Test condition
        if (bmi <18.50)
            System.out.println("น้ำหนักน้อย/ผอม");
        else if ((bmi >=18.50) && (bmi <=22.90))
            System.out.println("ปกติ/สุขภาพดี");
        else if (bmi >= 23 && bmi <= 24.90)
            System.out.println("ท้วม/โรคอ้วนระดับที่ 1");
        else if (bmi >= 25 && bmi <= 29.90)
            System.out.println("อ้วน/โรคอ้วนระดับที่ 2");
        else
            System.out.println("อ้วนมาก/โรคอ้วนระดับที่ 3");



    }//main

}//class