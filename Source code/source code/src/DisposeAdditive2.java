//strategy pattern
//concrete action

public class DisposeAdditive2 extends DisposeAdditiveAction{
    @Override
    public void DisposeAdditive(int[] A) {
        if(A[0] == 0){
            System.out.println("without sugar");
        } else if (A[0] == 1) {
            System.out.println("with sugar");
        }

        if(A[1] == 0){
            System.out.println("without cream");
        } else if (A[1] == 1) {
            System.out.println("with cream");
        }
    }
}
