/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaemojifighters;

/**
 *
 * @author Pichau
 */
public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private boolean aprovada;
    private int rounds;
    
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    
    public Lutador getDesafiado(){
        return this.desafiado;
    }
    
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    
    public boolean getAprovada(){
        return this.aprovada;
    }
    
    public void marcarLuta(Lutador desafiado, Lutador desafiante){
        if(desafiado != desafiante && desafiado.getCategoria().equals(desafiante.getCategoria())){
            this.aprovada = true;
            this.setDesafiante(desafiante);
            this.setDesafiado(desafiado);
        }
        else{
            this.aprovada = false;
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar(){
        if(this.getAprovada()){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            int vencedor = (int) (Math.random() * 3); 
            
            switch(vencedor){
                case 0:
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("houve um empate");
                break;
                case 1: 
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("O vencedor da luta foi "
                            + this.desafiante.getNome());
                break;
                case 2:
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("O vencedor da luta foi "
                            + this.desafiado.getNome());
                break;
                default:
                    System.out.println("erro");
            }
        }
        else{
            System.out.println("A luta nao pode acontecer");
        }
    }
}
