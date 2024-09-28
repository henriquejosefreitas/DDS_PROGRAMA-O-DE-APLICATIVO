/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_6;

import java.util.Scanner;
/**
 *
 * @author h.moreira
 */

public class Lista_de_Exercicios_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;

        do {
            System.out.print("Digite um numero inteiro (ou 0 para sair): ");
            x = scan.nextInt();

            if (x > 0) {
                System.out.println("O numero " + x + " e positivo.");
            } else if (x < 0) {
                System.out.println("O numero " + x + " e negativo.");
            } else {
                System.out.println("Voce digitou zero. Encerrando o programa.");
            }
        } while (x != 0);

    }
}
