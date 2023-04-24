package Atividades;
import java.util.Scanner;
public class test {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        int a,b,c;
    
        System.out.print("Informe um inteiro:");
        b=in.nextInt();
        System.out.print("Informe um inteiro:");
        c=in.nextInt();
        a=b*c;
        System.out.println("Foi realizado o produto dos numeros digitados e o resultado é:"+a);
        System.out.println("Este é um programa de exemplo de folha de pagamento.");

    }
}
