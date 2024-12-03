package com.diardon.facade;

/**
 * Subsistema: Sistema de sonido
 */
public class SistemaSonido
{
	public void encender()
	{
		System.out.println("Sistema de sonido encendido.");
	}
	public void configurarSurround()
	{
		System.out.println("Configuración de sonido surround completada.");
	}
	public void ajustarVolumen(int nivel)
	{
		System.out.println("Volumen ajustado a " + nivel);
	}
	public void apagar()
	{
		System.out.println("Sistema de sonido apagado.");
	}
}
