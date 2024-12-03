package com.diardon.decorator;

/**
 * Clase concreta: Té simple
 */
public class Te implements Bebida
{
	@Override
	public String getDescripcion()
	{
		return "Té simple";
	}
	@Override
	public double getCosto()
	{
		return 0.75;
	}
}