package Bai4;

import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập các giá trị của phương trình bậc 2: ax^2 + bx + c");
		System.out.print("Nhập a:");
		double a = scanner.nextDouble();
		System.out.print("Nhập b:");
		double b = scanner.nextDouble();
		System.out.print("Nhập c:");
		double c = scanner.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
		double canDelta = Math.sqrt(delta);
		System.out.print("Delta: " + delta + "| Căn delta: " + canDelta);
	}

}
