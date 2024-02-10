/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programaobjeto04;

/**
 *
 * @author Pichau
 */
public class Aula {
    public float tempoInicio;
    public float termino;
    public String assunto;
    private String material = "Livro";
    
    protected float duracao(){
        float n1 = this.tempoInicio;
        float n2 = this.termino;
        return n2 - n1;
    }
    
    public void status(){
        System.out.println("A duracao da aula eh de "
                + duracao());
        System.out.println("O assunto principal da aula eh " 
                + assunto);
        System.out.println("O material da aula eh "
                + material);
    }
}
