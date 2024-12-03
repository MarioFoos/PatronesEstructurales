package com.diardon.composite;

import java.util.ArrayList;

/**
 * Clase compuesta: Carpeta
 */
public class Carpeta implements Elemento
{
	private String nombre;
	private ArrayList<Elemento> elementos = new ArrayList<>();

	public Carpeta(String nombre)
	{
		this.nombre = nombre;
	}
	/**
	 *  Método para agregar un elemento a la carpeta
	 * @param elemento
	 */
	public void agregarElemento(Elemento elemento)
	{
		elementos.add(elemento);
	}
	/**
	 *  Método para mostrar la carpeta y su contenido
	 */
	@Override
	public void mostrar()
	{
		System.out.println("Carpeta: " + nombre);
		for(Elemento elemento : elementos)
		{
			elemento.mostrar();
		}
	}
}
