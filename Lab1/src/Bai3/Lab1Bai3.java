package Bai3;

import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cạnh: ");
		double canh = scanner.nextDouble();
		double theTich = Math.pow(canh, 3);
		System.out.print("Thể tích hình lập phương: " + theTich );
	}

}
