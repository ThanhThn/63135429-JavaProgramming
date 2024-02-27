package Bai2;

import java.util.Scanner;

public class Lab3Bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số bảng cửu chương: ");
		int num = scanner.nextInt();
		if(num <= 1) {
			System.out.print("Nhập vào bảng cửu chương: ");
			int x = scanner.nextInt();
			for(int i=1; i<=10;i++){
				System.out.printf("%d x %d = %d", x, i, x * i);
				System.out.println();
				}
		}else {
			for(int i = 1; i <= num; i++) {
				for(int j=1; j<=10;j++){
					System.out.printf("%d x %d = %d\n", i, j, i * j);
					}
				System.out.println();
			}
		}
	}
}
