//abstract factory pattern
//vm1 concrete factory

public class VM1Factory extends AbstractFactory {

    @Override
    public DataStore GetDataStore() {
        return new DS1();
    }

    @Override
    public StorePriceAction GetStorePrice() {
        return new StorePrice1();
    }

    @Override
    public ZeroCFAction GetZeroCF() {
        return new ZeroCF1();
    }

    @Override
    public IncreaseCFAction GetIncreaseCF() {
        return new IncreaseCF1();
    }

    @Override
    public ReturnCoinsAction GetReturnCoins() {
        return new ReturnCoins1();
    }

    @Override
    public DisposeDrinkAction GetDisposeDrink() {
        return new DisposeDrink1();
    }

    @Override
    public DisposeAdditiveAction GetDisposeAdditive() {
        return new DisposeAdditive1();
    }
}
