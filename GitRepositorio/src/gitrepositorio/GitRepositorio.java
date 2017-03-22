/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitrepositorio;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class GitRepositorio {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int soma = 0, i = 0;
        int vetor[] = new int[3];
        String piscada;
        
        do{
            piscada = sc.nextLine();

            if(piscada.equals("--*")){
                soma += 1; 
            }else{
                if(piscada.equals("*--")){
                    soma += 4; 
                }
            }

            if(piscada.equals("caw caw")){
                vetor[i] = soma;
                i++;
                soma = 0;
            }
            
        }while(i < 3);
        soma =0;
        for (int j = 0; j < vetor.length; j++) {
            soma+=vetor[j]; 
        }
        
        if(soma<=1000){
            for (int j = 0; j < vetor.length; j++) {
                System.out.println(vetor[j]); 
            }
        }
        
    }
    
}
    

