public class ReturnCoins2 extends ReturnCoinsAction{
    static DS2 D;

    public static void setDS(DS2 d){
        D = d;
    }
    @Override
    public void ReturnCoins() {
        D.setCf(D.getTemp_V() + D.getCf());
        System.out.println("Return Coins " + D.getCf());
    }
}
