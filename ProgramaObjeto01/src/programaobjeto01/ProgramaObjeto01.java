/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaobjeto01;

/**
 *
 * @author Pichau
 */
public class ProgramaObjeto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta canetaAzul = new Caneta();
        canetaAzul.modelo = "bic";
        canetaAzul.carga = 90;
        canetaAzul.cor = "azul";
        canetaAzul.destampar();
        canetaAzul.rabiscar();
        canetaAzul.status();
        
        
    }
    
}
