import java.util.ArrayList;

public class Main
{
    // application code
    public static void main(String[] args) {

        Name name = new Name("","","");
        Address address = new Address("", "", "", "");

        //another way of doing it
        // name.setFname("Nurain");//nasi lemak
        // name.setMname("Natasha"); //sambal
        // name.setLname("Sasaili"); //telur
        // ain.setName(name); //sebungkus nasi lemak

        //STUDENT 1
        Student ayen = new Student("235689", 2003,"SMK KL");
        name = new Name("Nurain","Natasha","Sasaili");
        ayen.setName(name);
        address = new Address("No.31", "Hulu Langat", "12456", "Selangor");
        System.out.println("STUDENT 1: " + ayen.name.getMname());
        try {
            ayen.setMark(75,0);
            ayen.setMark(100,1);
            ayen.setMark(85,2);
            ayen.setMark(35,3);
            ayen.setMark(65,4);
        } catch (Exception ex){  //catch block..action to be taken
            // in case of Exception
            System.out.println("Cannot continue");
            //ex.printStackTrace();  //a method

        }
        ayen.displayMarks();
        System.out.println("Average marks = " + ayen.calcAvg()); //calc Average
        System.out.println("Minimun marks = " + ayen.calcMin()); //calc Min
        System.out.println("Maximum marks: " + ayen.calcMax());  //calc Max

        System.out.println("");


        //STUDENT 2
        Student aisyah = new Student("963852",2003, "SMK Terengganu");
        name = new Name("Nur", "Aisyah", "Mustapha");
        aisyah.setName(name);
        address = new Address ("No.36", "Kemaman", "96325", "Terengganu");
        aisyah.setAddress(address);
        System.out.println("STUDENT 2: " + aisyah.name.getMname());
        try {
            aisyah.setMark(100,0);
            aisyah.setMark(72,1);
            aisyah.setMark(86,2);
            aisyah.setMark(96,3);
            aisyah.setMark(100,4);
        } catch (Exception ex){
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }
        aisyah.displayMarks();
        System.out.println("Average marks = " + aisyah.calcAvg()); //calc Average
        System.out.println("Minimun marks = " + aisyah.calcMin()); //calc Min
        System.out.println("Maximum marks: " + aisyah.calcMax());  //calc Max
        System.out.println("");


        //STUDENT 3
        Student hasya = new Student("789456",2003,"SMK Hulu Langat"); //student() -> java will automaticly put a blank constructor
        name = new Name("Nur", "Hasya", "Irdina");
        hasya.setName(name);
        address = new Address("No.46", "Kota Damansara", "47810", "Selangor");
        hasya.setAddress(address);
        System.out.println("STUDENT 3: " + hasya.name.getMname());
        try{
            hasya.setMark(100,0);
            hasya.setMark(75,1);
            hasya.setMark(84,2);
            hasya.setMark(85,3);
            hasya.setMark(60,4);
        }catch (Exception ex){
            System.out.println("Cannot continue");
        }
        hasya.displayMarks();
        System.out.println("Average marks = " + hasya.calcAvg()); //calc Average
        System.out.println("Minimun marks = " + hasya.calcMin()); //calc Min
        System.out.println("Maximum marks: " + hasya.calcMax());  //calc Max
        System.out.println("");

        //STUDENT 4
        Student miera = new Student("741123", 2003, "SMK Kelantan"); //student() -> java will automaticly put a blank constructor
        name = new Name("Nur", "Amiera", "Nazriey");
        miera.setName(name);
        address = new Address("No.56", "Kota Bharu", "88522", "Kelantan");
        miera.setAddress(address);
        System.out.println("STUDENT 4: " + miera.name.getMname());
        try{
            miera.setMark(100,0);
            miera.setMark(100,1);
            miera.setMark(100,2);
            miera.setMark(100,3);
            miera.setMark(100,4);
        }catch (Exception ex){
            System.out.println("Cannot continue");
        }
        miera.displayMarks();
        System.out.println("Average marks = " + miera.calcAvg()); //calc Average
        System.out.println("Minimun marks = " + miera.calcMin()); //calc Min
        System.out.println("Maximum marks: " + miera.calcMax());  //calc Max
        System.out.println("");


        //STUDENTBATCH
        // creating a batch object
        System.out.println("LIST OF STUDENTS IN 2023 :");
        StudentBatch sb2023 = new StudentBatch();  //BATCH 1 : 2023
        sb2023.add(hasya, 0);
        sb2023.add(miera, 1);
        //to find a person in Batch 2023
        boolean isIn = sb2023.find("Hasya");
        System.out.println("\n" + "To determine if student HASYA are in the list of students: "  + isIn);

        System.out.println("");
        System.out.println("LIST OF STUDENTS IN 2030 :");
        StudentBatch sb2030 = new StudentBatch();   //BATCH 2 : 2030
        sb2030.add(ayen, 0);
        sb2030.add(aisyah, 1);
        //to find a person in Batch 203
        boolean isInn = sb2030.find("Amiera");
        System.out.println("\n" + "To determine if student AMIERA are in the list of students: "  + isInn);

        //TUTOR
        ArrayList<Tutor> listA = new ArrayList<Tutor>();

        System.out.println("\n" + "LIST OF TUTORS IN KL: ");
        //TUTOR 1
        Tutor cikguminah = new Tutor("852961", "MASTER IN MATHEMATICS", 10, "3 March 2020", 3);
        name = new Name("Siti Nor", "Aminah", "Mansor");
        cikguminah.setName(name);
        address = new Address("No.51", "Kota Height","96352", "Melaka");
        cikguminah.setAddress(address);

        System.out.println(cikguminah.name.getMname());

        //TUTOR 2
        Tutor sirPrakash = new Tutor("852123", "MASTER IN PHYSICS", 15, "6 July 2015", 8);
        name = new Name("Raju", "Prakash", "Aadhiv");
        sirPrakash.setName(name);
        address = new Address("No.10","Batu Caves", "52410", "Selangor");
        sirPrakash.setAddress(address);
        System.out.println(sirPrakash.name.getMname());

        //LIST OF TUTORS
        ListOfTutors listTutor1 = new ListOfTutors();
        listTutor1.add(cikguminah, 0);
        listTutor1.add(sirPrakash, 1);
        boolean finding = listTutor1.find("Prakash");
        System.out.println("To check if tutor SIR PRAKASH is in the list: "  + finding);



        System.out.println("\n" + "List of tuition centres in Malaysia: ");
        //TUITION CENTER KL
        TuitionCenter tuitionCenterKL = new TuitionCenter("KUALA LUMPUR", "SIR ABDULLAH");
        address = new Address("20", "Bukit Bintang", "74110", "Kuala Lumpur");  //tuition center address
        tuitionCenterKL.setCenterAddress(address);


        //TUITION CENTRE JB
        TuitionCenter tuitionCenterJB = new TuitionCenter("JOHOR BAHRU", "SIR RIZAL");
        address = new Address("40", "JALAN RATU LIMA", "74101", "JOHOR");
        tuitionCenterJB.setCenterAddress(address);

        //LIST OF TUITION CENTRES IN MALAYSIA
        ListOfTuitionCenter MalaysiaCentre = new ListOfTuitionCenter();
        MalaysiaCentre.add(tuitionCenterJB, 0);
        MalaysiaCentre.add(tuitionCenterKL, 1);






    }
}
