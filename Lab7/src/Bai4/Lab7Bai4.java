package Bai4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Bai2.SinhVienPoly;
import Bai3.*;

public class Lab7Bai4 {
		static Scanner scanner = new Scanner(System.in);
	    static List<SinhVienPoly> danhSach = new ArrayList<SinhVienPoly>();
	    static void menu() {
	        while (true){
	            System.out.println("=== MENU ===");
	            System.out.println("1. Nhập danh sách sinh viên.");
	            System.out.println("2. Xuất danh sách sinh viên.");
	            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi.");
	            System.out.println("4. Sắp xếp danh sách theo điểm.");
	            System.out.println("5. Kết thúc.");
	            System.out.print("Vui lòng chọn : ");
	            int choose = scanner.nextInt();
	            switch (choose) {
	                case 1:
	                    nhap();
	                    break;
	                case 2:
	                    xuat();
	                    break;
	                case 3:
	                    SVGioi();
	                    break;
	                case 4:
	                    sapxep();
	                    xuat();
	                    break;
	                case 5:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ.");
	                    break;
	            }
	        }
	    }
	    static void nhap(){
	        while (true){
	        	scanner.nextLine();
	        	System.out.print("Nhập tên sinh viên : ");
	            String ten = scanner.nextLine();
	            System.out.println(ten);
	            System.out.print("Nhập ngành (1: IT, 2: Marketing) : ");
	            int nganh = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character
	            if(nganh == 1) {
	                System.out.print("Nhập điểm HTML : ");
	                Double diemHtml = scanner.nextDouble();
	                System.out.print("Nhập điểm CSS: ");
	                Double diemCss = scanner.nextDouble();
	                System.out.print("Nhập điểm Java: ");
	                Double diemJava = scanner.nextDouble();
	                danhSach.add(new SinhVienIT(ten, diemJava, diemCss,diemHtml));
	            }
	            else {
	                System.out.print("Nhập điểm Sales : ");
	                Double diemSales = scanner.nextDouble();
	                System.out.print("Nhập điểm Marketing: ");
	                Double diemMarketing = scanner.nextDouble();
	                danhSach.add(new SinhVienBiz(ten, diemMarketing, diemSales));
	            }
	            System.out.print("Nhập tiếp không (Y/N) : ");
	            if (scanner.next().equalsIgnoreCase("N")){
	                break;
	            }
	        }
	    }
	    static void xuat(){
	        if (danhSach.isEmpty()){
	            System.out.println("Danh sách rỗng");
	        }else {
	            System.out.println("Danh sách : ");
	            for (int i = 0; i < danhSach.size(); i++){
	            	danhSach.get(i).Xuat();
	            }
	        }
	    }
	    static int soSanh(SinhVienPoly o1, SinhVienPoly o2) {
	        if (o1.getDiem() > o2.getDiem()) return 1;
	        if (o1.getDiem() == o2.getDiem()) return 0;
	        return -1;
	    }
	    static void sapxep() {
	        if (danhSach.isEmpty()) {
	            System.out.println("Danh sách sản phẩm trống.");
	        } else {
	            danhSach.sort((o1, o2) -> soSanh(o1, o2));
	        }
	    }

	    static void SVGioi(){
	        for (SinhVienPoly sv : danhSach){
	            if (sv.getHocLuc().equals("Giỏi")){
	                System.out.println(String.format("%s : %s", sv.getHoTen(),sv.getDiem()));
	            }
	        }
	    }
	    public static void main(String[] args) {
	        menu();
	    }

}
