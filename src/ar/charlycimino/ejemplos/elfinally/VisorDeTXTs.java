
package ar.charlycimino.ejemplos.elfinally;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class VisorDeTXTs {
    public void mostrarTxt(String ruta) {
        File elArchivo = new File(ruta); 
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(elArchivo));
            System.out.println( br.readLine());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
            throw new RuntimeException("Error inesperado en el catch");
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("No se pudo liberar el br");
            }
        }
    }
}
