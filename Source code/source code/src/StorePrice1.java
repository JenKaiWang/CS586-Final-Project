//strategy pattern
//concrete action

public class StorePrice1 extends StorePriceAction{

    static DS1 D;

    public static void setDS(DS1 d){
        D = d;
    }

    @Override
    public void StorePrice() {
        D.setPrice(D.getTemp_P());
        System.out.println("the price of the drink now is : " + D.getPrice());
    }
}
