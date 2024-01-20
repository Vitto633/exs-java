/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programanomenota;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class ProgramaNomeNota {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome:");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota:");
        Float nota = teclado.nextFloat();
        
        System.out.printf("A nota do %s e %.2f \n",nome ,nota);
    }
    
}
