# Atv 05
Utilizei da base da Atv 04 e complementei com a média mensal que é divida por 3 por se tratar de três meses;

Após isso é exibido o resultado na tela com a formatação de duas casas decimais e o %n para pular linha.

~~~java
double gastosJaneiro=30000;
double gastosFevereiro=33030.77;
double gastosMarco=23899.01;
double gastosTrimestre=gastosJaneiro+gastosFevereiro+gastosMarco;
System.out.println("Gastos Trimestral:"+gastosTrimestre);
double mediaMensal=gastosTrimestre/3;
System.out.printf("Valor da média mensal = %.2f %n",mediaMensal);
~~~