public class CalculoSalarioFuncionario {
    public static void main(String[] args) {
        String nome = "Yan";
        int valorDiaria = 100;
        int diasTrabalhados = 31;
        int valorPassagemPorDia = 12;
        int despesaTotal = valorPassagemPorDia*diasTrabalhados;
         int valorLucroTotal = diasTrabalhados*valorDiaria;
        int lucroTotal = valorLucroTotal-despesaTotal;

        System.out.println("Estagiario "+nome + " Saldo final = "+ lucroTotal  );
        
       
    
}
    
}
