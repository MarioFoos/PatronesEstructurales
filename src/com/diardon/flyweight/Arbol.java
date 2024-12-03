package com.diardon.flyweight;

/**
 * Clase Contexto: Árbol
 */
public class Arbol
{
	private int x;
	private int y;
	private ArbolTipo tipo;

	public Arbol(int x, int y, ArbolTipo tipo)
	{
		this.x = x;
		this.y = y;
		this.tipo = tipo;
	}
	public void dibujar()
	{
		tipo.dibujar(x, y);
	}
}
