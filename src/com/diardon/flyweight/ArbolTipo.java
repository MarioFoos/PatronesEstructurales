package com.diardon.flyweight;

/**
 * Clase Flyweight: ÁrbolTipo
 */
public class ArbolTipo
{
	private String nombre;
	private String color;
	private String textura;

	public ArbolTipo(String nombre, String color, String textura)
	{
		this.nombre = nombre;
		this.color = color;
		this.textura = textura;
	}
	public void dibujar(int x, int y)
	{
		System.out.println("Dibujando un árbol de tipo: " + nombre + " en (" + x + ", " + y + ") con color " + color
				+ " y textura " + textura);
	}
}
