package runner;

import triangle.Triangle;

public class Main {


	public static void main(String[] args) {

		Triangle tr = new Triangle(0, -12.5, -20.54);
		System.out.println(tr.detectTriangle());
		System.out.println(tr.getSquare());


	}

}
