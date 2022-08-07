
package ar.charlycimino.ejemplos.uncheckedexceptions;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test6 {

    /*
      Prueba de arrojo de excepciones manualmente
    */
    public static void main(String[] args) {
        int y, z;
        System.out.print("Ingrese y: ");
        y = new Scanner(System.in).nextInt();
        z = new Calculadora().factorial(y);
        System.out.println("Resultado: " + z);
        System.out.println("Adiós!");
    }

}
