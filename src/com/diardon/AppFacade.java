package com.diardon;

import com.diardon.facade.Proyector;
import com.diardon.facade.ReproductorDVD;
import com.diardon.facade.SistemaDeEntretenimientoFacade;
import com.diardon.facade.SistemaSonido;

/*
 * Explicaci�n
 * - Clases de Subsistema (ReproductorDVD, SistemaSonido, Proyector): Estas clases representan los componentes individuales y contienen m�todos para realizar tareas espec�ficas.
 * - Clase SistemaDeEntretenimientoFacade: Proporciona una interfaz simplificada para interactuar con el sistema de entretenimiento. Encapsula la complejidad de los componentes y proporciona m�todos convenientes (iniciarPelicula y apagarSistema) para realizar operaciones comunes.
 * - Clase principal Main: Muestra c�mo la clase Facade se usa para simplificar la interacci�n con los componentes complejos.
 */
/**
 * Clase principal para demostrar el uso del patr�n Facade
 */
public class AppFacade
{
	public static void main(String[] args)
	{
		// Crear los componentes del subsistema
		ReproductorDVD dvd = new ReproductorDVD();
		SistemaSonido sonido = new SistemaSonido();
		Proyector proyector = new Proyector();

		// Crear la fachada
		SistemaDeEntretenimientoFacade sistemaFacade = new SistemaDeEntretenimientoFacade(dvd, sonido, proyector);

		// Usar la fachada para simplificar las operaciones
		sistemaFacade.iniciarPelicula("El Se�or de los Anillos");
		System.out.println();
		sistemaFacade.apagarSistema();
	}
}
