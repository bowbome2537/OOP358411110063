package lab8;

public class Police extends Person{
    private String workCountry;

    //constructor

    public Police(String pID, String name, String yearBoen, String police) {
        super(pID, name, yearBoen);
        this.workCountry = workCountry;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am police work at "+this.workCountry);
    }

    // getter and setter method
    public String getPolice() {
        return workCountry;
    }

    public void setPolice(String police) {
        workCountry = police;
    }
}//class
