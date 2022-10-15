
package ar.charlycimino.ejemplos.trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class VisorDeTXTs {
    public void mostrarTxt(String ruta) {
        File elArchivo = new File(ruta); 
        try (BufferedReader br = new BufferedReader(new FileReader(elArchivo));) {
            System.out.println( br.readLine());
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
            throw new RuntimeException("Error inesperado en el catch");
        }
    }
}
