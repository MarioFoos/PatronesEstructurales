package com.diardon.decorator;

/**
 * Decorador concreto: Crema
 */
public class Crema extends DecoradorBebida
{
	public Crema(Bebida bebida)
	{
		super(bebida);
	}
	@Override
	public String getDescripcion()
	{
		return bebida.getDescripcion() + ", Crema";
	}
	@Override
	public double getCosto()
	{
		return bebida.getCosto() + 0.50;
	}
}
