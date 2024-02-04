/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programarotina02;

import java.util.Scanner;
/**
 *
 * @author Pichau
 */
public class ProgramaRotina02 {

    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = entrada.nextInt();
        int s = soma(n1,n2);
        System.out.println("A soma eh "+s);
    }
    
}
