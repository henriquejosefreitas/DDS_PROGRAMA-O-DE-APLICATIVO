/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15_henrique;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author h.moreira
 */

public class PROJETO_15_HENRIQUE {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o numero para o vetor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            String nomeArquivo = "tabuada_vetor" + i + ".txt";
            FileWriter arquivo = new FileWriter ("P:\\TURMAS\\HTC-DDS-19\\Henrique José F. Moreira\\"+ nomeArquivo + ".txt") ;
            PrintWriter writer = new PrintWriter(arquivo);
            for (int j = 1; j <= 10; j++) {
                writer.println(numeros[i] + " x " + j + " = " + (numeros[i] * j));
            }
            writer.close();
        }

        System.out.println("Arquivos enviados!");
    }
}