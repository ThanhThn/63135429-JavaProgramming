package Bai1;

import java.util.Scanner;

public class Lab6Bai1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String fullName = scanner.nextLine();
        String ho = fullName.substring(0, fullName.indexOf(" ")).toUpperCase();
        String tenDem = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
        String ten = fullName.substring(fullName.lastIndexOf(" ")).toUpperCase();
        System.out.println("Họ và tên sau khi chuyển đổi: "  + ho + tenDem + ten);
	}

}
