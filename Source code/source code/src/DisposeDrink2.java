//strategy pattern
//concrete action

public class DisposeDrink2 extends DisposeDrinkAction{
    @Override
    public void DisposeDrink(int d) {
        if(d == 3){
            System.out.println("Dispose cup of coffee");
        }
    }
}
