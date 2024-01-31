/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programarepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Pichau
 */
public class ProgramaRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, soma = 0,contador = 0, contador2 = 0, par = 0, impar = 0, media = 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor <br><em>(digite 0 para parar o programa)</em></html>"));
        soma += n;
        ++contador;
        if(n%2 == 0){
            ++par;
        }else{
            ++impar;
        }
        if(n>100){
            ++contador2;
        }
        
        media = soma/contador;
        }while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado: <br><hr>"+ "Total da soma: " + soma +"<br>"+"Total de pares: "+ par+"<br>Total impares:" +impar+"<br>Acima de 100: "+contador2+"<br>Media dos valores: "+media +"</html>");
    }
    
}
