/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediafinal;

import java.util.Scanner;

/**
 *
 * @author Alcides
 */
public class MediaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        double nota1,nota2,nota3,nota4,media;
        
        System.out.println("Digite a 1° nota: ");
        nota1 = tec.nextDouble();
        
        System.out.println("Digite a 2° nota: ");
        nota2 = tec.nextDouble();
        
        System.out.println("Digite a 3° nota: ");
        nota3 = tec.nextDouble();
        
        System.out.println("Digite a 4° nota: ");
        nota4 = tec.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
        if(media < 6){
            System.out.println("Infelizmente você está REPROVADO !");
        }else{
            System.out.println("Parabéns você está APROVADO !");
        }
    }
    
}
