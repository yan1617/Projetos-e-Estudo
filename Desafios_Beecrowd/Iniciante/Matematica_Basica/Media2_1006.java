import java.util.Scanner;

public class Media2_1006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        scan.close();
        float pesoA = 2;
        float pesoB = 3;
        float pesoC = 5;
        double pesoMedia = pesoA + pesoB + pesoC;
        double mediaNota = (A * pesoA + B * pesoB + C * pesoC) / pesoMedia;

        System.out.printf("MEDIA = %.1f\n", mediaNota);

    }
}
