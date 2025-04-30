public class ZeroCF2 extends ZeroCFAction{
    static DS2 D;

    public static void setDS(DS2 d){
        D = d;
    }
    @Override
    public void ZeroCF() {
        D.setCf(0);
        System.out.print("initialize the Cumulative Fund CF to :" + D.getCf()+"\n");
    }
}
