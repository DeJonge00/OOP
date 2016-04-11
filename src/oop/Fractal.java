package oop;

public class Fractal {
	public static void main (String[] argv) {
		Mandelbrot mb = new Mandelbrot();
		FractalWindow fw = new FractalWindow(mb);
	}
}
