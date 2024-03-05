package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Lab6Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
        List<SanPham> danhSach = new ArrayList<SanPham>();
        for (int i = 0; i < n; i++){
            SanPham sanPham = new SanPham();
            sanPham.nhap();
            danhSach.add(sanPham);
        }
        for (SanPham sp : danhSach){
            if (sp.hang.equals("Nokia")){
                sp.xuat();
            }
        }
	}

}
