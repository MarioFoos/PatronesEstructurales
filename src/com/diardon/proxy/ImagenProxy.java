package com.diardon.proxy;

/**
 * Clase Proxy: Imagen Proxy
 */
public class ImagenProxy implements Imagen
{
	private String nombreArchivo;
	private ImagenReal imagenReal;

	public ImagenProxy(String nombreArchivo)
	{
		this.nombreArchivo = nombreArchivo;
	}
	@Override
	public void mostrar()
	{
		if(imagenReal == null)
		{
			// Cargar la imagen real solo cuando se necesite mostrarla
			imagenReal = new ImagenReal(nombreArchivo);
		}
		imagenReal.mostrar();
	}
}
