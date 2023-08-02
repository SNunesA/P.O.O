package Atv10;

public class ExercicioSemRetorno {
    public static void imprimirNumeros(int[] lista){
        for(int i=0;i<lista.length;i++){
            System.out.print(lista[i]+" ");
        }
        System.out.println(" ");
    }
    public static void somaNumeros(int[] lista){
        int soma=0;
        for(int i=0;i<lista.length;i++){
            soma+=lista[i];
        }
        System.out.println("Soma:"+soma);
    }
    public static void main(String[] args) {
        int [] numeros={15,26,35,47,54};
        imprimirNumeros(numeros);
        somaNumeros(numeros);
        imprimirNumeros(numeros);
    }
}

