//strategy pattern
//concrete action

public class ZeroCF1 extends ZeroCFAction{
    static DS1 D;

    public static void setDS(DS1 d){
        D = d;
    }
    @Override
    public void ZeroCF() {
        D.setCf(0);
        System.out.print("initialize the Cumulative Fund CF to :" + D.getCf()+"\n");
    }
}
