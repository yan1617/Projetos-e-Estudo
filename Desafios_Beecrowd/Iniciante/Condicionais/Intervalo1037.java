import java.util.Scanner;

public class beecrowd_1037{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
   
    float valorDeEntrada = scan.nextFloat();
    scan.close();

     if(valorDeEntrada >=0 && valorDeEntrada <=25){
        System.out.println("Intervalo [0,25]");

    }else if(valorDeEntrada>25 && valorDeEntrada <=50){
        System.out.println("Intervalo (25,50]");

    }else if(valorDeEntrada>50 && valorDeEntrada<=75){
        System.out.println("Intervalo (50,75]");

    }else if(valorDeEntrada>75 && valorDeEntrada<=100){
        System.out.println("Intervalo (75,100]");
    
    }else{
        System.out.println("Fora do intervalo");
    }
    
    

    }
}