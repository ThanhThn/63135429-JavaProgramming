package Bai2;

public abstract class SinhVienPoly {
    String hoTen, nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public abstract double getDiem();
    public String getHocLuc(){
        double diem = getDiem();
        if(diem < 5) return "Yếu";
        if(diem < 6.5) return "Trung Bình";
        if(diem < 7.5) return "Khá";
        if(diem < 9) return "Giỏi";
        return "Xuất sắc";
    }

    public void Xuat(){
        System.out.println("Họ tên: " + hoTen + "\n" + "Ngành: " + nganh + "\n" +"Điểm: " + getDiem() + "\n" +"Học lực: " + getHocLuc() + "\n");
    }
}

