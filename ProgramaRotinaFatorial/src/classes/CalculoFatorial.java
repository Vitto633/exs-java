/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Pichau
 */
public class CalculoFatorial {
    
    public static String contador(int valor){
        long fatorial = 1;
        String resultado = "";
        while(valor>=1){
            resultado += " x ";
            resultado += valor;
            valor--;
            
        }
        return resultado;
    }
    
    public static long fatorial(int valor){
        long fatorial = 1;
        while(valor>=1){
            fatorial *= valor;
            valor--;
        }
        return fatorial;
    }
}
