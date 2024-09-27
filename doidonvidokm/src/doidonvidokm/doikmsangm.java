package doidonvidokm;

public class doikmsangm {


		public class ConvertKmToM {
		    public static void main(String[] args) {
		        double kilometers = 5.0; // Giá trị km cần chuyển đổi
		        double meters = kilometersToMeters(kilometers);
		        System.out.println(kilometers + " km = " + meters + " m");
		    }

		    public static double kilometersToMeters(double kilometers) {
		        return kilometers * 1000;

	}

}
}
