import java.util.Arrays;

public class MDA_EFSM {
    int k = 0; //number of cups
    static int[] A = {0, 1}; //list of additives to be disposed
    int[] State_LS = new int[] {0, 1, 2, 3}; // state pattern 0 = Start, 1 = NoCups, 2 = Idle, 3 = CoinsInserted
    int NewCurrentState; // state pattern


    public void create() {
        State S0 = new Start(); // state pattern
        S0.create(); // state pattern
        S0.GetState();
        System.out.println("before State is " + S0.GetState() + " start");
        if (S0.GetState() == 0)
        {
            NewCurrentState = State_LS[1];
            System.out.println("New Current State is " + NewCurrentState + " no cups");
        }
    }

    public void insert_cups(int n) {
        if (NewCurrentState == State_LS[1] && k == 0)
        {
            State S1 = new NoCups(); // state pattern
            S1.insert_cups(n); // state pattern
            k = n;
            System.out.println("Initialize " + k + " cups");
            System.out.println("before State is " + S1.GetState() + " no cups");
            NewCurrentState = State_LS[2];
            System.out.println("New Current State is " + NewCurrentState + " Idle");
        }
        else if(NewCurrentState == State_LS[2] && k > 0)
        {
            k = k + n;
            System.out.println("total cups in the VM: " + k);
            System.out.println("current state is " + NewCurrentState + " Idle");
        }
    }

    public void coin(int f) {
        if(NewCurrentState == State_LS[1]){
            State S1 = new NoCups(); // state pattern
            S1.coin(0); // state pattern
            System.out.println("Current State is " + NewCurrentState + " no cups");

        }else if(NewCurrentState == State_LS[2] && f == 0){
            State S2 = new Idle(); // state pattern
            S2.coin(0); // state pattern
            System.out.println("Current State is " + NewCurrentState + " Idle");

        }else if(NewCurrentState == State_LS[2] && f == 1){
            State S2 = new Idle(); // state pattern
            S2.coin(1); // state pattern
            System.out.println("input enough money");
            A[0] = 0;
            A[1] = 0;
            System.out.println("A[] now is setting to " + Arrays.toString(A));
            System.out.println("before State is " + S2.GetState() + " Idle");
            NewCurrentState = State_LS[3];
            System.out.println("Current State is " + NewCurrentState + " coins inserted");
        } else if (NewCurrentState == State_LS[3] && f == 1) {
            State S3 = new CoinsInserted();
            S3.coin(1);
        }

    }

    public void card() {
        if(NewCurrentState == State_LS[2]){
            State S2 = new Idle(); // state pattern
            S2.card(); // state pattern
            System.out.println("card have enough money");
            A[0] = 0;
            A[1] = 0;
            System.out.println("A[] now is setting to " + Arrays.toString(A));
            System.out.println("before State is " + S2.GetState() + " Idle");
            NewCurrentState = State_LS[3];
            System.out.println("Current State is " + NewCurrentState + " coins inserted");
        }

    }

    public void cancel() {
        if (NewCurrentState == State_LS[3]) {
            State S3 = new CoinsInserted(); // state pattern
            S3.cancel(); // state pattern
            System.out.println("before State is " + S3.GetState() + " Coins inserted");
            NewCurrentState = State_LS[2];
            System.out.println("Current State is " + NewCurrentState + " Idle");
        }

    }

    public void set_price() {
        if(NewCurrentState == State_LS[2]){
            State S2 = new Idle(); // state pattern
            S2.set_price(); // state pattern
            System.out.println("Current State is " + NewCurrentState + " Idle");
        }
    }

    public void dispose_drink(int d) {
        if(NewCurrentState == State_LS[3] && k > 1){
            State S3 = new CoinsInserted(); // state pattern
            S3.dispose_drink(d); // state pattern
            k = k - 1;
            System.out.println("number of cups is > 1");
            System.out.println("before State is " + S3.GetState() + " Coins inserted");
            NewCurrentState = State_LS[2];
            System.out.println("Current State is " + NewCurrentState + " Idle");
        }
        else if(NewCurrentState == State_LS[3] && k <= 1) {
            State S3 = new CoinsInserted(); // state pattern
            S3.dispose_drink(d); // state pattern
            System.out.println("number of cups is <= 1");
            k = 0;
            System.out.println("before State is " + S3.GetState() + " Coins inserted");
            NewCurrentState = State_LS[1];
            System.out.println("Current State is " + NewCurrentState + " no cups");
        }
    }

    public void additive(int a) {
        //sugar
        if (NewCurrentState == State_LS[3] && a == 1) {
            if(A[0] == 0)
                A[0] = 1;
            else
                A[0] = 0;
            State S3 = new CoinsInserted(); // state pattern
            S3.additive(a); // state pattern
        }

        //cream
        if (NewCurrentState == State_LS[3] && a == 2) {
            if(A[1] == 0)
                A[1] = 1;
            else A[1] = 0;
            State S3 = new CoinsInserted(); // state pattern
            S3.additive(a); // state pattern
        }
    }
}

