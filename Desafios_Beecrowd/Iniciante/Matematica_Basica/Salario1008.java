import java.util.Scanner;

public class Salario1008 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int idFuncionario = scan.nextInt();
      int horasTrabalhadas = scan.nextInt();
      double ganhoPorHora = scan.nextDouble();
      scan.close();
      double salario = horasTrabalhadas * ganhoPorHora;

      System.out.println("NUMBER = " + idFuncionario);
      System.out.printf("SALARY = U$ %.2f\n", salario);

   }

}
