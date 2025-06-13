//strategy pattern
//concrete action

public class IncreaseCF1 extends IncreaseCFAction{
    static DS1 D;

    public static void setDS(DS1 d){
        D = d;
    }
    @Override
    public void IncreaseCF() {
        D.setCf(D.getTemp_V() + D.getCf());
        System.out.println("user input money: " + D.getCf());
    }
}
