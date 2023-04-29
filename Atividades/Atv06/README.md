# Atv 06
Para realizar esta atividade, estanciei a classe in;

Criei as váriaveis necessárias;

Coletei os valores através do input digitado pelo usuário;

Fiz o cálculo usando a fórmula de juros simples;

Exebi na tela o resultado formatado para não ter casas decimais após a virgula.

~~~java
import java.util.Scanner;
Scanner in = new Scanner(System.in);
double deposito, montante,meses,juros=0.5/100;
System.out.println("Depósito:");
deposito=in.nextDouble();
System.out.println("Montante desejado:");
montante=in.nextDouble();
meses=(montante-deposito)/(deposito*juros);
System.out.printf("Meses necessário para acumular este montante: %.0f %n",meses);
~~~