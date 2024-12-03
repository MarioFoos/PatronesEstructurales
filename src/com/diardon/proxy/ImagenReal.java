package com.diardon.proxy;

/**
 * Clase Real: Imagen Real
 */
public class ImagenReal implements Imagen
{
	private String nombreArchivo;

	public ImagenReal(String nombreArchivo)
	{
		this.nombreArchivo = nombreArchivo;
		cargarDesdeDisco(); // Simula una carga pesada de la imagen
	}
	private void cargarDesdeDisco()
	{
		System.out.println("Cargando " + nombreArchivo + " desde el disco...");
	}
	@Override
	public void mostrar()
	{
		System.out.println("Mostrando " + nombreArchivo);
	}
}
