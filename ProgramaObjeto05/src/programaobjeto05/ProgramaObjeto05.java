/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaobjeto05;

/**
 *
 * @author Pichau
 */
public class ProgramaObjeto05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta canetaPadrao = new Caneta();
        canetaPadrao.status();
        
        Caneta segundaCaneta = new Caneta();
        segundaCaneta.setCarga(80);
        segundaCaneta.destampar();
        segundaCaneta.setCor("Vermelha");
        segundaCaneta.setModelo("Maped");
        segundaCaneta.setPonta(2.0f);
        segundaCaneta.status();
    }
    
}
