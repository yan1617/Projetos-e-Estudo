import java.util.Scanner;

public class beecrowd_1035 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    scan.close();
    
    int somaCD = c + d;
    int somaAB = a + b;
    
   boolean cPositivo = c > 0;
   boolean dPositivo = d > 0;
   boolean aPar = a % 2 == 0;

    boolean bMaiorQueC = b > c;
    boolean dMaiorQueA = d > a;

if(bMaiorQueC && dMaiorQueA && somaCD > somaAB && cPositivo && dPositivo && aPar)
    {System.out.println("Valores aceitos");
    
}else{
    System.out.println("Valores nao aceitos");

}

    
}
        
    }

