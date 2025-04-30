public class DisposeAdditive1 extends DisposeAdditiveAction{
    @Override
    public void DisposeAdditive(int[] A) {
        if(A[0] == 0){
            System.out.println("without sugar");
        } else if (A[0] == 1) {
            System.out.println("with sugar");
        }
    }
}
