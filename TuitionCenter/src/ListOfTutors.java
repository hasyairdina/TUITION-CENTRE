public class ListOfTutors {
    public Tutor tutors[] = new Tutor[10];
    private int currsz = 0;

    public void add(Tutor x, int i) {
        tutors[i] = x;
        currsz++;
        //System.out.println(tutors[i].name.getMname());
    }

    // find a particular student
    public boolean find(String mname) {
        for (int i=0; i<currsz; i++) {
            if (tutors[i].name.getMname() == mname)
                return true;
        }
        return false;
    }


    //GET method
    public boolean getBoolean(){
        return false;
    }
}
