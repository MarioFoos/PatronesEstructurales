package com.diardon.bridge;

/**
 * Implementaci�n concreta: OpenGL
 */
public class OpenGLAPI implements DibujoAPI
{
	@Override
	public void dibujarCirculo(double x, double y, double radio)
	{
		System.out.println("Dibujando un c�rculo con OpenGL en (" + x + ", " + y + ") con radio " + radio);
	}
}
