package Bai2;

import Bai1.Lab2Bai1;
import java.util.Scanner;

public class Lab2Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập các giá trị của phương trình bậc 2: ax^2 + bx + c");
		System.out.print("Nhập a:");
		double a = scanner.nextDouble();
		System.out.print("Nhập b:");
		double b = scanner.nextDouble();
		System.out.print("Nhập c:");
		double c = scanner.nextDouble();
		if (a == 0) {
			Lab2Bai1 ptb1 = new Lab2Bai1();
			ptb1.phuongTrinhBac1(b, c);
		}
		else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if(delta < 0) {
				System.out.print("Phương trình vô nghiệm");
				return;
			}
			if(delta == 0) {
				double x = -b / (2 * a) ;
				System.out.print("Phương trình có nghiệm kép: " + x );
				return;
			}
			if(delta > 0) {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.print("Phương trình có nghiệm: x1 = " + x1 + "và x2 = " + x2);
				return;
			}
		}
	}

}
