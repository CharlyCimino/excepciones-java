
package ar.charlycimino.ejemplos.trycatch;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test2 {

    /*
      Prueba con manejo de excepciones (un solo catch general)
    */
    public static void main(String[] args) {
        int x = 10, y, z;
        System.out.print("Ingrese y: ");
        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        }
        catch (Exception ex) {
            System.out.println("Ocurrió un error");
        }
        System.out.println("Adiós");
    }

}
