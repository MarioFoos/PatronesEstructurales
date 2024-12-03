package com.diardon.facade;

/**
 * Subsistema: Reproductor de DVD
 */
public class ReproductorDVD
{
	public void encender()
	{
		System.out.println("Reproductor de DVD encendido.");
	}
	public void reproducirPelicula(String pelicula)
	{
		System.out.println("Reproduciendo la película: " + pelicula);
	}
	public void apagar()
	{
		System.out.println("Reproductor de DVD apagado.");
	}
}
