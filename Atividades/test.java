package Atividades;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class test {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);

        float av1,av2,trab,media;
        av1=Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da 1° prova:"));
        av2=Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da 2° prova:"));
        trab=Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho:"));
        
        media=(av1+av2+trab)/3;
        JOptionPane.showMessageDialog(null, String.format("Sua média:%.2f", media));
    }
}
