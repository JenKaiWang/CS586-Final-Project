// state pattern
//abstract state class
public abstract class State {
    int id;
    MDA_EFSM M;
    OP OP;

    // Abstract methods
    public abstract void create();
    public abstract void insert_cups(int n);
    public abstract void coin(int f);
    public abstract void card();
    public abstract void cancel();
    public abstract void set_price();
    public abstract void dispose_drink(int d);
    public abstract void additive(int a);
    public abstract int GetState();
}
