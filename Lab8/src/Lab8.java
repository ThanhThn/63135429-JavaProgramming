import java.util.Random;

public class Lab8 {

	public static void main(String[] args) {
		double[] numbers = {2.0, 3.4, 10.0, 1.2};
		String ten = "nguyen van teo";
		for (double number : numbers) {
		    System.out.print(number + " ");
		}
		System.out.println("\nSố lớn nhất: " + XPoly.max(numbers));
		System.out.println("Số bé nhất: " + XPoly.min(numbers));
		System.out.println("Tổng: " + XPoly.sum(numbers));
		System.out.println("Chuỗi kiểu Tilte case: " + XPoly.toUpperFirstChar(ten));
	}

}
