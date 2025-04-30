public class VM2Factory extends AbstractFactory {

    private VM2Factory VM2Factory;

//    @Override
//    public AbstractFactory getAF() {
//        return this.VM2Factory;
//    }

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
