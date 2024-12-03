package com.diardon.decorator;

/**
 * Clase concreta: Café simple
 */
public class Cafe implements Bebida
{
	@Override
	public String getDescripcion()
	{
		return "Café simple";
	}
	@Override
	public double getCosto()
	{
		return 1.00;
	}
}
