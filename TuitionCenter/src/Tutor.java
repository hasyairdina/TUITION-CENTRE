// name, IC, address, qualification, numExperience, dateJoined, numYearsCenter

public class Tutor {
    Name name;
    private String IC;
    Address address;
    private String qualification;
    private int numExperience;
    private String dateJoined;
    private int numYearsInCenter;
    Student student;  //each students is assigned to one tutor
    public Tutor(String IC, String qualification, int numExperience, String dateJoined, int numYearsInCenter){
        this.IC = IC;
        this.qualification = qualification;
        this.numExperience = numExperience;
        this.dateJoined = dateJoined;
        this.numYearsInCenter = numYearsInCenter;
    }

    //how nak buat 'each student is assigned to one tutor'

    //calling NAME class into TUTOR class
    public void setName(Name thename) {
        name = thename;
    }

    //calling ADDRESS class into TUTOR class
    public void setAddress(Address theaddress){
        address = theaddress;
        //System.out.println("Address is successfully saved");
    }

    public String getQualification(){
        return qualification;
    }

}