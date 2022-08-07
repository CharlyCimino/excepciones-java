
package ar.charlycimino.ejemplos.trycatch;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test5 {

    /*
      ¿Dónde se lanza la excepción?
    */
    public static void main(String[] args) {
        int x = Math.incrementExact(2147483647);
        System.out.println(x);
    }

}
