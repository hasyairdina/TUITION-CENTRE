
public class StudentBatch {
    // data section
    // what is a StudentBatch
    // a StudentBatch is a list of students registered in a batch, an array of Student
    public Student students[] = new Student[10];
    private int currsz = 0;

    // operation
    public void add(Student s, int i) {
        students[i] = s;
        currsz++;
        System.out.print(students[i].name.getMname() + "\t");
    }

    // method overloading
    // public void add(Student s) {
    //     students[currsz++] = s;
    // }    

    // find a particular student
    public boolean find(String mname) {
        // loop thru the array students
        // for each student in students
        //    check whether name is the same as that in student
        for (int i=0; i<currsz; i++) {
            if (students[i].name.getMname() == mname)
                return true;
        }
        return false;
    }


    //GET method 
    public boolean getBoolean(){
        return false;
    }

}