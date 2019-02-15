package MidTerm;
import java.util.Scanner;
public class TexCalculater {
    public static void main(String[] args) {
        String name,number;
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
//ชื่อ-สกุล
        System.out.print("ชื่อ-สกุล?  : ");
        name = sc.nextLine();
        System.out.println("ชื่อ-สกุล :"+name);
//เลขบัตร
        System.out.print("เลขบัตรประชาชน? : ");
        number = sc.nextLine();
        System.out.println(" เลขบัตรประชาชน "+number+ "  ");

        //ภาษี

        System.out.print("เงินเดือน ภาษี : ");
        int  Salary = ss.nextInt();
        System.out.println("ภาษี " +Salary+ " ต่อปี ");

        if (Salary <= 150000) {
            int Vat = (Salary * 0) / 100;
            System.out.println("ไม่เสียภาษี " );
        } else if (Salary >= 150001 && Salary <= 300000) {
            int Vat = (Salary * 5) / 100;
            System.out.println("ภาษีที่ต้องชำระ : " + Vat);
        } else if (Salary >= 300001 && Salary <= 500000) {
            int Vat = (Salary * 10) / 100;
            System.out.println("ภาษีที่ต้องชำระ : " + Vat);
        } else if (Salary >= 500001 && Salary <= 750000) {
            int Vat = (Salary * 15) / 100;
            System.out.println("ภาษีที่ต้องชำระ : " + Vat);

        }else if (Salary >= 750001 && Salary <= 1000000) {
            int Vat = (Salary * 20) / 100;
            System.out.println("ภาษีที่ต้องชำระ : " + Vat);

        }else if (Salary >= 1000001 && Salary <= 2000000) {
            int Vat = (Salary * 25) / 100;
            System.out.println("ภาษีที่ต้องชำระ : " + Vat);

        }else if (Salary >= 2000001 && Salary <= 5000000) {
            int Vat = (Salary * 30) / 100;
            System.out.println("ภาษีที่ต้องชำระ : " + Vat);

        } else if (Salary >= 5000001) {
            int Vat = (Salary * 35) / 100;
            System.out.println("ภาษีที่ต้องชำระ : " + Vat);

        }
        {
        }

    }//main
}//class