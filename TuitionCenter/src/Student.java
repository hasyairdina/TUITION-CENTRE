// created by team in KL
//name, IC, address, year, schoolname, listofScores
public class Student {
    // data/attributes
    Name name; //class for splitting the name
    private String IC;
    Address address;
    private int year;
    private String schoolname;
    private float marks[] = new float[5];

    public Student(String IC, int year, String schoolname){
        this.IC = IC;
        this.year = year;
        this.schoolname = schoolname;
        //System.out.println("Student details successfully created!");
    }

    //SET
    public void setIC(String IC){this.IC = IC;}
    public void setYear(int year){this.year = year;}
    public void setSchoolname(String schoolname){ this.schoolname = schoolname;}

    //calling NAME class into STUDENT class
    public void setName(Name thename) {    // parameter tu kena differentiate with attributes in this class
        name = thename;
    }

    //calling ADDRESS class into STUDENT class
    public void setAddress(Address theaddress){
        address = theaddress;
        //System.out.println("Address is successfully saved");
    }


    public float calcAvg() {
        float sum=0;
        for(int i=0; i<5; i++){
            sum += marks[i];
        }
        float avg = sum/5;

        return avg;
    }

    public float calcMin() {
        float min = 99999;
        for(int i=0; i<5; i++){
            if(marks[i] < min){
                min = marks[i];
            }
        }
        return min;
    }

    public float calcMax(){
        float max = 0;
        for ( int i = 0; i<5; i++){
            if (marks[i] > max){
                max = marks[i];
            }
        }
        return max;
    }

    //just to store value in marks[]
    public void setMark(float mark, int i) throws Exception {
        if (mark < 0){
            throw new Exception("Error in marks detected!");   //Exception is a java 3class
        }
        marks[i] = mark;
        //old way, not very OOP style
        /*if (mark < 0){
            System.out.println("Error negative input!!");
            return;
        }*/
    }

    void displayMarks(){
        //print the marks
        for (int i=0; i<marks.length; i++){
            System.out.println("Marks at index " + i + " : " + marks[i]);
        }
    }



    /*public static void main(String[] args){  //to test this class only!!, try only intellij plz
        Student stud0 = new Student();
        try {      //try block...something in here can cause exception
            stud0.setMark(40, 0);
            stud0.setMark(90, 1);
            stud0.setMark(50, 2);
            stud0.setMark(-10, 3);
            stud0.setMark(10, 4);
        } catch (Exception ex){  //catch block..action to be takenn
            // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();  //a method

        }
        stud0.displayMarks();


    }*/




}