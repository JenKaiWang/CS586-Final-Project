public class OP {

    static AbstractFactory AF;
    StorePriceAction S;
    ZeroCFAction Z;
    IncreaseCFAction I;
    ReturnCoinsAction R;
    DisposeDrinkAction DD;
    DisposeAdditiveAction DA;

    public static void setAF(AbstractFactory af){
        AF = af;
    }

    public void StorePrice(){
        S = AF.GetStorePrice(); //update S pointer to the right action
        S.StorePrice();
    }

    public void ZeroCF(){
        Z = AF.GetZeroCF(); //update S pointer to the right action
        Z.ZeroCF();
    }

    public void IncreaseCF(){
        I = AF.GetIncreaseCF();
        I.IncreaseCF();
    }

    public void ReturnCoins(){
        R = AF.GetReturnCoins(); //update S pointer to the right action
        R.ReturnCoins();
    }

    public void DisposeDrink(int d){
        DD = AF.GetDisposeDrink();
        DD.DisposeDrink(d);
    }

    public void DisposeAdditive(int[] A){
        DA = AF.GetDisposeAdditive();
        DA.DisposeAdditive(A);
    }
}
