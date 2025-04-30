public class DisposeDrink1 extends DisposeDrinkAction{
    @Override
    public void DisposeDrink(int d) {
        if(d == 1){
            System.out.println("Dispose cup of cappuccino");
        }
        else if(d == 2){
            System.out.println("Dispose cup of chocolate");
        }
    }
}
