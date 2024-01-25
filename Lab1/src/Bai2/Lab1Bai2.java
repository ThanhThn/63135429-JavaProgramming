package Bai2;

import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chiều dài: ");
		double dai = scanner.nextDouble();
		System.out.print("Chiều rộng: ");
		double rong = scanner.nextDouble();
		double chuVi = (dai + rong) * 2;
		double dienTich = dai * rong;
		double minCanh = Math.min(dai, rong);
		System.out.print("Chu vi: " + chuVi + "| Diện tích: " + dienTich + "| Cạnh nhỏ nhất: " + minCanh );
	}
}
