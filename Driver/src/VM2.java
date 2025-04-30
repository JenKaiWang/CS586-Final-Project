public class VM2 {
    DS2 D; //DS-2 ptr
    MDA_EFSM M = new MDA_EFSM(); //MDA-EFSM ptr

    public void VM2setDataStore(DataStore ds) {
        this.D = (DS2) ds;
    }

    public void CREATE(int p) {
        D.setTemp_P(p);
        M.create();
    }

    public void COIN(int v) {
        D.setTemp_V(v);
        if(D.getCf() + D.getTemp_V() >= D.getPrice())
            M.coin(1);
        else
            M.coin(0);
    }

    public void SUGAR() {
        M.additive(1);
    }

    public void CREAM() {
        M.additive(2);
    }

    public void COFFEE() {
        M.dispose_drink(3);
    }

    public void InsertCups(int n) {
        M.insert_cups(n);
    }

    public void SetPrice(int p) {
        D.setTemp_P(p);
        M.set_price();
    }

    public void CANCEL() {
        M.cancel();
    }
}
