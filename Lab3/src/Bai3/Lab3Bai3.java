package Bai3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab3Bai3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử: ");
        int num = scanner.nextInt();
        int[] array = new int[num];
        int dem = 0, tong = 0;
        for (int i = 0; i < num; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            int x = scanner.nextInt();
            array[i] = x;
        }
        Arrays.sort(array);
        System.out.print("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
            if(array[i] % 3 == 0) {
            	tong += array[i];
            	dem++;
            }
        }
        System.out.println("\nGiá trị nhỏ nhất trong mảng: " + array[0]);
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + (tong/3));
        scanner.close();
	}
}
