import java.util.Scanner;

public class PreenchimentoVetorIV1179 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] par = new int[5];
    int[] impar = new int[5];
    int p = 0;
    int j = 0;

    for (int i = 0; i < 15; i++) {
      int numero = scan.nextInt();
      if (numero % 2 == 0) {

        par[p] = numero;
        p++;

      }
      if (numero % 2 != 0) {

        impar[j] = numero;
        j++;
      }
      if (p == 5) {
        System.out
            .println("par[0] = " + par[0] + "\npar[1] = " + par[1] + "\npar[2] = " + par[2] + "\npar[3] = " + par[3]
                + "\npar[4] = " + par[4]);
        p = 0;
      }
      if (j == 5) {
        System.out.println("impar[0] = " + impar[0] + "\nimpar[1] = " + impar[1] + "\nimpar[2] = " + impar[2]
            + "\nimpar[3] = " + impar[3] +
            "\nimpar[4] = " + impar[4]);
        j = 0;
      }

    }
    for (int k = 0; k < j; k++) {
      System.out.println("impar[" + k + "] = " + impar[k]);

    }
    for (int k = 0; k < p; k++) {
      System.out.println("par[" + k + "] = " + par[k]);
    }
    scan.close();
  }

}
