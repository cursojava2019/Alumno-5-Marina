package es.indra.ejercicio4;

import java.util.ArrayList;

public class Ejercicio4main {

	public static void main(String[] args) {

		Television t1 = new Television((float) 300, (float) 10.0);
		Television t2 = new Television((float) 200.50, (float) 8.5);
		Television t3 = new Television((float) 100.50, (float) 10.0);
		Television t4 = new Television((float) 100.50, "NEGRO", 'A', (float) 8.5, 50, true);
		Television t5 = new Television((float) 100.50, "NEGRO", 'C', (float) 8.5, 50, true);

		Lavadora l1 = new Lavadora();
		Lavadora l2 = new Lavadora((float) 500, (float) 50);
		Lavadora l3 = new Lavadora((float) 500, "ROJO", 'A', (float) 50, (float) 10);

		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico((float) 100, (float) 20);

		Electrodomestico[] lista = new Electrodomestico[10];
		ArrayList<Electrodomestico> listaBuena = new ArrayList<Electrodomestico>();
		listaBuena.add(t1);
		listaBuena.add(t2);
		listaBuena.add(t3);
		listaBuena.add(t4);
		listaBuena.add(t5);
		listaBuena.add(l1);
		listaBuena.add(l2);
		listaBuena.add(l3);
		listaBuena.add(e1);
		listaBuena.add(e2);

		float totalTv = (float) 0;
		float totalLavadoras = (float) 0;
		float totalElectrodomesticos = (float) 0;
		for (Electrodomestico electrodomestico : listaBuena) {

			if (electrodomestico instanceof Television) {
				System.out.println("television: ");
				totalTv += electrodomestico.precioFinal();
			}
			if (electrodomestico instanceof Lavadora) {
				System.out.println("lavadora: ");
				totalLavadoras += electrodomestico.precioFinal();
			}

			if (electrodomestico instanceof Electrodomestico) {

				System.out.println("electrodomestico: ");
				totalLavadoras += electrodomestico.precioFinal();
			}
			System.out.println(electrodomestico.getClass().getName() + " : " + electrodomestico.precioFinal());
			totalElectrodomesticos += electrodomestico.precioFinal();
		}

		System.out.println("El total de las televisiones es: " + totalTv);
		System.out.println("El total de las televisiones es: " + totalLavadoras);
		System.out.println("El total de las televisiones es: " + totalElectrodomesticos);
	}
}
