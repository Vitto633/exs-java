/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pichau
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutador(String nome, String nacionalidade, int idade,float altura, float peso, int vitorias, int derrotas, int empates){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
        
    }
    
    public void apresentar(){
        System.out.println("============================");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: "+ this.getNacionalidade());
        System.out.println("Tem "+ this.getIdade() + " anos");
        System.out.println("Tem "+ this.getAltura() + " metros");
        System.out.println("Pesando "+ this.getPeso());
        System.out.println("Ganhou: "+ this.getVitorias());
        System.out.println("Perdeu: "+ this.getDerrotas());
        System.out.println("Empatou: "+ this.getEmpates());
    }
    
    public void status(){
        System.out.println("-STATUS-");
        System.out.println(this.getNome());
        System.out.println("Eh um peso "+ this.getCategoria());
        System.out.println(this.getVitorias()+ "vitorias");
        System.out.println(this.getDerrotas()+ "derrotas");
        System.out.println(this.getEmpates() + "empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria(peso);
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    private void setCategoria(float peso){
        if(peso<52.2){
            this.categoria = "invalido";
        }
        else if(peso <= 70.3){
            this.categoria = "leve";
        }
        else if(peso <83.9){
            this.categoria = "medio";
        }
        else if(peso <= 120.2){
            this.categoria = "pesado";
        }
        else{
            this.categoria = "invalido";
        }
    }
    
    public int getVitorias(){
        return this.vitorias;
    }
    
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    
    public int getDerrotas(){
        return this.derrotas;
    }
    
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    
    public int getEmpates(){
        return this.empates;
    }
    
    public void setEmpates(int empates){
        this.empates = empates;
    }
    
    
}
