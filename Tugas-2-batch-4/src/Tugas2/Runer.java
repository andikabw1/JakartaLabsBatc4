package Tugas2;


public class Runer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Implementer implementer = new Implementer();
		
		try {
			implementer.penjumlahan(5, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Terjadi error");
		}
		
		try {
			implementer.pengurangan(5, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Terjadi error");
		}
		
		try {
			implementer.perkalian(5, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Terjadi error");
		}
		
		try {
			implementer.pembagian(5, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Terjadi error");
		}

	}

}
