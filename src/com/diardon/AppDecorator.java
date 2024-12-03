package com.diardon;

import com.diardon.decorator.Azucar;
import com.diardon.decorator.Bebida;
import com.diardon.decorator.Cafe;
import com.diardon.decorator.Crema;
import com.diardon.decorator.Leche;
import com.diardon.decorator.Te;

/*
 * Explicación
 *  - Interfaz Bebida: Define los métodos getDescripcion() y getCosto() que todas las bebidas deben implementar.
 *  - Clases concretas Cafe y Te: Implementan la interfaz Bebida y proporcionan descripciones y costos básicos.
 *  - Clase abstracta DecoradorBebida: Implementa Bebida y contiene una referencia a un objeto Bebida. Se utiliza como base para todos los decoradores concretos.
 *  - Clases Leche, Azucar y Crema: Extienden DecoradorBebida y agregan funcionalidad adicional, como actualizar la descripción y el costo de la bebida.
 *  - Clase principal Main: Muestra cómo se pueden decorar las bebidas de manera flexible y dinámica.
 */
/**
 * Clase principal para demostrar el uso del patrón Decorator
 */
public class AppDecorator
{
	public static void main(String[] args)
	{
		// Crear un café simple
		Bebida cafe = new Cafe();
		System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());

		// Agregar leche al café
		cafe = new Leche(cafe);
		System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());

		// Agregar azúcar al café con leche
		cafe = new Azucar(cafe);
		System.out.println(cafe.getDescripcion() + " $" + cafe.getCosto());

		// Crear un té simple con crema y azúcar
		Bebida te = new Te();
		te = new Crema(te);
		te = new Azucar(te);
		System.out.println(te.getDescripcion() + " $" + te.getCosto());
	}
}
