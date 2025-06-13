//strategy pattern
//concrete action

public class StorePrice2 extends StorePriceAction{
    static DS2 D;

    public static void setDS(DS2 d){
        D = d;
    }
    @Override
    public void StorePrice() {
        D.setPrice(D.getTemp_P());
        System.out.println("the price of the drink now is : " + D.getPrice());
    }
}
