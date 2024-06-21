package org.generation;

public class Rombo implements figuraGeometrica{
	private String nombre;
	private double lado;
	private double DiagonalMayor;
	private double DiagonalMenor;
	
	public Rombo(String nombre, double lado, double DiagonalMayor, double DiagonalMenor) {
		this.nombre = nombre;
		this.lado = lado;
		this.DiagonalMayor = DiagonalMayor;
		this.DiagonalMenor = DiagonalMenor;
		
	}//constructor
	
	public double calcularArea() {
		return (DiagonalMayor*DiagonalMenor)/2;
	}//calculadoraArea
	
	public double calcularPerimetro() {
		return (lado+lado+lado+lado);
	}//calculadoraPerimetro
	
	public String getNombre() {
		return nombre;
	}//getName
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public double getDiagonalMayor() {
		return DiagonalMayor;
	}//DiagonalMayor
	public void getDiagonalMayor(double DiagonalMayor) {
		this.DiagonalMayor = DiagonalMayor;
	}//DiagonalMayor
	public double getDiagonalMenor() {
		return DiagonalMenor;
	}//DiagonalMenor
	public void getDiagonalMenor(double DiagonalMenor) {
		this.DiagonalMenor = DiagonalMenor;
	}//DiagonalMenor
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	@Override
	public String toString() {
		return "Rectangulo [nombre=" + nombre + ", DiagonalMayor=" + DiagonalMayor + ", DiagonalMenor=" + DiagonalMenor + ", lado=" + lado + "]";
	}

}//rombo
