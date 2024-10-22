# Star Wars Movie API

Este proyecto permite consultar información sobre las películas de Star Wars utilizando la API pública de SWAPI. El usuario puede ingresar el número de una película y obtener detalles como el título, el director, el productor y la fecha de lanzamiento. Además, los datos de la película se guardan en un archivo JSON.

## Requisitos

- JDK 11 o superior
- Dependencias de la biblioteca Gson (para la serialización JSON)

## Instalación

Clona este repositorio en tu máquina local usando el siguiente comando:

git clone https://github.com/MarceAquino/StarWardApi.git

Luego, navega al directorio del proyecto:

cd star-wars-movie-api

A continuación, compila el proyecto utilizando tu entorno de desarrollo favorito o desde la línea de comandos.

## Uso

Para ejecutar el programa, inicia la clase `Main`:

java Main

Cuando se te solicite, ingresa el número de la película de Star Wars que deseas consultar. Por ejemplo, para la primera película, ingresa `1`. Se mostrarán los detalles de la película en la consola y se guardará un archivo JSON con la información de la película en el mismo directorio.

## Ejemplo de Salida

Escriba el número de la película de Star Wars que quiere consultar: 1

Detalles de la Película:
-------------------------
Título: A New Hope
ID del episodio: 1
Apertura: It is a period of civil war. Rebel spaceships, striking from a hidden base, have won their first victory against the evil Galactic Empire.
Director: George Lucas
Productor: Gary Kurtz, George Lucas
Fecha de lanzamiento: 1977-05-25
-------------------------

La película se ha guardado en el archivo: A New Hope.json

## Contribución

Si deseas contribuir a este proyecto, sigue estos pasos: haz un fork del repositorio, crea una nueva rama para tu característica, realiza tus cambios y confirma tus cambios. Finalmente, sube tus cambios y abre un pull request para que se revisen.

## Contacto

Para preguntas o comentarios, por favor contacta a Marceloaquino1676@gmail.com.
