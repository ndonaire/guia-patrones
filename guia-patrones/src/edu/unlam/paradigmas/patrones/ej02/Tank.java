package edu.unlam.paradigmas.patrones.ej02;

public class Tank {
	
	private TankState estado;

	public Tank(TankState estado) {
		super();
		this.estado = new TankModeTankState();
	}

	public TankState getEstado() {
		return estado;
	}

	public void setEstado(TankState estado) {
		this.estado = estado;
	}
	
	

	
	
	
}
