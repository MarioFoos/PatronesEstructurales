package com.diardon.bridge;

/**
 * Implementación concreta: OpenGL
 */
public class OpenGLAPI implements DibujoAPI
{
	@Override
	public void dibujarCirculo(double x, double y, double radio)
	{
		System.out.println("Dibujando un círculo con OpenGL en (" + x + ", " + y + ") con radio " + radio);
	}
}
