
package ar.charlycimino.ejemplos.trycatch;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test1 {

    /*
      Prueba sin manejo de excepciones
    */
    public static void main(String[] args) {
        int x = 10, y, z;
        System.out.print("Ingrese y: ");
        y = new Scanner(System.in).nextInt();
        z = x / y;
        System.out.println("Resultado: " + z);
        System.out.println("Adiós!");
    }

}
