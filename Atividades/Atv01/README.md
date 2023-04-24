# Atv 01
Para resolução desta atividade 
Primeiro instanciei o in;

Criei as variaveis do tipo float num e soma, já inicializando soma com 0;

Utilizei o laço de do while pois ele precisa executar pelo menos uma vez o codigo;

O try catch para tratar das exceções e não exibir nenhum erro da conversão em float e ao invés disso, executa um break para sair do laço, entendendo que se o usuário digitou algo diferente de um número, ele quer parar a execução da soma;

Após isso faz uma exibição concatenando a string "Soma" com o conteúdo da variavel soma. 

~~~java
import java.util.Scanner;
Scanner in = new Scanner(System.in);
float num,soma = 0;

do{
    System.out.println("Digite um numero para a soma:");
    try{
        num=in.nextFloat();
    }catch(Exception e){
        break;
    }
    soma+=num;
}while(true);
System.out.println("Soma:"+soma);
~~~