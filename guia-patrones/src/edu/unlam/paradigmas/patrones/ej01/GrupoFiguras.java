package edu.unlam.paradigmas.patrones.ej01;

import java.util.ArrayList;
import java.util.List;

public class GrupoFiguras implements FiguraGeometrica{

	List <FiguraGeometrica> componentes = new ArrayList<>();
	
	
	public void agregarFigura(FiguraGeometrica figura) {
		this.componentes.add(figura);
	}
	
	@Override
	public void pintar(String color) {
		for(FiguraGeometrica figura: componentes) {
			figura.pintar(color);
		}
	}
	
	@Override
	public double getMedida(){
		double total = 0;
		for(FiguraGeometrica figura: componentes) {
			total += figura.getMedida();
		}
		return total;
	}
	
	@Override
	public String toString() {
		return "GrupoFiguras [" + componentes + "]";
	}
	

}
