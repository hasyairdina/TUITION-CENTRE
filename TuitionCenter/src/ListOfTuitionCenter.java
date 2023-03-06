public class ListOfTuitionCenter{

    public TuitionCenter center[] = new TuitionCenter[5];
    private int currsz = 0;

    public ListOfTuitionCenter(){

    }

    public void add(TuitionCenter tcenter, int i){
        center[i] = tcenter;
        currsz++;
        System.out.println(center[i].getCenterName());
    }
}
