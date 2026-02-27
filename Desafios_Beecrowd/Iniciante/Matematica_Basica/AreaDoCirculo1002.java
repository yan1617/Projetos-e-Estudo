import java.util.Scanner;

public class AreaDoCirculo1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = 3.14159;
        double raio = scan.nextDouble();
        double area = n * (raio * raio);
        System.out.printf("A=%.4f\n", area);
        scan.close();

    }

}
