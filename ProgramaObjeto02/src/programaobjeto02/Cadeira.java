/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaobjeto02;

/**
 *
 * @author Pichau
 */
public class Cadeira {
    int pernas;
    String modelo;
    boolean rodinhas;
    float preco;
    String cor;
    
    void sentar(){
        System.out.println("Voce agora estah sentado");
    }
    
    void levantar(){
        System.out.println("Voce agora estah levantado");
    }
    
    void status(){
        System.out.println("A quantidade de pernas da cadeira é "
                + pernas);
        System.out.println("O modelo da cadeira eh"
                + modelo);
        System.out.println("A cor da cadeira eh"
                + cor);
    }
    
    void carroDeCorrida(){
        if(this.rodinhas == true){
            System.out.println("Vruummmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        }
        else{
            System.out.println("Sua cadeira não possue rodinhas :/");
        }
    }    
    
    void identificaPernas(){
        switch(this.pernas) {
            case 4:
                System.out.println("Sua cadeira eh uma cadeira normal");
                break;
            case 3:
                System.out.println("Sua cadeira eh uma cadeira tripe");
                break;
            case 1:
                System.out.println("Sua cadeira eh uma cadeira saci");
                break;
            default:
                System.out.println("Tipo desconhecido de cadeira");
                break;
        }
    }
    
}
