package com.diardon;

import com.diardon.bridge.Circulo;
import com.diardon.bridge.DirectXAPI;
import com.diardon.bridge.Forma;
import com.diardon.bridge.OpenGLAPI;

/*
 * Explicación
 *  - Interfaz DibujoAPI: Define la interfaz para las implementaciones de dibujo, en este caso, dibujarCirculo.
 *  - Implementaciones concretas OpenGLAPI y DirectXAPI: Proveen implementaciones específicas del método dibujarCirculo usando diferentes tecnologías de renderizado.
 *  - Clase abstracta Forma: Define la abstracción y contiene una referencia al DibujoAPI, que permite que las implementaciones varíen independientemente.
 *  - Clase concreta Circulo: Implementa la clase abstracta Forma y usa DibujoAPI para dibujar el círculo.
 *  - Clase principal Main: Demuestra cómo se pueden crear objetos Circulo con diferentes implementaciones de dibujo.
 */
/**
 * Clase principal para demostrar el uso del patrón Bridge
 */
public class AppBridge
{
	public static void main(String[] args)
	{
		// Crear un círculo usando OpenGL
		Forma circuloOpenGL = new Circulo(10, 20, 5, new OpenGLAPI());
		circuloOpenGL.dibujar();

		// Crear un círculo usando DirectX
		Forma circuloDirectX = new Circulo(15, 25, 10, new DirectXAPI());
		circuloDirectX.dibujar();
	}
}
