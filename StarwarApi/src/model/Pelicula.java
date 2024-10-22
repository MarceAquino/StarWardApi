package model;

/**
 * Clase que representa una película.
 *
 * @param title          Título de la película.
 * @param episode_id     ID del episodio.
 * @param opening_crawl  Texto de apertura de la película.
 * @param director       Nombre del director.
 * @param producer       Nombre del productor.
 * @param release_date   Fecha de lanzamiento de la película.
 */
public record Pelicula(String title,
                       int episode_id,
                       String opening_crawl,
                       String director,
                       String producer,
                       String release_date) {
}