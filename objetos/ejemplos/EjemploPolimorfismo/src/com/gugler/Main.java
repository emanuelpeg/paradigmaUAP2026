package com.gugler;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		
		// Construyo los Objetos
		Calendar cal = Calendar.getInstance();
		cal.set(1990, 02, 02);
		Edificio unEdificio  = new Edificio(150000.00, cal.getTime());
		Rodado unRodado = new Rodado(12000.00, 1000);
		Terreno unTerreno = new Terreno(600000.00, "Los colibies 234");
		
		
		List<Amortizable> list = new ArrayList<>();
		
		list.add(unEdificio);
		list.add(unRodado);
	    //list.add(unTerreno);
		
		System.out.println();
		System.out.println("Calcular Amortizacion");
		
		for (var amortizar : list) {
			System.out.println(amortizar.calcularAmortizacion());
		}
		
		List<Valorizable> list2 = new ArrayList<>();
		
		list2.add(unEdificio);
		list2.add(unRodado);
		list2.add(unTerreno);
		
		System.out.println();
		System.out.println("Imprimir el valor");
		
		for (var valorizar : list2) {
			System.out.println(valorizar.getValor());
		}

		//--------------------------------
		List<Object> list3 = new ArrayList<>();
		
		list3.add(unEdificio);
		list3.add(unRodado);
		list3.add(unTerreno);
		list3.add("Hola!");
		
		System.out.println();
		System.out.println("Hacer to String");
		
		for (var o2 : list3) {
			System.out.println(o2.toString());
		}


	}

}
