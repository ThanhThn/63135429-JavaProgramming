package Bai3;

import java.util.Scanner;

public class Lab2Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số điện sử dụng: ");
		int dien = scanner.nextInt();
		int tienDien;
		if(dien <= 50 && dien >= 0) {
			tienDien = dien * 1000;
		}
		else tienDien = 50 * 1000 + (dien - 50) * 1200;
		System.out.print("Tiền điện cần chi trả: " + tienDien);

	}

}
