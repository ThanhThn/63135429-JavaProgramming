package Bai3;

import java.util.ArrayList;
import java.util.List;

import Bai2.SanPham;
public class Lab6Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        List<SinhVien> danhSach = new ArrayList<SinhVien>();
        for (int i = 0; i < n; i++){
        	SinhVien sv = new SinhVien();
            sv.nhap();
            danhSach.add(sv);
        }
        for (SinhVien sv : danhSach){
            sv.xuat();
        }
	}

}
