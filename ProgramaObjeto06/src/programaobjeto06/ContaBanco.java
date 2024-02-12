/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaobjeto06;

/**
 *
 * @author Pichau
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco(int numeroConta){
        this.numConta = numeroConta;
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(String a){
        if(a.equals("cc")){
            this.tipo = "cc";
            this.saldo = 50f;
            this.status = true;
        } 
        else if(a.equals("cp")){
            this.tipo = "cp";
            this.saldo = 150f;
            this.status = true;
        }
        else{
            System.out.println("Invalido, tipo nao existente.");
        }
    }
    
    public void fecharConta(){
        if(this.saldo != 0 ){
            System.out.println("Nao eh possivel fechar a conta");
        }
        else{
            this.tipo = "";
            this.status = false;
        }
    }
    
    public void depositar(float valor){
        this.saldo = this.saldo + valor;
    }
    
    public void sacar(float valor){
        if(valor > this.saldo){
            System.out.println("Nao e possivel sacar o valor e maior que o saldo.");
        }
        else{
            this.saldo = this.saldo - valor;
        }
    }
    
    public void pagarMensalidade(){
        if(this.tipo.equals("cp")){
            this.saldo = this.saldo - 12f;
        }
        else if(this.tipo.equals("cc")){
            this.saldo = this.saldo - 20f;
        }
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String nome){
        this.dono = nome;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void geral(){
        System.out.println("DADOS DA CONTA");
        System.out.printf("\n numConta: %d",this.numConta);
        System.out.printf("\n tipo: %s", this.tipo);
        System.out.printf("\n dono: %s", this.dono);
        System.out.printf("\n saldo: %.2f", this.saldo);
        System.out.printf("\n status: %s", this.status);
        System.out.printf("\n ");

    }
}
