import java.util.Arrays;

public class MDA_EFSM {
    int k = 0; //number of cups
    int[] A = new int[3]; //list of additives to be disposed
    int[] State_LS = new int[] {0, 1, 2, 3};
    // 0 = Start, 1 = NoCups, 2 = Idle, 3 = CoinsInserted
    int NewCurrentState;


    public void create() {
        State S0 = new Start();
        S0.create();
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
            State S1 = new NoCups();
            S1.insert_cups(n);
            k = n;
            System.out.println("Initialize " + k + " cups");
            System.out.println("before State is " + S1.GetState() + " no cups");
            NewCurrentState = State_LS[2];
            System.out.println("New Current State is " + NewCurrentState + " Idle");
        }
        else if(NewCurrentState == State_LS[2] && k > 0)
        {
            //State S3 = new Idle();
            //S3.insert_cups(n);
            k = k + n;
            System.out.println("total cups in the VM: " + k);
            System.out.println("current state is " + NewCurrentState + " Idle");
            //NewCurrentState = State_LS[3]; //if already in idle state don't need to change
        }
    }

    public void coin(int f) {
        if(NewCurrentState == State_LS[1]){
            State S1 = new NoCups();
            S1.coin(0);
            System.out.println("Current State is " + NewCurrentState + " no cups");

        }else if(NewCurrentState == State_LS[2] && f == 0){
            State S2 = new Idle();
            S2.coin(0);
            System.out.println("Current State is " + NewCurrentState + " Idle");

        }else if(NewCurrentState == State_LS[2] && f == 1){
            State S2 = new Idle();
            S2.coin(1);
            System.out.println("input enough money");
            A[0] = 0;
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
            State S2 = new Idle();
            S2.card();
            System.out.println("card have enough money");
            A[0] = 0;
            System.out.println("A[] now is setting to " + Arrays.toString(A));
            System.out.println("before State is " + S2.GetState() + " Idle");
            NewCurrentState = State_LS[3];
            System.out.println("Current State is " + NewCurrentState + " coins inserted");
        }

    }

    public void cancel() {
        if (NewCurrentState == State_LS[3]) {
            State S3 = new CoinsInserted();
            S3.cancel();
            System.out.println("before State is " + S3.GetState() + " Coins inserted");
            NewCurrentState = State_LS[2];
            System.out.println("Current State is " + NewCurrentState + " Idle");
        }

    }

    public void set_price() {
        if(NewCurrentState == State_LS[2]){
            State S2 = new Idle();
            S2.set_price();
            System.out.println("Current State is " + NewCurrentState + " Idle");
        }
    }

    public void dispose_drink(int d) {
        if(NewCurrentState == State_LS[3] && k<=1){
            State S3 = new CoinsInserted();
            S3.dispose_drink(d);
            System.out.println("number of cups is <= 1");
            System.out.println("before State is " + S3.GetState() + " Coins inserted");
            NewCurrentState = State_LS[1];
            System.out.println("Current State is " + NewCurrentState + " no cups");
        }
        else if(NewCurrentState == State_LS[3]){
            State S3 = new CoinsInserted();
            S3.dispose_drink(d);
            additive(A[0]);
            k = k - 1;
            System.out.println("number of cups is > 1");
            System.out.println("before State is " + S3.GetState() + " Coins inserted");
            NewCurrentState = State_LS[2];
            System.out.println("Current State is " + NewCurrentState + " Idle");
        }

    }

    public void additive(int a) {
        A[0] = a;
        if(NewCurrentState == State_LS[3] && A[0] == 1) {
            System.out.println("dispose sugar");
        }

        if (NewCurrentState == State_LS[3] && A[0] == 2) {
            System.out.println("dispose cream");
        }
//            if (A[0] == 1) {
//                System.out.println("sugar button clicked");
//            }
            //State S3 = new CoinsInserted();
            //S3.additive(A[0]);
        }
}

