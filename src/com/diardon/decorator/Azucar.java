package com.diardon.decorator;

/**
 * Decorador concreto: Az�car
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
		return bebida.getDescripcion() + ", Az�car";
	}
	@Override
	public double getCosto()
	{
		return bebida.getCosto() + 0.10;
	}
}
