/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author h.moreira
 */

public class PROJETO_15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Solicita ao usuário para digitar 5 números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número para a posição " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Gera a tabuada de cada número e salva em arquivos separados
        for (int i = 0; i < 5; i++) {
            String nomeArquivo = "tabuada_" + numeros[i] + ".txt";
            PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo));
            for (int j = 1; j <= 10; j++) {
                writer.println(numeros[i] + " x " + j + " = " + (numeros[i] * j));
            }
            writer.close();
        }

        System.out.println("Tabuadas geradas com sucesso!");
    }
}