//strategy pattern
//concrete action

public class IncreaseCF2 extends IncreaseCFAction{
    static DS2 D;

    public static void setDS(DS2 d){
        D = d;
    }
    @Override
    public void IncreaseCF() {
        D.setCf(D.getTemp_V() + D.getCf());
        System.out.println("user input money: " + D.getCf());
    }
}
