package com.diardon.facade;

/**
 * Clase Facade: Sistema de Entretenimiento
 */
public class SistemaDeEntretenimientoFacade
{
	private ReproductorDVD reproductorDVD;
	private SistemaSonido sistemaSonido;
	private Proyector proyector;

	public SistemaDeEntretenimientoFacade(ReproductorDVD reproductorDVD,
			SistemaSonido sistemaSonido, Proyector proyector)
	{
		this.reproductorDVD = reproductorDVD;
		this.sistemaSonido = sistemaSonido;
		this.proyector = proyector;
	}
	// M�todo para iniciar una pel�cula
	public void iniciarPelicula(String pelicula)
	{
		System.out.println("Preparando para reproducir la pel�cula...");
		proyector.encender();
		proyector.configurarResolucionHD();
		sistemaSonido.encender();
		sistemaSonido.configurarSurround();
		sistemaSonido.ajustarVolumen(10);
		reproductorDVD.encender();
		reproductorDVD.reproducirPelicula(pelicula);
		System.out.println("�Disfruta de la pel�cula!");
	}
	// M�todo para apagar el sistema
	public void apagarSistema()
	{
		System.out.println("Apagando el sistema...");
		reproductorDVD.apagar();
		sistemaSonido.apagar();
		proyector.apagar();
	}
}
