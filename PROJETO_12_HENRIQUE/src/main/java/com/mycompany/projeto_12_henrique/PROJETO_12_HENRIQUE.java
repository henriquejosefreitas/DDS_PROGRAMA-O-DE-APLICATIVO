/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_henrique;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class PROJETO_12_HENRIQUE {

    public static void main(String[] args) {

            jogador_1();
            
    }

    public static void jogador_1() {        
        Scanner scan = new Scanner(System.in);
        
        String nome;
        String [] dica = new String [5];

        System.out.println("Digite o nome do filme: ");   
            nome = scan.next();        
            
        System.out.println("Digite as dicas: ");           
        for(int i=0; i<5; i++){

            dica[i] = scan.next();
        }
        String nom; 
        for(int i=0; i<5; i++){
        System.out.println("Digite o nome do filme: ");   
            nom = scan.next(); 
        
            
        if(nom == nome){
           System.out.println("Certa resposta");
           i=5;
        }else if(nom != nome){
           System.out.println("Errado");
           System.out.println("Dica %d: "+dica[i]);
            
        }else if(i==5 && nom != nome){
           System.out.println("Voce Perdeu!!!"); 
           System.out.println("O nome era "+nome); 
            
        }
        }
    }


}
