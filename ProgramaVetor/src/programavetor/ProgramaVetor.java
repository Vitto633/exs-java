/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programavetor;

/**
 *
 * @author Pichau
 */
public class ProgramaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {5, 3, 5, 8, 9, 2};
        System.out.println("O vetor " + "possue "+ n.length + " posicoes");
        for(int contador = 0;contador<n.length; contador++){
            System.out.println("O valor do vetor na posicao " + contador + " eh igual a " + n[contador]);
        }
    }
    
}
