package Bai3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SinhVien {
    String hoTen;
    String Email;
    String SoDienThoai;
    String CMND;

    private void setEmail(String email) {
    	String reGexEmail = "^[\\w.-]+@[a-zA-Z\\d]+\\.[a-zA-Z]{2,}$";
        if (email.matches(reGexEmail)){
            this.Email = email;
        }else {
            System.out.println("Email không hợp lệ");
            email = NhapLai("Email");
            setSoDienThoai(email);
        }
    }
    private void setSoDienThoai(String soDienThoai) {
    	String reGexStd = "^[\\d]{10}$";
        if (soDienThoai.matches(reGexStd)){
            this.SoDienThoai = soDienThoai;
        }else {
            System.out.println("Số điện thoại không hợp lệ");
            soDienThoai = NhapLai("Số điện thoại");
            setSoDienThoai(soDienThoai);
        }
    }

    private void setCMND(String CMND) {
    	String reGexCmnd = "^[\\d]{9}$";
        if (CMND.matches(reGexCmnd)){
            this.CMND = CMND;
        }else {
            System.out.println("CMND không hợp lệ");
            CMND = NhapLai("Số CMND");
            setSoDienThoai(NhapLai("Số CMND"));
        }
    }


    private String NhapLai(String thongTin){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập lại %s: ",thongTin);
        String duLieu = scanner.nextLine();
        return duLieu;
    }
    void xuat(){
        System.out.println(String.format("Họ tên : %s | Email : %s | Số điện thoại : %s | CMND : %s", hoTen, Email, SoDienThoai, CMND));
    }

    void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên sinh viên : ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập Email : ");
        String email = scanner.nextLine();
        setEmail(email);
        System.out.print("Nhập số điện thoại : ");
        String sdt = scanner.nextLine();
        setSoDienThoai(sdt);
        System.out.print("Nhập CMND : ");
        String cmnd = scanner.nextLine();
        setCMND(cmnd);

    }
}