package com.diardon.composite;

/**
 * Clase hoja: Archivo
 */
public class Archivo implements Elemento
{
	private String nombre;

	public Archivo(String nombre)
	{
		this.nombre = nombre;
	}
	@Override
	public void mostrar()
	{
		System.out.println("Archivo: " + nombre);
	}
}
