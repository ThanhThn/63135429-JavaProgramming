package Bai2;

import java.util.Scanner;

public class SanPham {
	String tenSp;
    double donGia;
    String hang;
    public SanPham() {
    }
    public void xuat(){
        System.out.println(String.format("Tên sản phẩm : %s | Đơn giá : %s | Hãng : %s",tenSp,donGia,hang));
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm : ");
        tenSp = scanner.next();
        System.out.print("Nhập đơn giá : ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập hãng : ");
        hang = scanner.next();
    }
}
