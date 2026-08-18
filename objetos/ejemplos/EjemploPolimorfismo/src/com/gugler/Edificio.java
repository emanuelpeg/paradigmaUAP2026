package com.gugler;

import java.util.Calendar;
import java.util.Date;

public class Edificio implements Valorizable, Amortizable {

	private Double valor;
	private Date fechaDeCreacion; 
	
	public Edificio(Double valorInicial, Date fechaDeCreacion) {
		this.valor = valorInicial;
		this.fechaDeCreacion = fechaDeCreacion;
	}

	@Override
	public Double calcularAmortizacion() {
		Calendar cal = Calendar.getInstance();
		int actualYear =cal.get(Calendar.YEAR);
		cal.setTime(fechaDeCreacion);
		int year =cal.get(Calendar.YEAR);
		int diferencia = actualYear - year;
		Double amortizacion = (diferencia * valor) / 300;
		this.valor = this.valor - amortizacion;
		return amortizacion;
	}

	@Override
	public Double getValor() {
		return this.valor;
	}
	
	@Override
	public String toString() {
		return "inmueble " + this.valor;
	}

}
