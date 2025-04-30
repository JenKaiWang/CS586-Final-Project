public class CoinsInserted extends State{
    OP OP = new OP();
    int id = 3;

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
        //OP.DisposeAdditive();
        OP.ZeroCF();
    }

    @Override
    public void additive(int a) {
        //OP.DisposeAdditive(a);
    }

    @Override
    public int GetState() {
        return this.id;
    }
}
