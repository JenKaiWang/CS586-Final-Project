import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Which VM you want to use(1 = VM1 2 = VM2)\n");
        int VM = input.nextInt();

        if(VM == 1)
        {
            VM1 VM1 = new VM1();
            DS1 DS1 = new DS1();
            AbstractFactory AF = new VM1Factory();
            OP.setAF(AF);
            VM1.VM1setDataStore(DS1);
            StorePrice1.setDS(DS1);
            ZeroCF1.setDS(DS1);
            ReturnCoins1.setDS(DS1);
            IncreaseCF1.setDS(DS1);
            float p;
            float v;
            int n;
            float x;
            int choice = 0;
            System.out.print(" Vending Machine-1\n");
            System.out.print(" MENU of Operations\n");
            System.out.print(" 0. create(float)\n");
            System.out.print(" 1. coin(float)\n");
            System.out.print(" 2. card(float)\n");
            System.out.print(" 3. sugar()\n");
            System.out.print(" 4. cappuccino()\n");
            System.out.print(" 5. chocolate\n");
            System.out.print(" 6. insert_cups(int n)\n");
            System.out.print(" 7. set_price(float p)\n");
            System.out.print(" 8. cancel\n");

            while (choice < 9) {
                System.out.print("\nSelect Operation:\n");
                System.out.print("0-create,1-coin,2-sugar,3-chocolate,4-cappuccino,5-insert_cups,6-set_price,7-cancel,8-card\n");
                choice = input.nextInt();

                switch (choice) {
                    case 0:
                        System.out.print("Operation: create(float p)\n");
                        System.out.print("Enter value of parameter p:\n");
                        p = input.nextFloat();
                        VM1.create(p);
                        break;
                    case 1:
                        System.out.print("Operation: coin(float v)\n");
                        System.out.print("Enter value of parameter v:\n");
                        v = input.nextFloat();
                        VM1.coin(v);
                        break;
                    case 2:
                        System.out.print("Operation: sugar()\n");
                        VM1.sugar();
                        break;
                    case 3:
                        System.out.print("Operation: chocolate()\n");
                        VM1.chocolate();
                        break;
                    case 4:
                        System.out.print("Operation: cappuccino()\n");
                        VM1.cappuccino();
                        break;
                    case 5:
                        System.out.print("Operation: insert_cups(int n)\n");
                        System.out.print("Enter value of parameter n:\n");
                        n = input.nextInt();
                        VM1.insert_cups(n);
                        break;
                    case 6:
                        System.out.print("Operation: set_price(float v)\n");
                        System.out.print("Enter value of parameter v:\n");
                        v = input.nextFloat();
                        VM1.set_price(v);
                        break;
                    case 7:
                        System.out.print("Operation: cancel()\n");
                        VM1.cancel();
                        break;
                    case 8:
                        System.out.print("Operation: card(float x)\n");
                        System.out.print("Enter value of parameter x:\n");
                        x = input.nextFloat();
                        VM1.card(x);
                        break;
                }
            }
        }else if (VM == 2){
            VM2 VM2 = new VM2();
            DS2 DS2 = new DS2();
            AbstractFactory AF = new VM2Factory();
            OP.setAF(AF);
            VM2.VM2setDataStore(DS2);
            StorePrice2.setDS(DS2);
            ZeroCF2.setDS(DS2);
            ReturnCoins2.setDS(DS2);
            IncreaseCF2.setDS(DS2);
            int p;
            int v;
            int n;
            int choice = 0;
            System.out.print(" Vending Machine-2\n");
            System.out.print(" MENU of Operations\n");
            System.out.print(" 0. CREATE(int p)\n");
            System.out.print(" 1. COIN(int v)\n");
            System.out.print(" 2. SUGAR()\n");
            System.out.print(" 3. CREAM()\n");
            System.out.print(" 4. COFFEE()\n");
            System.out.print(" 5. InsertCups(int n)\n");
            System.out.print(" 6. SetPrice(int p)\n");
            System.out.print(" 7. CANCEL()\n");

            while (choice < 8) {
                System.out.print("\nSelect Operation:\n");
                System.out.print("0-create,1-COIN,2-SUGAR,3-CREAM,4-COFFEE,5-insert_cups,6-set_price,7-cancel\n");
                choice = input.nextInt();

                switch (choice) {
                    case 0:
                        System.out.print("Operation: CREATE(int p)\n");
                        System.out.print("Enter value of parameter p:\n");
                        p = input.nextInt();
                        VM2.CREATE(p);
                        break;
                    case 1:
                        System.out.print("Operation: COIN(int v)\n");
                        System.out.print("Enter value of parameter v:\n");
                        v = input.nextInt();
                        VM2.COIN(v);
                        break;
                    case 2:
                        System.out.print("Operation: SUGAR()\n");
                        VM2.SUGAR();
                        break;
                    case 3:
                        System.out.print("Operation: CREAM()\n");
                        VM2.CREAM();
                        break;
                    case 4:
                        System.out.print("Operation: COFFEE()\n");
                        VM2.COFFEE();
                        break;
                    case 5:
                        System.out.print("Operation: InsertCups(int n)\n");
                        System.out.print("Enter value of parameter n:\n");
                        n = input.nextInt();
                        VM2.InsertCups(n);
                        break;
                    case 6:
                        System.out.print("Operation: SetPrice(int p)\n");
                        System.out.print("Enter value of parameter v:\n");
                        v = input.nextInt();
                        VM2.SetPrice(v);
                        break;
                    case 7:
                        System.out.print("Operation: CANCEL()\n");
                        VM2.CANCEL();
                        break;
                }
            }
        }

    }
}
