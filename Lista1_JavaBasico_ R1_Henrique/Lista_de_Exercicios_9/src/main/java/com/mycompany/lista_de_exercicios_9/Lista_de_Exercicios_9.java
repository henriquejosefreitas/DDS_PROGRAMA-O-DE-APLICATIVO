/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_9;

/**
 *
 * @author h.moreira
 */

import java.util.Scanner;

public class Lista_de_Exercicios_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de Min: ");
        int min = scan.nextInt();

        System.out.print("Digite o valor de Max: ");
        int max = scan.nextInt();
        int total = 0;
        
        if (min > max) {
            System.out.println("Min é maior que Max. Invertendo os valores...");
            int temp = min;
            min = max;
            max = temp;
        }

        int tamanhoVetor = max ;
        int[] valoresValidos = new int[tamanhoVetor];
        int contadorValoresValidos = 0;

        int x;
        System.out.print("Digite um valor para X (ou 0 para sair): ");
        x = scan.nextInt();
        
        while (x != 0){

            if (x >= min && x <= max) {
                total += x;
                valoresValidos[contadorValoresValidos] = x;
                contadorValoresValidos++;
            } else {
                System.out.println("Valor fora do intervalo [" + min + ", " + max + "] ignorado na totalização.");
            }
            
            x = scan.nextInt();
        }

        System.out.println("Valores válidos dentro do intervalo [" + min + ", " + max + "]:");
        for (int i = 0; i < contadorValoresValidos; i++) {
            System.out.print(valoresValidos[i] + " ");
        }
        System.out.println("\nTotal de valores: " + contadorValoresValidos);
        System.out.println("Total: " + total);
    }
}
