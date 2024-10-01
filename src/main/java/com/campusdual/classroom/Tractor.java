package com.campusdual.classroom;

public class Tractor implements IMachine {
	protected int horsePower;

	public Tractor(int hp) {
		this.horsePower = hp;
	}

	@Override
	public void start() {
		System.out.println("El tractor con " + horsePower + " caballos de fuerza está encendido.");
	}

	@Override
	public void stop() {
		System.out.println("El tractor con " + horsePower + " caballos de fuerza está apagado.");
	}

	@Override
	public void maintenance() {
		System.out.println("El tractor con " + horsePower + " caballos de fuerza está en mantenimiento.");
	}

	public void forward() {
		System.out.println("El tractor avanza.");
	}

}
