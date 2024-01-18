/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letra;
import java.util.Scanner;
/**
 *
 * @author JUAN
 */
public class Letra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          char letra;
       Scanner entrada = new Scanner(System.in);        
        System.out.println("Escribe una letra");
        letra=entrada.next().charAt(0);
        System.out.println("Tu letra escrita  es: "+letra);
    }
    
}
