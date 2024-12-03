package com.diardon;

import com.diardon.decorator.Azucar;
import com.diardon.decorator.Bebida;
import com.diardon.decorator.Cafe;
import com.diardon.decorator.Crema;
import com.diardon.decorator.Leche;
import com.diardon.decorator.Te;

/*
 * Explicaci�n
 *  - Interfaz Bebida: Define los m�todos getDescripcion() y getCosto() que todas las bebidas deben implementar.
 *  - Clases concretas Cafe y Te: Implementan la interfaz Bebida y proporcionan descripciones y costos b�sicos.
 *  - Clase abstracta DecoradorBebida: Implementa Bebida y contiene una referencia a un objeto Bebida. Se utiliza como base para todos los decoradores concretos.
 *  - Clases Leche, Azucar y Crema: Extienden DecoradorBebida y agregan funcionalidad adicional, como actualizar la descripci�n y el costo de la bebida.
 *  - Clase principal Main: Muestra c�mo se pueden decorar las bebidas de manera flexible y din�mica.
 */
/**
 * Clase principal para demostrar el uso del patr�n Decorator
 */
public class AppDecorator
{
	public static void main(String[] args)
	{
		// Crear un caf� simple
		Bebida cafe = new Cafe();
		System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());

		// Agregar leche al caf�
		cafe = new Leche(cafe);
		System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());

		// Agregar az�car al caf� con leche
		cafe = new Azucar(cafe);
		System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());

		// Crear un t� simple con crema y az�car
		Bebida te = new Te();
		te = new Crema(te);
		te = new Azucar(te);
		System.out.println(te.getDescripcion() + " $" + te.getCosto());
	}
}
