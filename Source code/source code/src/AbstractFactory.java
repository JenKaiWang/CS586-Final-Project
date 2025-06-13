//abstract factory pattern
//abstract class

public abstract class AbstractFactory {
    //public abstract AbstractFactory getAF();
    public abstract DataStore GetDataStore();
    public abstract StorePriceAction GetStorePrice();
    public abstract ZeroCFAction GetZeroCF();
    public abstract IncreaseCFAction GetIncreaseCF();
    public abstract ReturnCoinsAction GetReturnCoins();
    public abstract DisposeDrinkAction GetDisposeDrink();
    public abstract DisposeAdditiveAction GetDisposeAdditive();
}
