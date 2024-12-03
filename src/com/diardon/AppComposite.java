package com.diardon;

import com.diardon.composite.Archivo;
import com.diardon.composite.Carpeta;

/*
 * Explicación
 *  - Interfaz Elemento: Define el método mostrar() que se implementa tanto en las hojas (archivos) como en los componentes compuestos (carpetas).
 *  - Clase Archivo: Representa una hoja en el patrón Composite. Implementa mostrar() para mostrar el nombre del archivo.
 *  - Clase Carpeta: Representa un componente compuesto que puede contener otros elementos (archivos o subcarpetas). Implementa mostrar() para mostrar el contenido de la carpeta y los elementos que contiene.
 *  - Clase principal Main: Crea una estructura de carpetas y archivos y muestra cómo se puede manejar esta estructura de manera uniforme utilizando el método mostrar().
 */
/**
 * Clase principal para demostrar el uso del patrón Composite
 */
public class AppComposite
{
	public static void main(String[] args)
	{
		// Crear archivos individuales
		Archivo archivo1 = new Archivo("notas.txt");
		Archivo archivo2 = new Archivo("foto.jpg");
		Archivo archivo3 = new Archivo("viaje.mp4");

		// Crear una carpeta y agregarle archivos
		Carpeta carpeta1 = new Carpeta("Mis Documentos");
		carpeta1.agregarElemento(archivo1);
		carpeta1.agregarElemento(archivo2);

		// Crear una subcarpeta y agregarle un archivo
		Carpeta subcarpeta = new Carpeta("Videos");
		subcarpeta.agregarElemento(archivo3);

		// Agregar la subcarpeta a la carpeta principal
		carpeta1.agregarElemento(subcarpeta);

		// Mostrar la estructura completa
		carpeta1.mostrar();
	}
}
