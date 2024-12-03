package com.diardon;

import com.diardon.flyweight.Arbol;
import com.diardon.flyweight.ArbolTipo;
import com.diardon.flyweight.ArbolTipoFactory;

/*
 * Explicaci�n
 * - Clase ArbolTipo: Representa el objeto Flyweight que contiene datos compartidos entre m�ltiples instancias de �rbol. Incluye informaci�n como nombre, color, y textura.
 * - Clase ArbolTipoFactory: Act�a como una f�brica que gestiona los objetos ArbolTipo. Si un objeto ArbolTipo ya existe, lo reutiliza; de lo contrario, crea uno nuevo.
 * - Clase Arbol: Representa los objetos contextuales que tienen datos �nicos, como la posici�n (x, y). Usa ArbolTipo para compartir los datos comunes.
 * - Clase principal Main: Demuestra c�mo crear m�ltiples �rboles que comparten los mismos datos ArbolTipo para optimizar el uso de memoria.
 */
/**
 * Clase principal para demostrar el uso del patr�n Flyweight
 */
public class AppFlyweight
{
	public static void main(String[] args)
	{
		// Crear varios �rboles usando la f�brica de Flyweight
		ArbolTipo pinoVerde = ArbolTipoFactory.getArbolTipo("Pino", "Verde", "Textura rugosa");
		ArbolTipo pinoVerde2 = ArbolTipoFactory.getArbolTipo("Pino", "Verde", "Textura rugosa");
		ArbolTipo abetoRojo = ArbolTipoFactory.getArbolTipo("Abeto", "Rojo", "Textura suave");

		// Crear instancias de �rbol con diferentes posiciones
		Arbol arbol1 = new Arbol(10, 20, pinoVerde);
		Arbol arbol2 = new Arbol(30, 40, pinoVerde2); // Usa el mismo Flyweight que pinoVerde
		Arbol arbol3 = new Arbol(50, 60, abetoRojo);

		// Dibujar los �rboles
		arbol1.dibujar();
		arbol2.dibujar();
		arbol3.dibujar();
	}
}
