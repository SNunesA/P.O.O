//Usando a classe JOptionPane para entrada de dados, receba a nota de duas provas e de um trabalho. Calcule a média Mostre a média usando o showMessageDialog da classe JOptionPane
package Atividades.Atv03;
import javax.swing.JOptionPane;
public class Atv03 {
    public static void main(String args []){
        float av1,av2,trab,media;
        av1=Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da 1° prova:"));
        av2=Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da 2° prova:"));
        trab=Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho:"));
        
        media=(av1+av2+trab)/3;
        JOptionPane.showMessageDialog(null, String.format("Sua média:%.2f", media));
    }
}
