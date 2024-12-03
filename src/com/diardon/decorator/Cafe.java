package com.diardon.decorator;

/**
 * Clase concreta: Caf� simple
 */
public class Cafe implements Bebida
{
	@Override
	public String getDescripcion()
	{
		return "Caf� simple";
	}
	@Override
	public double getCosto()
	{
		return 1.00;
	}
}
