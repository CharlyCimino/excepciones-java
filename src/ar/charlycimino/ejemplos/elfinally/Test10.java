
package ar.charlycimino.ejemplos.elfinally;

import ar.charlycimino.ejemplos.elfinally.VisorDeTXTs;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test10 {

    /*
      Uso de la cláusula finally
    */
    public static void main(String[] args) {
        VisorDeTXTs v = new VisorDeTXTs();
        v.mostrarTxt("src\\ar\\charlycimino\\ejemplos\\checkedexceptions\\MENSAJE_OCULTOz.txt");
    }

}