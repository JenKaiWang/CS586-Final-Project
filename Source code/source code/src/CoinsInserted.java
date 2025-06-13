// State pattern
//fourth state
// only implement the function that work in this state
public class CoinsInserted extends State{
    OP OP = new OP();
    int id = 3;
    MDA_EFSM M = new MDA_EFSM();

    @Override
    public void create() {
        System.out.println("not working");
    }

    @Override
    public void insert_cups(int n) {
        System.out.println("not working");
    }

    @Override
    public void coin(int f) {
        OP.ReturnCoins();
    }

    @Override
    public void card() {
        System.out.println("not working");
    }

    @Override
    public void cancel() {
        OP.ReturnCoins();
        OP.ZeroCF();
    }

    @Override
    public void set_price() {
        System.out.println("not working");
    }

    @Override
    public void dispose_drink(int d) {
        OP.DisposeDrink(d);
        OP.DisposeAdditive(MDA_EFSM.A);
        OP.ZeroCF();
    }

    @Override
    public void additive(int a) {
        OP.DisposeAdditive(MDA_EFSM.A);
    }

    @Override
    public int GetState() {
        return this.id;
    }
}
