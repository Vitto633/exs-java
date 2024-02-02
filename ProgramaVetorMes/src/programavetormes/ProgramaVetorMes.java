/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programavetormes;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author Pichau
 */
public class ProgramaVetorMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GregorianCalendar calendario = new GregorianCalendar();
        Date dataSistema = new Date();
        int dataAtual = dataSistema.getYear() + 1900;
        String meses[] = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String dias[] = {"31", "28", "31", "30","31","30","31","31","30","31","30","31"};
        
        if(calendario.isLeapYear(dataAtual) == true){
            dias[1] = "29";
        }
        for(int i = 0; i<meses.length;i++){
            System.out.println("O mes "+meses[i]+" tem "+dias[i]+" dias");
        }
                
    }
    
}
