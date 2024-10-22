import model.ConsultaApi;
import model.GeneradorDeArchivos;
import model.Pelicula;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un escáner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);
        ConsultaApi consulta = new ConsultaApi();

        // Solicitar al usuario que ingrese el número de la película
        System.out.print("Escriba el número de la película de Star Wars que quiere consultar: ");

        try {
            // Leer el número de la película ingresado por el usuario
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());

            // Buscar la película a través de la API
            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);

            // Imprimir información de la película de forma formateada
            System.out.println("\nDetalles de la Película:");
            System.out.println("-------------------------");
            System.out.println("Título: " + pelicula.title());
            System.out.println("ID del episodio: " + pelicula.episode_id());
            System.out.println("Apertura: " + pelicula.opening_crawl());
            System.out.println("Director: " + pelicula.director());
            System.out.println("Productor: " + pelicula.producer());
            System.out.println("Fecha de lanzamiento: " + pelicula.release_date());
            System.out.println("-------------------------\n");

            // Guardar la película en un archivo JSON
            GeneradorDeArchivos generador = new GeneradorDeArchivos();
            generador.guardarJson(pelicula);
            System.out.println("La película se ha guardado en el archivo: " + pelicula.title() + ".json");
        } catch (NumberFormatException e) {
            // Manejo de excepción si el número no es válido
            System.out.println("Número no válido: " + e.getMessage());
        } catch (RuntimeException | IOException e) {
            // Manejo de excepciones en caso de errores en la consulta o en el archivo
            System.out.println("Error: " + e.getMessage());
            System.out.println("Programa finalizado.");
        } finally {
            // Cerrar el escáner
            lectura.close();
        }
    }
}