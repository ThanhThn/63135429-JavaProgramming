package Bai1;

import java.util.Scanner;

public class Lab3Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một số nguyên: ");
		int num = scanner.nextInt();
		boolean ok =true;
		for(int i=2; i < num-1; i++){
			if(num % i == 0){
			ok=false;
			break;
			}
		}
		if(ok) {
			System.out.print("Đó là số nguyên tố");
		}else System.out.print("Đó không là số nguyên tố");
	}

}
