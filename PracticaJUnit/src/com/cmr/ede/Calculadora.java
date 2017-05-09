package com.cmr.ede;

public class Calculadora {

	public Calculadora() {
	}

	public double sumar(double operador1, double operador2) {
		return operador1 + operador2;
	}

	public double restar(double operador1, double operador2) {
		return operador1 - operador2;
	}

	public double multiplicar(double operador1, double operador2) {
		return operador1 * operador2;
	}

	public double dividir(double operador1, double operador2) {
		return operador1 / operador2;
	}

	public double potecnia(double operador1, double operador2) {
		return Math.pow(operador1, operador2);
	}
}
