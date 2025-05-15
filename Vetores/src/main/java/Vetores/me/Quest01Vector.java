package Vetores.me;


/**

 1. Manipulação de Vetores - Inversão de Ordem:
 Crie um programa que receba um vetor de números inteiros e inverta a ordem dos elementos.

 Entrada: Um vetor com 10 números inteiros. OK

 Saída: O vetor com os números na ordem inversa. OK

 Desafio Extra: Não utilize um vetor auxiliar. OK

 **/

public class Quest01Vector {
    public static void main(String[] args) {
        // criar Vetor
        int[] vetorVazio = new int[10];

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        for(int contador : numeros) {
            System.out.printf("%d ", contador);
        }

        System.out.println("\nLista invertida");

        for(int i = 9; i >= 0; i--){
            System.out.printf("%d ", numeros[i]);
        }

        // Invertendo ordem dos elementos do vetor
        System.out.println("Inverter numeros dentro do vetor");
        int x=0;
        for(int i = 9; i >= 0; i--){
            vetorVazio[x] = numeros[i];
            x++;
        }

        System.out.println("print final");
        printVector(vetorVazio);


        System.out.printf("\n Hello and welcome! \n");
        // Inverter Valores sem vetor auxiliar

        System.out.println("Vetor normal");
        printVector(numeros);

        inverterVector(numeros);

        System.out.println("\nVetor Invertido");

        printVector(numeros);

    }

    static public void printVector(int[] vector){
        for(int contador : vector){
            System.out.println(contador);
        }
    }

    static public void inverterVector(int[] vector){
        // Trocar elementos
        for(int i = 0; i < vector.length / 2; i++ ){
            int temp = vector[i];
            vector[i] = vector[9-i];
            vector[9 - i] = temp;
        }
    }
}