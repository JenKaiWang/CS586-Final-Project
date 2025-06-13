//abstract factory pattern
//vm2 concrete factory

public class VM2Factory extends AbstractFactory {
    @Override
    public DataStore GetDataStore() {
        return new DS2();
    }

    @Override
    public StorePriceAction GetStorePrice() {
        return new StorePrice2();
    }

    @Override
    public ZeroCFAction GetZeroCF() {
        return new ZeroCF2();
    }

    @Override
    public IncreaseCFAction GetIncreaseCF() {
        return new IncreaseCF2();
    }

    @Override
    public ReturnCoinsAction GetReturnCoins() {
        return new ReturnCoins2();
    }

    @Override
    public DisposeDrinkAction GetDisposeDrink() {
        return new DisposeDrink2();
    }

    @Override
    public DisposeAdditiveAction GetDisposeAdditive() {
        return new DisposeAdditive2();
    }
}
