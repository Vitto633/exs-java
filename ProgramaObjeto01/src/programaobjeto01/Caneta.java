/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaobjeto01;

/**
 *
 * @author Pichau
 */
public class Caneta {
    String modelo;
    float ponta;
    boolean tampada;
    int carga;
    String cor;
    
    void tampar(){
        if(this.tampada == false){
            this.tampada = true;
        }
    }
    void destampar(){
        if(this.tampada == true){
            this.tampada = false;
        }
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("A caneta estah tampada nao pode rabiscar!");
        }
        else{
            System.out.println("Rabiscando");
        }
    }
    
    void status(){
        System.out.println("O modelo da caneta eh "+ modelo);
        System.out.println("O numero da ponta eh "+ponta);
        System.out.println("A cor da caneta eh "+cor);
        System.out.println("A caneta estah com "+carga+"de carga");
}
}