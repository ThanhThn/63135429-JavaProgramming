package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double tong = 0;
		ArrayList<Double> list = new ArrayList<Double>();
		while(true){
			Double x = scanner.nextDouble();
			list.add(x);
			System.out.print("Nhập thêm (Y/N)? ");
			if(scanner.next().equals("N")){
				break;
			}
		}
		for (Double x : list) {
			tong += x;
		}
		System.out.print("Tổng các giá trị nhập vào: " + tong);
		scanner.close();
	}
}
