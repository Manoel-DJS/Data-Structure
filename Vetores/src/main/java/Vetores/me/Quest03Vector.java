package Vetores.me;

import java.util.Scanner;

/**

 3. União e Interseção de Vetores:
 Faça um programa que leia dois vetores de inteiros (com até 10 elementos cada) e gere:

 Um vetor contendo a união dos elementos (sem repetir).

 Um vetor contendo a interseção dos elementos (elementos comuns).

 Desafio Extra: Ordene os vetores resultantes em ordem crescente.

 */
public class Quest03Vector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int MAX = 10; // Numero maximo de elementos

        int[] vector01 = new int[MAX];
        int tamanhoVetor01 = 0;
        int[] vector02 = new int[MAX];
        int tamanhoVetor02 = 0;

        int[] vectorUniaoElementos = new int[MAX*2];
        int tamUniao = 0;

        int[] vectorIntersecaoElementos = new int[MAX];
        int tamanhoIntersecao = 0;

        System.out.println("Preenchendo elementos vetor 1: ");
        System.out.println("Digite o tamanho do vetor 1 (max 10): ");
        tamanhoVetor01 = scanner.nextInt();

        for(int i = 0; i < tamanhoVetor01; i++){
            System.out.println("Digite: ");
            vector01[i] = scanner.nextInt();
        }

        System.out.println("Preenchendo elementos vetor 2: ");
        System.out.println("Digite o tamanho do vetor 2 (max 10): ");
        tamanhoVetor02 = scanner.nextInt();

        for(int i = 0; i < tamanhoVetor02; i++){
            System.out.println("Digite: ");
            vector02[i] = scanner.nextInt();
        }

        // Um vetor contendo a união dos elementos (sem repetir).

        // vector01
        for(int i = 0; i < vector01.length; i++ ){ // repare o iterador
            boolean numeroRepetido = false;

            for(int c = 0; c < tamUniao; c++){
                if(vector01[i] == vectorUniaoElementos[c]){
                    numeroRepetido = true;
                    break;
                }
            }

            if(!numeroRepetido){
                    vectorUniaoElementos[tamUniao++] = vector01[i];
            }
        }

        // vector02
        for(int i= 0; i < vector02.length; i++){
            boolean numeroRepetido = false;

            for(int c = 0; c < tamUniao; c++){
                if(vector02[i] == vectorUniaoElementos[c]){
                    numeroRepetido = true;
                    break;
                }
            }
            if(!numeroRepetido){
                vectorUniaoElementos[tamUniao++] = vector02[i];
            }
        }

        for(int i = 0; i < vector01.length; i++){

            for(int c = 0; c < vector02.length; c++){
                if(vector01[i] == vector02[c]){
                    boolean numeroRepetido = false;

                    for(int t = 0; t < vectorIntersecaoElementos.length; t++){
                        if(vector01[i] == vectorIntersecaoElementos[t]){
                            numeroRepetido = true;
                            break;
                        }
                    }
                    if(!numeroRepetido){
                        vectorIntersecaoElementos[tamanhoIntersecao++] = vector01[i];
                    }
                    break;
                }
            }
        }

        // Imprimindo União dos elementos
        for(int contador: vectorUniaoElementos){
            if(contador != 0){
                System.out.println(contador);
            }

        }

        System.out.println("\n\nInterseção dos vetores (elementos comuns):");
        if (tamanhoIntersecao == 0) {
            System.out.println("Não há elementos comuns.");
        } else {
            for (int i = 0; i < tamanhoIntersecao; i++) {
                System.out.print(vectorIntersecaoElementos[i] + " ");
            }
        }

        scanner.close();

    }


}
