
import java.util.Scanner;

public class Area1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double pi = 3.14159;

        System.out.printf("TRIANGULO: %.3f\n", A * C / 2);
        System.out.printf("CIRCULO: %.3f\n", pi * Math.pow(C, 2));
        System.out.printf("TRAPEZIO: %.3f\n", (A + B) * C / 2);
        System.out.printf("QUADRADO: %.3f\n", Math.pow(B, 2));
        System.out.printf("RETANGULO: %.3f\n", A * B);
        scan.close();

    }

}