/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_8;

/**
 *
 * @author h.moreira
 */

import java.util.Scanner;

public class Lista_de_Exercicios_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de Min: ");
        int min = scan.nextInt();
        
        System.out.print("Digite o valor de Max: ");        
        int max = scan.nextInt();
        int total = 0;
        int quantidadeValores = 0;

        System.out.println("Digite os valores de X (digite 0 para sair):");
        int x = scan.nextInt();

        while (x != 0) {
            if (x >= min && x <= max) {
                total += x;
                quantidadeValores++;
            } else if (min > max) {
            System.out.println("Min maior que Max. Invertendo os valores.");
            int temp = min;
            min = max;
            max = temp;
            }else{
            System.out.println("Valor fora do intervalo [" + min + ", " + max + "] ignorado na totalização.");
            }

            x = scan.nextInt();
        }

        System.out.println("Total: " + total);
        System.out.println("Quantidade de valores fornecidos: " + quantidadeValores);

    }
}
