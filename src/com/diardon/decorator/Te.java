package com.diardon.decorator;

/**
 * Clase concreta: T� simple
 */
public class Te implements Bebida
{
	@Override
	public String getDescripcion()
	{
		return "T� simple";
	}
	@Override
	public double getCosto()
	{
		return 0.75;
	}
}