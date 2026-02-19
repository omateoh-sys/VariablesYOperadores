package VariablesYOperadores;

import java.util.Scanner;

/**
 * Programa de manejo de variables, operadores y estructuras de control.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// --- 1. Declaración y Uso de Variables ---
		System.out.println("---  Variables y Operadores ---");
		System.out.print("Ingresa un número entero (int): ");
		int entero = sc.nextInt();

		System.out.print("Ingresa un número decimal (double): ");
		double decimal = sc.nextDouble();

		sc.nextLine(); // Limpiar buffer
		System.out.print("Ingresa una palabra (String): ");
		String texto = sc.nextLine();

		System.out.print("¿Es verdad? (true/false): ");
		boolean esVerdad = sc.nextBoolean();

		System.out.println(
				"Valores: Int = " + entero + ", Double = " + decimal + ", String = " + texto + ", Boolean = " + esVerdad);

		// --- 2. Operaciones Matemáticas ---
		System.out.println("\n---  OPERACIONES MATEMÁTICAS ---");
		System.out.print("Ingresa primer número entero: ");
		int n1 = sc.nextInt();
		System.out.print("Ingresa segundo número entero: ");
		int n2 = sc.nextInt();

		System.out.println("Suma: " + (n1 + n2));
		System.out.println("Resta: " + (n1 - n2));
		System.out.println("Multiplicación: " + (n1 * n2));
		// Nota: Si n2 es 0, lanzará error. En enteros, la división trunca decimales.
		if (n2 != 0) {
			System.out.println("División Entera: " + (n1 / n2));
		}

		// --- Operaciones Lógicas ---
		System.out.println("\n---  OPERACIONES LÓGICAS ---");
		System.out.println("¿n1 > n2?: " + (n1 > n2));
		System.out.println("¿n1 == n2?: " + (n1 == n2));
		System.out.println("¿Ambos son positivos? (AND): " + (n1 > 0 && n2 > 0));
		System.out.println("¿Al menos uno es negativo? (OR): " + (n1 < 0 || n2 < 0));

		// ---  Clasificación de Edad ---
		System.out.println("\n---  CLASIFICACIÓN DE EDAD ---");
		System.out.print("Ingresa tu edad: ");
		int edad = sc.nextInt();

		if (edad < 12) {
			System.out.println("Clasificación: Niño");
		} else if (edad >= 12 && edad <= 17) {
			System.out.println("Clasificación: Adolescente");
		} else if (edad >= 18 && edad <= 59) {
			System.out.println("Clasificación: Adulto");
		} else {
			System.out.println("Clasificación: Adulto mayor");
		}

		// ---  Día de la Semana ---
		System.out.println("\n---  DÍA DE LA SEMANA ---");
		System.out.print("Ingresa un número del 1 al 7: ");
		int dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miércoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Día no válido");
		}

		// ---  Verificación de Acceso ---
		System.out.println("\n---  VERIFICACIÓN DE ACCESO ---");
		String usuarioDB = "admin";
		String passDB = "admin";

		System.out.print("Usuario: ");
		String userIn = sc.next();
		System.out.print("Contraseña: ");
		String passIn = sc.next();

		if (userIn.equals(usuarioDB)) {
			if (passIn.equals(passDB)) {
				System.out.println("Acceso concedido");
			} else {
				System.out.println("Contraseña incorrecta");
			}
		} else {
			System.out.println("Usuario no registrado");
		}

		sc.close();
	}
}
