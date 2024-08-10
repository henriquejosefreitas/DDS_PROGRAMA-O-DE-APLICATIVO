/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8_henrique;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class PROJETO_8_HENRIQUE {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite quantas medalhas de OURO seu país ganhou: ");
        int n1 = scan.nextInt();
        System.out.println("Por favor digite quantas medalhas de PRATA seu país ganhou: ");
        int n2 = scan.nextInt();
        System.out.println("Por favor digite quantas medalhas de BRONZE seu país ganhou: ");
        int n3 = scan.nextInt();
        
        double imc = n1+n2+n3;
        
    if (n1 > 10){
    System.out.println("Ótimo desempenho");
    
    }else if(n1 >= 5 & n1 <= 10){
    System.out.println("Bom desempenho"); 
    
    }else if(n1 < 5 & imc > 20){
    System.out.println("Desempenho regular");
    
    }else if(imc <= 20){
    System.out.println("Desempenho fraco");
    
    }

    
    }
}
