package Atividades;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class test {
    public static void main(String args []){
        // Declare a variável mediaMensal e faça o cálculo para a média mensal de gastos Exiba a mensagem "Valor da média mensal = " juntamente com o valor da média mensal
        Scanner in = new Scanner(System.in);
        double gastosJaneiro=30000;
        double gastosFevereiro=33030.77;
        double gastosMarco=23899.01;
        double gastosTrimestre=gastosJaneiro+gastosFevereiro+gastosMarco;
        System.out.println("Gastos Trimestral:"+gastosTrimestre);
        double mediaMensal=gastosTrimestre/3;
        System.out.printf("Valor da média mensal = %.2f %n",mediaMensal);
        
       }
}
