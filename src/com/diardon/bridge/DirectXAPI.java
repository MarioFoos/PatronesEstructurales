package com.diardon.bridge;

/**
 * Implementaci�n concreta: DirectX
 */
public class DirectXAPI implements DibujoAPI
{
	@Override
	public void dibujarCirculo(double x, double y, double radio)
	{
		System.out.println("Dibujando un c�rculo con DirectX en (" + x + ", " + y + ") con radio " + radio);
	}
}
