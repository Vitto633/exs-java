/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaemojifighters;

/**
 *
 * @author Pichau
 */
public class ProgramaEmojiFighters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l1 = new Lutador("pretty boy", "franca", 31, 1.75, 68.9, 11, 2, 1);
        Lutador l2 = new Lutador("putScript", "brasil", 29, 1.68, 57.8, 14, 2, 3);
        Lutador l3 = new Lutador("snapShadow", "eua", 35, 1.65, 80.9, 12, 2, 1);
        Lutador l4 = new Lutador("dead code", "australia", 28, 1.93, 81.6, 13, 0, 2);
        Lutador l5 = new Lutador("ufoCobol", "brasil", 37, 1.70, 119.3, 5, 4, 3);
        Lutador l6 = new Lutador("nerdArd", "eua", 30, 1.81, 105.7, 12, 2, 4);
        
        l1.apresentar();
        l1.ganharLuta();
        l1.status();
        
        l2.apresentar();
        l2.ganharLuta();
        l2.status();
        
        l3.apresentar();
        l3.ganharLuta();
        l3.status();
        
        l4.apresentar();
        l4.ganharLuta();
        l4.status();
        
        l5.apresentar();
        l5.ganharLuta();
        l5.status();
        
        l6.apresentar();
        l6.ganharLuta();
        l6.status();
        
        
        
        
        
        
        
    }
    
}
