package bm.baitap3;

import java.util.Scanner;

public class bm03 {

	public static void main(String[] args) {
		
		
	
		
		// In thông tin ra cho người dùng
				System.out.println("Bạn " + hoTen);
				System.out.println("Có chỉ số BMI = " + bmi);
		
		
		if (bmi<18.5)
//			System.out.println("Thiếu cân");
//		else if (bmi<25) 
//			System.out.println("Cân nặng bình thường");
//		else if (bmi<30)
//			System.out.println("Thừa cân, tiền béo phì");
//		else if (bmi<35)
//			System.out.println("Béo phì độ 1");
//		else if (bmi<40)
//			System.out.println("Béo phì độ 2");
//		else System.out.println("Béo phì độ 3 (Bệnh lý");
		
		String thongBao;
		if (bmi<18.5)
			thongBao = "Thiếu cân";
		else if (bmi<25) 
			thongBao= "Cân nặng bình thường";
		else if (bmi<30)
			thongBao ="Thừa cân, tiền béo phì";
		else if (bmi<35)
			thongBao= "Béo phì độ 1";
		else if (bmi<40)
			thongBao= "Béo phì độ 2";
		else thongBao="Béo phì độ 3 (Bệnh lý";
		
		System.out.println(thongBao);
		
		
	}

}
