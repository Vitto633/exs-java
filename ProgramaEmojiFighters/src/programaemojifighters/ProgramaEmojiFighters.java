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
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("pretty boy", "franca", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("putScript", "brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2]= new Lutador("snapShadow", "eua", 35, 1.65, 80.9, 12, 2, 1);
        l[3]= new Lutador("dead code", "australia", 28, 1.93, 81.6, 13, 0, 2);
        l[4]= new Lutador("ufoCobol", "brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5]= new Lutador("nerdArd", "eua", 30, 1.81, 105.7, 12, 2, 4);
        
        Luta l1 = new Luta();
        
        l1.marcarLuta(l[3], l[2]);
        l1.lutar();
        
        l[3].status();
    }
    
}
