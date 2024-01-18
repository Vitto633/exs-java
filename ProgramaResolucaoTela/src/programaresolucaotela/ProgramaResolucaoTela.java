/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaresolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ProgramaResolucaoTela {
    public static void main(String[] args) {
        
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        Dimension tamanhoTela = toolkit.getScreenSize();
        
        int largura = tamanhoTela.width;
        int altura = tamanhoTela.height;
        
        System.out.println("As dimensoes da tela sao: " + largura + "x" + altura);
    }
    
}
