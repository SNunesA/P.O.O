package Atv11;
import java.util.Scanner;
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    Scanner in = new Scanner(System.in);
    public void alterar(){
        System.out.println("Nome:");
        nome=in.nextLine();
        System.out.println("Idade:");
        idade=in.nextInt();
        System.out.println("Altura:");
        altura=in.nextDouble();
    }
    public void mostrar(){
        System.out.println("Nome:"+nome);
        System.out.println("Idade:"+idade);
        System.out.println("Altura:"+altura);
    }

    
}
