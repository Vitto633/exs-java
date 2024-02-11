/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaobjeto05;

/**
 *
 * @author Pichau
 */
public class Caneta {
    private String modelo;
    private float ponta;  
    private boolean tampada;
    private int carga;
    private String cor; 
    
    public Caneta(){
        this.modelo = "BIC";
        this.ponta = 0.5f;
        this.tampada = true;
        this.carga = 100;
        this.cor = "azul";
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String valor){
        this.cor = valor;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String valor){
        this.modelo = valor;
    }
    
    public int getCarga(){
        return this.carga;
    }
    
    public void setCarga(int valor){
        this.carga = valor;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float valor){
        this.ponta = valor;
    }
    
    public boolean tampar(){
        return this.tampada = true;
    }
    
    public boolean destampar(){
        return this.tampada = false;
    }
    
    public void status(){
        System.out.printf("\n\nDADOS DA CANETA \n");
        System.out.printf(" modelo: %s \n",this.modelo);
        System.out.printf(" carga: %d \n", this.carga);
        System.out.printf(" ponta: %s \n", this.ponta);
        System.out.printf(" cor: %s \n", this.cor);
        System.out.printf(" tampada: %s \n", this.tampada);
        this.rabiscar();
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println(" A caneta esta tampada nao eh possivel rabiscar.");
        }
        else{
            System.out.println(" Rabiscando...");
        }
    }
}
