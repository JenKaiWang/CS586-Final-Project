public class VM1 {
    AbstractFactory VM1F; //VM-1-Factory ptr
    DS1 D;  //DS-1 ptr
    MDA_EFSM M = new MDA_EFSM(); //MDA-EFSM ptr

    public void VM1setDataStore(DataStore ds) {
        this.D = (DS1) ds;
    }

    public void create(float p) {
        D.setTemp_P(p);
        M.create();
    }

    public void coin(float v) {
        D.setTemp_V(v);
        if(D.getCf() + D.getTemp_V() >= D.getPrice())
            M.coin(1); //f = 1 mean enough funds for the drink
        else
            M.coin(0); //f = 0 mean not enough funds for the drink
    }

    public void card(float x) {
        if(x >= D.getPrice())
            M.card();
    }

    public void sugar() {
        M.additive(1);
    }

    public void cappuccino() {
        M.dispose_drink(1);
    }

    public void chocolate() {
        M.dispose_drink(2);
    }

    public void insert_cups(int n) {
        M.insert_cups(n);
    }

    public void set_price(float p) {
        D.setTemp_P(p);
        M.set_price();
    }

    public void cancel() {
        M.cancel();
    }
}
