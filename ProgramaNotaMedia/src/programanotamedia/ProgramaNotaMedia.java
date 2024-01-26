/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programanotamedia;

import java.util.Scanner;

public class ProgramaNotaMedia {
    public static void main(String[] args) {
        //criação do objeto 
        Scanner teclado = new Scanner(System.in);
        
        //declarando as váriaveis
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a primeira nota do " + nome + " :");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota do "+ nome + " :");
        float n2 = teclado.nextFloat();
        
        //fazendo o calculo
        float media = (n1 + n2)/2;
        
        if(media>9){
            System.out.println("Parabens"+ nome+"!");
        }
        System.out.println("A media final de "+ nome + "eh de: "+ Float.toString(media));
    }
    
}
