public class Address{
    //private can only be accessed by this class (attributes)
    private String unitNo;
    private String street;
    private String postcode;
    private String state;


    //constructor
    public Address(String unitNo, String street, String postcode, String state){
        this.unitNo = unitNo;
        this.street = street;
        this.postcode = postcode;
        this.state = state;
        //System.out.println("Address is successfully saved");
    }


    //SET
    //public can be access by other class
    //function : pass value from one class to this class
    public void setUnitNo(String unitNo){
        this.unitNo = unitNo;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public void setPostcode(String postcode){
        this.postcode = postcode;
    }

    public void setState(String state){
        this.state = state;
    }

    //GET
    //function: for other class to use
    public String getUnitNo(){
        return unitNo;
    }
    public String getStreet(){
        return street;
    }
    public String getPostcode(){
        return postcode;
    }
    public String getState(){
        return state;
    }
}