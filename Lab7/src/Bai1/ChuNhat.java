package Bai1;

public class ChuNhat {
	double rong, dai;
	public ChuNhat(double rong , double dai){
		this.rong = rong;
		this.dai = dai;
	}
	public double getChuVi() {
		return (dai + rong) * 2;
	}
	public double getDienTich() {
		return dai * rong;
	}
	void xuat(){
        System.out.println(String.format("Chiều dài : %s | Chiều rộng : %s | Chu vi : %s | Diện tích : %s",dai,rong,getChuVi(),getDienTich()));
    }

}
