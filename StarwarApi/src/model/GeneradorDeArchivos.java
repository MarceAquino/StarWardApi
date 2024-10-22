package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase encargada de la generación de archivos en formato JSON.
 */
public class GeneradorDeArchivos {
    /**
     * Guarda una película en un archivo JSON.
     *
     * @param pelicula La película a guardar.
     * @throws IOException Si ocurre un error al escribir en el archivo.
     */
    public void guardarJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // Usar try-with-resources para asegurar que el archivo se cierra adecuadamente
        try (FileWriter escritura = new FileWriter(pelicula.title() + ".json")) {
            escritura.write(gson.toJson(pelicula));
        }
    }
}