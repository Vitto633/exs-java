/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidioma;

import java.util.Locale;

public class ProgramaIdioma {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String idioma = locale.getLanguage();
        System.out.println("O idioma do sistema e:");
        System.out.println(idioma);
    
}
}