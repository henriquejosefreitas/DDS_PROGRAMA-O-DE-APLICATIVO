/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_7;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */

public class Lista_de_Exercicios_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        int soma = 0;
        int quantidadeValores = 0;

        System.out.println("Digite valores positivos inteiros (digite um valor negativo ou zero para encerrar):");

        do {
            System.out.print("Digite um valor: ");
            valor = scan.nextInt();

            if (valor > 0) {
                maiorValor = Math.max(maiorValor, valor);
                menorValor = Math.min(menorValor, valor);

                soma += valor;

                quantidadeValores++;
            }
        } while (valor > 0);

        if (quantidadeValores > 0) {
            double media = (double) soma / quantidadeValores;

            System.out.println("\nResultados:");
            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
            System.out.println("Quantidade de valores: " + quantidadeValores);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média dos valores: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

    }
}
