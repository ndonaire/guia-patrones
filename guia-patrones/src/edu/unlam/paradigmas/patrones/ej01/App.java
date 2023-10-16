package edu.unlam.paradigmas.patrones.ej01;

import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/// Valor estatico medida pomo
		double medidaPomo = 100;

		/// Crear mapas con totales de medidas
		HashMap<String, GrupoFiguras> gruposColores = new HashMap<>();

		/// Crear grupos de figuras

		// GRUPO 1
		Figura fig1 = new Figura(20);
		Figura fig2 = new Figura(50);
		Figura fig3 = new Figura(30);
		Figura fig4 = new Figura(45);
		Figura fig5 = new Figura(23);

		GrupoFiguras grupo1 = new GrupoFiguras();
		grupo1.agregarFigura(fig1);
		grupo1.agregarFigura(fig2);
		grupo1.agregarFigura(fig3);
		grupo1.agregarFigura(fig4);
		grupo1.agregarFigura(fig5);

		System.out.println("cm2 totales de color" + grupo1.getMedida());

		grupo1.pintar("Rojo");
		gruposColores.put("Rojo", grupo1);

		/// Crear grupos de figuras

		// GRUPO 1
		Figura fig11 = new Figura(10);
		Figura fig22 = new Figura(40);
		Figura fig33 = new Figura(70);
		Figura fig44 = new Figura(85);
		Figura fig55 = new Figura(95);

		GrupoFiguras grupo2 = new GrupoFiguras();
		grupo2.agregarFigura(fig11);
		grupo2.agregarFigura(fig22);
		grupo2.agregarFigura(fig33);
		grupo2.agregarFigura(fig44);
		grupo2.agregarFigura(fig55);

		System.out.println("cm2 totales de color" + grupo2.getMedida());

		grupo2.pintar("Azul");
		gruposColores.put("Azul", grupo2);

		/// Mostrar total de pomos

		System.out.println("Total de pomos para comprar");
		for (String clave : gruposColores.keySet()) {
			GrupoFiguras valor = gruposColores.get(clave);
			System.out.println("Cantidad Pomos color " + clave + ": " + Math.round(valor.getMedida() / medidaPomo));
		}

	}

}
