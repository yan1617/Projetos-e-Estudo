import java.util.Scanner; 

public class beecrowd_1044 {
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int A = scan.nextInt();
int B = scan.nextInt();

scan.close(); 

System.out.println( (A % B ==0 || B % A ==0) ? "Sao Multiplos" : "Nao sao Multiplos");
}
    
}
