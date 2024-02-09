/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaobjeto03;

/**
 *
 * @author Pichau
 */
public class Mesa {
    String modelo;
    float valor;
    int pernas;
    boolean grande;
    
    void verificaTamanhoMesa(){
        if(this.grande == true){
            System.out.println("Esse eh um mesao");
        }
        else{
            System.out.println("Mesinha de pobre");
        }
    }
    
    void status(){
        System.out.println("modelo: "
                + modelo);
        System.out.println("valor: "
                + valor);
        System.out.println("pernas"
                + pernas);
        verificaTamanhoMesa();
    }
}
