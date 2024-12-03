package com.diardon.bridge;

/**
 * Implementación concreta: DirectX
 */
public class DirectXAPI implements DibujoAPI
{
	@Override
	public void dibujarCirculo(double x, double y, double radio)
	{
		System.out.println("Dibujando un círculo con DirectX en (" + x + ", " + y + ") con radio " + radio);
	}
}
