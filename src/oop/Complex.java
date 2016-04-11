package oop;

public class Complex {
	// Variables
	private double real;
	private double imag;
	
	// Constructors
	public Complex() {
		this.real = 0;
		this.imag = 0;
	}
	
	public Complex(double a) {
		this.real = a;
	}
	
	public Complex(double a, double b) {
		this.real = a;
		this.imag = b;
	}
	
	// Getters and setters
	public void setReal(double a) {
		this.real = a;
	}
	
	public double getReal() {
		return this.real;
	}
	
	public void setImag(double a) {
		this.imag = a;
	}
	
	public double getImag() {
		return this.imag;
	}
	
	// Methods
	public String toString() {
		return this.getReal() + " + " + this.getImag() + "i";
	}
	
	public void add(double a) {
		this.setReal(this.getReal() + a);
	}
	
	public void add(Complex a) {
		this.setReal(this.getReal() + a.getReal());
		this.setImag(this.getImag() + a.getImag());
	}
	
	public void multiply(double a) {
		this.setReal(this.getReal() * a);
		this.setImag(this.getImag() * a);
	}

	public void multiply(Complex a) {
		this.setReal((this.getReal() * a.getReal()) - (this.getImag() * a.getImag()));
		this.setImag((this.getReal() * a.getImag()) + (this.getImag() * a.getReal()));
	}
	
	public void square() {
		this.multiply(this);
	}
	
	public double norm() {
		double a = this.getReal();
		double b = this.getImag();
		return Math.sqrt(a*a + b*b);
	}
}
