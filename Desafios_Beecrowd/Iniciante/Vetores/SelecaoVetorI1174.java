
import java.util.Scanner;

public class SelecaoVetorI1174 {
    public static void main(String[] args) {
        float[] menorQue10 = new float[100];
        Scanner scan = new Scanner(System.in);
        int i;
        for (i = 0; i < 100; i++) {
            menorQue10[i] = scan.nextFloat();
            if (menorQue10[i] < 10) {
                System.out.printf("A[%d] = %.1f\n", i, menorQue10[i]);
            }

        }
        scan.close();

    }

}
