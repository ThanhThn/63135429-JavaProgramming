package Bai3;

import Bai2.SinhVienPoly;

public class SinhVienIT extends SinhVienPoly{
    double diemJava, diemCss, diemHtml;

    public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, "Công nghệ thông tin");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemCss + diemHtml)/4;
    }
}

