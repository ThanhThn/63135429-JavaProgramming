package Bai4;

import java.util.Scanner;

import Bai1.Lab2Bai1;
import Bai2.Lab2Bai2;
import Bai3.Lab2Bai3;

public class Lab2Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("");
			System.out.println("+---------------------------------------------------+");
			System.out.println("+ 1. Giải phương trình bậc nhất");
			System.out.println("+ 2. Giải phương trình bậc 2");
			System.out.println("+ 3. Tính tiền điện");
			System.out.println("+ 4. Kết thúc");
			System.out.println("+---------------------------------------------------+");
			System.out.print("Chọn chức năng: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				Lab2Bai1 ptb1 = new Lab2Bai1();
				ptb1.main(null);
				break;
			case 2:
				Lab2Bai2 ptb2 = new Lab2Bai2();
				ptb2.main(null);
				break;
			case 3:
				Lab2Bai3 tinhDien = new Lab2Bai3();
				tinhDien.main(null);
				break;
			default:
				return;
			}
		}
		
	}

}
