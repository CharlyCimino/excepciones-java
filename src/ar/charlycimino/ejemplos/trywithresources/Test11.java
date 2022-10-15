
package ar.charlycimino.ejemplos.trywithresources;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test11 {

    /*
      Uso del try-with-resources (a partir de Java 7)
    */
    public static void main(String[] args) {
        VisorDeTXTs v = new VisorDeTXTs();
        v.mostrarTxt("src\\ar\\charlycimino\\ejemplos\\checkedexceptions\\MENSAJE_OCULTO.txt");
    }

}