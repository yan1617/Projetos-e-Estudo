import java.util.Scanner;

public class beecrowd_1038 {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    double total=0;
    
    int codigo = scan.nextInt();
    
    int quantidade = scan.nextInt();
    scan.close();

     switch(codigo){
     case 1 : total = quantidade * 4;
     System.out.printf("Total: R$ %.2f\n",total);
     break;
     case 2 : total = quantidade * 4.50;
      System.out.printf("Total: R$ %.2f\n",total);
      break;
      case 3 : total = quantidade * 5;
      System.out.printf("Total: R$ %.2f\n",total);
      break;
      case 4 : total = quantidade * 2;
      System.out.printf("Total: R$ %.2f\n",total);
      break;
      case 5 : total = quantidade * 1.50; 
      System.out.printf("Total: R$ %.2f\n",total);
      break;     
     }


}  

}
