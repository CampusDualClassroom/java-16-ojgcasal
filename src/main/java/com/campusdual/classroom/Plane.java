package com.campusdual.classroom;

public class Plane implements IMachine {
	protected String name;

	public Plane(String name) {
		this.name = name;
	}

	@Override
	public void start() {
		System.out.println("El avión " + name + " está encendido.");
	}

	@Override
	public void stop() {
		System.out.println("El avión " + name + " está apagado.");
	}

	@Override
	public void maintenance() {
		System.out.println("El avión " + name + " está en mantenimiento.");
	}

	public void fly() {
		System.out.println("El avión está volando.");
	}
}
