package com.diardon;

import com.diardon.bridge.Circulo;
import com.diardon.bridge.DirectXAPI;
import com.diardon.bridge.Forma;
import com.diardon.bridge.OpenGLAPI;

/*
 * Explicaci�n
 *  - Interfaz DibujoAPI: Define la interfaz para las implementaciones de dibujo, en este caso, dibujarCirculo.
 *  - Implementaciones concretas OpenGLAPI y DirectXAPI: Proveen implementaciones espec�ficas del m�todo dibujarCirculo usando diferentes tecnolog�as de renderizado.
 *  - Clase abstracta Forma: Define la abstracci�n y contiene una referencia al DibujoAPI, que permite que las implementaciones var�en independientemente.
 *  - Clase concreta Circulo: Implementa la clase abstracta Forma y usa DibujoAPI para dibujar el c�rculo.
 *  - Clase principal Main: Demuestra c�mo se pueden crear objetos Circulo con diferentes implementaciones de dibujo.
 */
/**
 * Clase principal para demostrar el uso del patr�n Bridge
 */
public class AppBridge
{
	public static void main(String[] args)
	{
		// Crear un c�rculo usando OpenGL
		Forma circuloOpenGL = new Circulo(10, 20, 5, new OpenGLAPI());
		circuloOpenGL.dibujar();

		// Crear un c�rculo usando DirectX
		Forma circuloDirectX = new Circulo(15, 25, 10, new DirectXAPI());
		circuloDirectX.dibujar();
	}
}
