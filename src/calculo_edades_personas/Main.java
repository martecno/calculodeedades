package calculo_edades_personas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String persona1;
		String persona2;
		String persona3;

		int edad1;
		int edad2;
		int edad3;

		int suma;

		double promedio = 0.0;
		double porcentaje1;
		double porcentaje2;
		double porcentaje3;

		System.out.println("Ingrese el nombre de la primera persona");
		persona1 = scan.nextLine();

		System.out.println("Ingrese el nombre de la segunda persona");
		persona2 = scan.nextLine();

		System.out.println("Ingrese el nombre de la tercera persona");
		persona3 = scan.nextLine();

		System.out.println("Ingrese la edad de la primera persona");
		edad1 = scan.nextInt();

		System.out.println("Ingrese la edad de la segunda persona");
		edad2 = scan.nextInt();

		System.out.println("Ingrese la edad de la tercera persona");
		edad3 = scan.nextInt();

		suma = edad1 + edad2 + edad3;
		promedio = suma / 3;
		porcentaje1 = (edad1 * 100) / suma;

		porcentaje2 = (edad2 * 100) / suma;

		porcentaje3 = (edad3 * 100) / suma;

		System.out.println("El promedio de edades es igual a " + promedio);
		System.out.println(persona1 + " tiene" + edad1 + " años " + "y el porcentaje que representa su edad es del "
				+ porcentaje1 + "%");
		System.out.println(persona2 + " tiene " + edad2 + " años " + "y el porcentaje que representa su edad es del "
				+ porcentaje2 + "%");
		System.out.println(persona3 + " tiene " + edad3 + " años " + "y el porcentaje que representa su edad es del "
				+ porcentaje3 + "%");

	}

}
