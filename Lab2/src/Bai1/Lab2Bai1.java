package Bai1;

import java.util.Scanner;

public class Lab2Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập giá trị phương trình bậc nhất ax + b: ");
		System.out.print("Nhập a:");
		double a = scanner.nextDouble();
		System.out.print("Nhập b:");
		double b = scanner.nextDouble();
		if(a == 0) {
			if (b == 0) {
				System.out.print("Phương trình vô số nghiệm");
			}
			else System.out.print("Phương trình vô nghiệm");
			
		}
		else {
			double x = (- b) / a;
			System.out.print("Phương trình có nghiệm: x = " + x);
		}
	}

}
