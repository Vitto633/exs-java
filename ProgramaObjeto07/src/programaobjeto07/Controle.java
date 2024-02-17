/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaobjeto07;

/**
 *
 * @author Pichau
 */
public class Controle implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public Controle(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
        
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private void setVolume(int valor){
        this.volume = valor;
    }
    
    private boolean isLigado(){
        return this.ligado;
    }
    
    private void setLigado(boolean valor){
        this.ligado = valor;
    }
    
    private boolean isTocando(boolean par){
        return this.tocando;
    }
    
    private void setTocando(boolean valor){
        this.tocando = valor;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Estah ligado?: " + this.isLigado());
        System.out.println("Estah tocando?: " + this.isTocando(true));
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i< this.getVolume(); i++){
            System.out.print("[]");
        }
        System.out.printf("\n\n\n");
    }

    @Override
    public void fecharMenu() {
        
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }
        else{
            System.out.println("Impossivel aumentar o volume, controle desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        }
        else{
            System.out.println("Impossivel diminuir o volume, controle desligado.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado()){
            this.setVolume(0);
        }
        else{
            System.out.println("Impossivel deixar mudo, controle desligado.");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado()){
            this.setVolume(50);
        }
        else{
            System.out.println("Impossivel tirar do mudo, controle desligado.");
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando(true))){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && (this.isTocando(true))){
            this.setTocando(false);
        }
    }
        
}
