/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaobjeto02;

/**
 *
 * @author Pichau
 */
public class ProgramaObjeto02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadeira primeiraCadeira = new Cadeira();
        primeiraCadeira.cor = "vermelhona";
        primeiraCadeira.pernas = 4;
        primeiraCadeira.preco = 120.40f;
        primeiraCadeira.rodinhas = true;
        primeiraCadeira.modelo = "plastico";
        primeiraCadeira.status();
        primeiraCadeira.sentar();
        primeiraCadeira.carroDeCorrida();
        primeiraCadeira.identificaPernas();
        
        Cadeira camaleao = new Cadeira();
        camaleao.cor = "varias cores";
        camaleao.pernas = 1;
        camaleao.preco = 2000.00f;
        camaleao.rodinhas = true;
        camaleao.modelo = "costas de camaleao";
        camaleao.sentar();
        camaleao.status();
        camaleao.carroDeCorrida();
        camaleao.identificaPernas();
        
        
    
    }
    
}
