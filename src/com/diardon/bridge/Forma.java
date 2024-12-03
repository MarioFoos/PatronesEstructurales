package com.diardon.bridge;

/**
 * Clase abstracta: Forma
 */
public abstract class Forma
{
	protected DibujoAPI dibujoAPI;

	protected Forma(DibujoAPI dibujoAPI)
	{
		this.dibujoAPI = dibujoAPI;
	}
	public abstract void dibujar();
}
