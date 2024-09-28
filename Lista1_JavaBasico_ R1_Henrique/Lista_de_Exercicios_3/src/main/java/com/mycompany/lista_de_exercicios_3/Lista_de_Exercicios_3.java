/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_3;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();
        
        if(num1>=0 && num2>=0){
        int soma = num1+num2;
        System.out.println("Soma de "+num1+" com "+num2+" = "+soma);
        
        }else if(num1<=0 && num2<=0){
        int soma = num1+num2;
        System.out.println("Soma de "+num1+" com "+num2+" = "+soma);    
        
        }else{
        System.out.println("Dados de Entrada sao Invalidos");
        }

    }
}
