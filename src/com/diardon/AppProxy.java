package com.diardon;

import com.diardon.proxy.Imagen;
import com.diardon.proxy.ImagenProxy;

/*
 * Explicación
 *  - Interfaz Imagen: Define el método mostrar() que las clases ImagenReal y ImagenProxy implementan.
 *  - Clase ImagenReal: Representa la clase pesada que queremos manejar con el Proxy. Simula una operación costosa en el constructor, como la carga de una imagen desde el disco.
 *  - Clase ImagenProxy: Actúa como intermediario de ImagenReal. Solo carga la imagen real cuando se llama al método mostrar(). Después de la carga, el proxy delega las llamadas al objeto ImagenReal.
 *  - Clase principal Main: Demuestra cómo las imágenes proxy se pueden usar para controlar la carga diferida, optimizando así el rendimiento.
 */
/**
 * Clase principal para demostrar el uso del patrón Proxy
 */
public class AppProxy
{
	public static void main(String[] args)
	{
		// Crear imágenes proxy
		Imagen imagen1 = new ImagenProxy("foto1.jpg");
		Imagen imagen2 = new ImagenProxy("foto2.jpg");

		// Las imágenes no se cargan hasta que se necesitan mostrar
		System.out.println("Las imágenes aún no se han cargado.");

		// Mostrar las imágenes, lo que desencadena la carga
		imagen1.mostrar();
		imagen2.mostrar();

		// Mostrar las imágenes nuevamente, sin necesidad de recargarlas
		imagen1.mostrar();
		imagen2.mostrar();
	}
}
