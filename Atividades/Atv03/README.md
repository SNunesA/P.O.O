# Atv 03
Para realizar esta atividade, importei o JOptionPane;

Criei as variaveis avaliação 1 e 2, trabalho e media;

Converti o input para float e realizei o calculo da média, após isso apresentei em um showMessageDialog com uma string.format para limitar 2 casas decimais após a vírgula.

~~~java
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
~~~