package edu.unlam.paradigmas.patrones.ej02;

public class TankModeSiegeState implements TankState {

	@Override
	public TankState moverse() {
		return new TankModeTankState();
	}

	@Override
	public TankState atacar() {
		return new TankModeSiegeState();
	}

}
