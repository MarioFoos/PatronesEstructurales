package com.diardon;

import com.diardon.facade.Proyector;
import com.diardon.facade.ReproductorDVD;
import com.diardon.facade.SistemaDeEntretenimientoFacade;
import com.diardon.facade.SistemaSonido;

/*
 * Explicación
 * - Clases de Subsistema (ReproductorDVD, SistemaSonido, Proyector): Estas clases representan los componentes individuales y contienen métodos para realizar tareas específicas.
 * - Clase SistemaDeEntretenimientoFacade: Proporciona una interfaz simplificada para interactuar con el sistema de entretenimiento. Encapsula la complejidad de los componentes y proporciona métodos convenientes (iniciarPelicula y apagarSistema) para realizar operaciones comunes.
 * - Clase principal Main: Muestra cómo la clase Facade se usa para simplificar la interacción con los componentes complejos.
 */
/**
 * Clase principal para demostrar el uso del patrón Facade
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
		sistemaFacade.iniciarPelicula("El Señor de los Anillos");
		System.out.println();
		sistemaFacade.apagarSistema();
	}
}
