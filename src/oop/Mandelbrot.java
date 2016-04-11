package oop;

import java.awt.Color;

public class Mandelbrot {
	public int repetitions(Complex c, int max) {
		Complex d = new Complex();
		int i;
		for(i = 0; d.norm() < 2 && i < max; i++) {
			d.square();
			d.add(c);
		}
		return i;
	}
	
	public Color colorAt(double x, double y) {
		final boolean greyscale = false;
		
		Complex c = new Complex(x, y);
		// GreyScale
		if(greyscale) {
			int a = this.repetitions(c, 50) * 5;
			return new Color(a, a, a);
		} else {
			double q = this.repetitions(c, 50) / 50.0;
			int r = (int)(255 * Math.max(Math.min(3 * q - 1, 3 - 3 * q), 0));
			int g = (int)(255 * Math.max(1 - 3 * q, 0));
			int b = (int)(255 * Math.max(Math.min(3 * q, 2 - 3 * q), 0));
			return new Color(r, g, b);
		}
		
	}
}
