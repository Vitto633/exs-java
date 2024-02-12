/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaobjeto06;

/**
 *
 * @author Pichau
 */
public class ProgramaObjeto06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco vitor = new ContaBanco(1);
        vitor.geral();
        vitor.abrirConta("cp");
        vitor.setDono("vitor");
        vitor.geral();
        vitor.depositar(1000f);
        vitor.geral();
        vitor.pagarMensalidade();
        vitor.geral();
        vitor.sacar(200f);
        vitor.geral();
    }
    
}
