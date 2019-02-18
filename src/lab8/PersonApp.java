package lab8;

public class PersonApp {
    public static void main(String[] args) {

        //create object
        Person person1,person2,person3;
        person1 = new Person("PID001","Bow","1998");
        person2 = new sheriff("PID002","chanyanut","1999","Thungsong");
        person3 = new Police("PID002","raksasaeng","2000","chanyanutraksasaeng");
    person1.introduce();
    person2.introduce();
    person3.introduce();
    }
}//class
