package model;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Clase encargada de realizar consultas a la API de películas.
 */
public class ConsultaApi {

    /**
     * Busca una película según el número de episodio.
     *
     * @param numeroDePelicula El número de la película a buscar.
     * @return La película encontrada.
     * @throws RuntimeException Si no se encuentra la película.
     */
    public Pelicula buscaPelicula(int numeroDePelicula) {
        URI direccion = URI.create("https://swapi.py4e.com/api/films/" + numeroDePelicula + "/");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Pelicula.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró esa película. Verifique el número ingresado.");
        }
    }
}