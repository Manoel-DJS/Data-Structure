package Vetores.me;

import java.util.Scanner;

/**
 2. Estatísticas com Vetores - Média, Maior e Menor:
 Desenvolva um programa que leia um vetor com 20 números reais e exiba:

 A média dos números. OK

 O maior valor e sua posição no vetor. OK

 O menor valor e sua posição no vetor. OK

 Desafio Extra: Permita que o usuário escolha o tamanho do vetor (máximo de 100).
 */

public class Quest02Vector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorValor = -99999999;
        int indiceMaiorValor = -1;
        int indiceMenorValor = -1;
        int menorValor = 999999999;
        float mediaDosValores = 0;
        // int[] numeros = {10,20,30,40,50,60,70,80,90,100, 1,2,3,4,5,6,7,8,9,10};

        System.out.println("Escolha o tamanho(máx de 100) do vetor: ");
        int tamanho = scanner.nextInt();

        if(tamanho > 100 || tamanho < -1){
            System.out.println("Valor fora do intervalo permitido");
            return; // finalizar programa

        } else{
            int[] numeros = new int[tamanho];
            System.out.println("--> Preenchendo Vetor <--");
            for(int i = 0; i < tamanho; i++){
                System.out.println("Digite: ");
                numeros[i] = scanner.nextInt();
            }

            for(int i = 0; i <= numeros.length -1; i++){
                mediaDosValores += numeros[i];
                if(maiorValor < numeros[i]){
                    maiorValor = numeros[i];
                    indiceMaiorValor = i;
                }
                if(menorValor > numeros[i]){
                    menorValor = numeros[i];
                    indiceMenorValor = i;
                }

            }

            System.out.printf("Média dos valores no vetor: %.1f \n" +
                    "Maior Valor no vetor e seu indice: %d %d\n" +
                    "Menor Valor no vetor e seu indice: %d %d", (mediaDosValores/tamanho), maiorValor, indiceMaiorValor, menorValor, indiceMenorValor);
        }

    }
}
