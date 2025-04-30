public class Start extends State {
    int id = 0;
    OP OP = new OP();


    @Override
    public void create() {
        OP.StorePrice();
    }

    @Override
    public void insert_cups(int n) {
        System.out.println("not working in start state");
    }

    @Override
    public void coin(int f) {
        System.out.println("not working in start state");
    }

    @Override
    public void card() {
        System.out.println("not working in start state");
    }

    @Override
    public void cancel() {
        System.out.println("not working in start state");
    }

    @Override
    public void set_price() {
        System.out.println("not working in start state");
    }

    @Override
    public void dispose_drink(int d) {
        System.out.println("not working in start state");
    }

    @Override
    public void additive(int a) {
        System.out.println("not working in start state");
    }

    @Override
    public int GetState() {
        return this.id;
    }
}
