/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programarotina01;
    
    import java.util.Scanner;
/**
 *
 * @author Pichau
 */
public class ProgramaRotina01 {
    
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma eh "+s);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int a, b;
        
        System.out.print("Digite o primeiro valor: ");
        a = entrada.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = entrada.nextInt();
        soma(a,b);
        
    }
    
}
