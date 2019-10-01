
import java.util.Scanner;

public class Trapezoid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a top: ");
		double trapTop = in.nextDouble();
		in.nextLine();
		System.out.print("Enter a bottom: ");
		double trapBottom = in.nextDouble();
		in.nextLine();
		System.out.print("Enter a height: ");
		double trapHeight = in.nextDouble();
		in.nextLine();

		double trapArea = (trapTop + trapBottom) / 2;
		trapArea *= trapHeight;

		System.out.print("The area of the trapezoid is ");
		System.out.printf("%.1f", trapArea);
		System.out.print(".");

		in.close();
	}

}
