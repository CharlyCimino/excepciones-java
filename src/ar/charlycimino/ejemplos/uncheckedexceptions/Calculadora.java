
package ar.charlycimino.ejemplos.uncheckedexceptions;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Calculadora {
    public int factorial (int num) {
        if (num < 0) {
            throw new RuntimeException("No se puede calcular el factorial de un número negativo");
        }
        if (num > 12) {
            throw new RuntimeException("Por limitaciones técnicas, no se puede calcular el factorial de un entero mayor que 12");
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
