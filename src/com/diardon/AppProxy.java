package com.diardon;

import com.diardon.proxy.Imagen;
import com.diardon.proxy.ImagenProxy;

/*
 * Explicaci�n
 *  - Interfaz Imagen: Define el m�todo mostrar() que las clases ImagenReal y ImagenProxy implementan.
 *  - Clase ImagenReal: Representa la clase pesada que queremos manejar con el Proxy. Simula una operaci�n costosa en el constructor, como la carga de una imagen desde el disco.
 *  - Clase ImagenProxy: Act�a como intermediario de ImagenReal. Solo carga la imagen real cuando se llama al m�todo mostrar(). Despu�s de la carga, el proxy delega las llamadas al objeto ImagenReal.
 *  - Clase principal Main: Demuestra c�mo las im�genes proxy se pueden usar para controlar la carga diferida, optimizando as� el rendimiento.
 */
/**
 * Clase principal para demostrar el uso del patr�n Proxy
 */
public class AppProxy
{
	public static void main(String[] args)
	{
		// Crear im�genes proxy
		Imagen imagen1 = new ImagenProxy("foto1.jpg");
		Imagen imagen2 = new ImagenProxy("foto2.jpg");

		// Las im�genes no se cargan hasta que se necesitan mostrar
		System.out.println("Las im�genes a�n no se han cargado.");

		// Mostrar las im�genes, lo que desencadena la carga
		imagen1.mostrar();
		imagen2.mostrar();

		// Mostrar las im�genes nuevamente, sin necesidad de recargarlas
		imagen1.mostrar();
		imagen2.mostrar();
	}
}
