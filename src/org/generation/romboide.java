package org.generation;

public class romboide implements figuraGeometrica{
	private String nombre;
	private double base;
	private double altura;
	public romboide(String nombre, double base, double altura) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}//constructor
	
	public double calcularArea() {
		return (base*altura);
	}//calculadoraArea
	
	public double calcularPerimetro() {
		return (base+base+altura+altura);
	}//calculadoraPerimetro
	
	public String getNombre() {
		return nombre;
	}//getName
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public double getBase() {
		return base;
	}//getBase
	public void setBase(double base) {
		this.base = base;
	}//setBase
	public double getAltura() {
		return altura;
	}//getAltura
	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura
	@Override
	public String toString() {
		return "romboide [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
	}
	

}//romboide
