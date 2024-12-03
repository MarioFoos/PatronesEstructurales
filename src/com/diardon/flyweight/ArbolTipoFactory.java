package com.diardon.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Fábrica de Flyweight: ArbolTipoFactory
 */
public class ArbolTipoFactory
{
	private static final Map<String, ArbolTipo> tipos = new HashMap<>();

	public static ArbolTipo getArbolTipo(String nombre, String color, String textura)
	{
		String clave = nombre + "-" + color + "-" + textura;
		if(!tipos.containsKey(clave))
		{
			tipos.put(clave, new ArbolTipo(nombre, color, textura));
			System.out.println("Creando un nuevo tipo de árbol: " + clave);
		}
		return tipos.get(clave);
	}
}
