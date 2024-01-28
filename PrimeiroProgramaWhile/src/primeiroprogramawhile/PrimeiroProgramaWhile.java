/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiroprogramawhile;

import java.util.Scanner;
/**
 *
 * @author Pichau
 */
public class PrimeiroProgramaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o numero de cambalhotas:");
        int cambalhota = teclado.nextInt();
        int contadorCambalhota = 0;
        
        while(contadorCambalhota < cambalhota){
            System.out.printf("Cambalhota numero %d \n", contadorCambalhota + 1);
            contadorCambalhota += 1;
        }
    }
    
} 
