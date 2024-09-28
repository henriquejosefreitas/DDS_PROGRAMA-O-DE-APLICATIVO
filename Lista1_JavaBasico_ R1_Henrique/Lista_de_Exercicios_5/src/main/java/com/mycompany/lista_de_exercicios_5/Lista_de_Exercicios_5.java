/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_5 {

    public static void main(String[] args) throws IOException  {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do lutador:");
        String nome = scan.next();
        scan.nextLine();
        
        System.out.print("Digite o peso do lutador:");
        int peso = scan.nextInt();
        scan.nextLine();

        FileWriter arquivo = new FileWriter ("P:\\TURMAS\\HTC-DDS-19\\Henrique José F. Moreira\\"+ "Registro_do_Lutador" + ".txt") ;
        PrintWriter gravar = new PrintWriter (arquivo);        
        
        if(peso<65){
        gravar.printf ("\nNome fornecido: "+nome);
        gravar.printf ("\nPeso fornecido: "+peso);
        gravar.printf ("\nSaída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria Pena");

        }else if(peso>=65 && peso<72){
        gravar.printf ("\nNome fornecido: "+nome);
        gravar.printf ("\nPeso fornecido: "+peso);
        gravar.printf ("\nSaída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria Leve");

        }else if(peso>=72 && peso<79){
        gravar.printf ("\nNome fornecido: "+nome);
        gravar.printf ("\nPeso fornecido: "+peso);
        gravar.printf ("\nSaída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria Ligeiro");

        }else if(peso>=79 && peso<86){
        gravar.printf ("\nNome fornecido: "+nome);
        gravar.printf ("\nPeso fornecido: "+peso);
        gravar.printf ("\nSaída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria Meio médio");

        }else if(peso>=86 && peso<93){
        gravar.printf ("\nNome fornecido: "+nome);
        gravar.printf ("\nPeso fornecido: "+peso);
        gravar.printf ("\nSaída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria Médio");

        }else if(peso>=93 && peso<100){
        gravar.printf ("\nNome fornecido: "+nome);
        gravar.printf ("\nPeso fornecido: "+peso);
        gravar.printf ("\nSaída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria Meio pesado");

        }else if(peso>=100){
        gravar.printf ("\nNome fornecido: "+nome);
        gravar.printf ("\nPeso fornecido: "+peso);
        gravar.printf ("\nSaída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria Pesado");
        }
        
      arquivo.close();  
    }
}

