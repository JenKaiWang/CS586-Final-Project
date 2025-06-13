//strategy pattern
//concrete action

public class ReturnCoins1 extends ReturnCoinsAction{
    static DS1 D;

    public static void setDS(DS1 d){
        D = d;
    }
    @Override
    public void ReturnCoins() {
//        D.setCf(D.getTemp_V() + D.getCf());
//        System.out.println("Return Coins " + D.getCf());
        System.out.println("Return Coins ");
    }
}
