package tinhchuvidientichHCN;

import java.util.Scanner;

public class hinhchunhat {

	public static void main(String[] args) {
		
		public class hinhchunhat {
		    double dai, rong;
		
		// Constructor có tham số
	    public hinhchunhat(double dai, double rong) {
	        this.dai = dai;
	        this.rong = rong;
	    }

	    // Constructor không có tham số
	    public hinhchunhat() {
	    }

	    // Getter và Setter
	    public double getRong() {
	        return rong;
	    }

	    public double getDai() {
	        return dai;
	    }

	    public void setRong(double rong) {
	        this.rong = rong;
	    }

	    public void setDai(double dai) {
	        this.dai = dai;
	    }

	    // Phương thức tính diện tích
	    public double tinhDienTich() {
	        return dai * rong;
	    }

	    // Phương thức tính chu vi
	    public double tinhChuVi() {
	        return (dai + rong) * 2;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Yêu cầu người dùng nhập vào chiều dài và chiều rộng
	        System.out.print("Nhập chiều dài: ");
	        double dai = scanner.nextDouble();
	        System.out.print("Nhập chiều rộng: ");
	        double rong = scanner.nextDouble();

	        // Tạo đối tượng HinhChuNhat và tính toán
	        HinhChuNhat hcn = new HinhChuNhat(dai, rong);
	        System.out.println("Diện tích: " + hcn.tinhDienTich());
	        System.out.println("Chu vi: " + hcn.tinhChuVi());
	    }
	}

	}

}
