public class NoCups extends State {
    int id = 1;
    OP OP = new OP();

    @Override
    public void create() {
        System.out.println("not working in no cups state");
    }

    @Override
    public void insert_cups(int n) {
        OP.ZeroCF();
    }

    @Override
    public void coin(int f) {
        OP.ReturnCoins();
    }

    @Override
    public void card() {
        System.out.println("not working in no cups state");
    }

    @Override
    public void cancel() {
        System.out.println("not working in no cups state");
    }

    @Override
    public void set_price() {
        System.out.println("not working in no cups state");
    }

    @Override
    public void dispose_drink(int d) {
        System.out.println("not working in no cups state");
    }

    @Override
    public void additive(int a) {
        System.out.println("not working in no cups state");
    }

    @Override
    public int GetState() {
        return this.id;
    }
}
