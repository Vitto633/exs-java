/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaobjeto03;

/**
 *
 * @author Pichau
 */
public class ProgramaObjeto03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mesa primeiraMesa = new Mesa();
        primeiraMesa.grande = true;
        primeiraMesa.modelo = "retratil";
        primeiraMesa.valor = 1200.40f;
        primeiraMesa.pernas = 4;
        primeiraMesa.status();
        
        Mesa segundaMesa = new Mesa();
        segundaMesa.grande = false;
        segundaMesa.modelo = "fofa";
        segundaMesa.valor = 2000.00f;
        segundaMesa.pernas = 3;
        segundaMesa.status();
    }
    
}
