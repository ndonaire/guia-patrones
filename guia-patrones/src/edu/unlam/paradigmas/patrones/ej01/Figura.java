package edu.unlam.paradigmas.patrones.ej01;

public class Figura implements FiguraGeometrica {

	String color;
	double medida;

	public Figura(double medida) {
		super();
		this.medida = medida;
	}

	public double getMedida() {
		return medida;
	}

	public String getColor() {
		return color;
	}
	
	public void pintar(String color) {
		this.color = color;
	}

}
