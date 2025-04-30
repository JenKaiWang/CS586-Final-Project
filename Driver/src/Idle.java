public class Idle extends State{
    OP OP = new OP();
    int id = 2;
    @Override
    public void create() {
        System.out.println("not working in no cups state");
    }

    @Override
    public void insert_cups(int n) {

    }

    @Override
    public void coin(int f) {
        OP.IncreaseCF();
    }

    @Override
    public void card() {
        OP.ZeroCF();
    }

    @Override
    public void cancel() {
        System.out.println("not working in no cups state");
    }

    @Override
    public void set_price() {
        OP.StorePrice();
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
