package com.diardon.decorator;

/**
 * Decorador concreto: Azúcar
 */
public class Azucar extends DecoradorBebida
{
	public Azucar(Bebida bebida)
	{
		super(bebida);
	}
	@Override
	public String getDescripcion()
	{
		return bebida.getDescripcion() + ", Azúcar";
	}
	@Override
	public double getCosto()
	{
		return bebida.getCosto() + 0.10;
	}
}
