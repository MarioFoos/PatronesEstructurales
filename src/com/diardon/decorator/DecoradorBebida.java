package com.diardon.decorator;

/**
 * Clase abstracta Decorador que implementa la interfaz Bebida
 */
public abstract class DecoradorBebida implements Bebida
{
	protected Bebida bebida;

	public DecoradorBebida(Bebida bebida)
	{
		this.bebida = bebida;
	}
	@Override
	public String getDescripcion()
	{
		return bebida.getDescripcion();
	}
	@Override
	public double getCosto()
	{
		return bebida.getCosto();
	}
}
