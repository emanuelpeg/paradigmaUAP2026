package com.gugler;

public class Rodado implements Amortizable, Valorizable{
	
	private static final Double VALOR_AMORTIZACION = 0.2;
	private Double valor;
	private Integer kms;

	public Rodado(Double valorInicial, Integer kms) {
		this.valor = valorInicial;
		this.kms = kms;
	}

	public Double getValor() {
		return valor;
	}

	public Double calcularAmortizacion() {
		Double amotizacion = 0.0;
		if (valor > 0.0) {
			amotizacion = (VALOR_AMORTIZACION * kms.doubleValue())/100; 
			valor = valor - amotizacion;
		}
		return amotizacion;
	}
	
	@Override
	public String toString() {
		return "rodado " + this.valor;
	}

}
