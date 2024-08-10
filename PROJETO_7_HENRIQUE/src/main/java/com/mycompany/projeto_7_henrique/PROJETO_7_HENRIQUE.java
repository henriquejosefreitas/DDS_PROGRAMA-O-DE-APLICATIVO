/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_henrique;

import java.util.Scanner;
/**
 *
 * @author h.moreira
 */
public class PROJETO_7_HENRIQUE {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite seu peso: ");
        int n1 = scan.nextInt();
        System.out.println("Por favor digite sua altura: ");
        double n2 = scan.nextDouble();
        double imc = n1 / (n2*n2);
        System.out.println("IMC: "+imc);
        
    if (imc < 18.8){
    System.out.println("Abaixo do peso normal");
    
    }else if(imc >= 18.8 & imc <= 24.9){
    System.out.println("Peso normal"); 
    
    }else if(imc >= 25 & imc <= 29.9){
    System.out.println("Excesso de peso");
    
    }else if(imc >= 30 & imc <= 34.9){
    System.out.println("Obesidade Classe I");
    
    }else if(imc >= 35 & imc <= 39.9){
    System.out.println("Obesidade Classe II");
    
    }else if(imc >= 40){
    System.out.println("Obesidade Classe III");
    
    }




    
    }
}
