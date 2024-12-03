package com.diardon.bridge;

/**
 * Clase concreta: Círculo
 */
public class Circulo extends Forma
{
	private double x, y, radio;

	public Circulo(double x, double y, double radio, DibujoAPI dibujoAPI)
	{
		super(dibujoAPI);
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	@Override
	public void dibujar()
	{
		dibujoAPI.dibujarCirculo(x, y, radio);
	}
}
