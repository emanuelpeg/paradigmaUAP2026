package com.gugler;

public class Terreno implements Valorizable {

	private Double valor= 0.0;
	private String direccion = "";
	
	public Terreno(Double valor, String direccion) {
		this.valor = valor;
		this.direccion = direccion;
	}

	@Override
	public Double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return this.direccion;
	}
	
}
