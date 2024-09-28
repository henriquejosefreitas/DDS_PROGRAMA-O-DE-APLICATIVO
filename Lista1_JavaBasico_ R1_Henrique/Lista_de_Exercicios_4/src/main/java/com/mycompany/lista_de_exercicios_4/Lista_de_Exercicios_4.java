/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_4;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */

public class Lista_de_Exercicios_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triangulo:");
        double lado1 = scan.nextDouble();

        System.out.println("Digite o segundo lado do triangulo:");
        double lado2 = scan.nextDouble();

        System.out.println("Digite o terceiro lado do triangulo:");
        double lado3 = scan.nextDouble();

        // Verifica se os lados formam um triângulo
        boolean formaTriangulo = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

        if (formaTriangulo) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("E um triangulo equilatero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("E um triangulo isosceles.");
            } else {
                System.out.println("E um triangulo escaleno.");
            }
        } else {
            System.out.println("Esses lados não formam um triangulo.");
        }

    }
}
