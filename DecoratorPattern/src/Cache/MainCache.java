package Cache;
import java.util.ArrayList;

public class MainCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TinhDAO tinhdao = new TinhDAO();
//		ArrayList<Tinh> listTinh = tinhdao.getAll();
//		for (Tinh tinh : listTinh) {
//			System.out.println("Ma tinh: " + tinh.getMaTinh() + ", ten tinh: " + tinh.getTenTin());
//		}
//		
//		ArrayList<Tinh> listTinh1 = tinhdao.getAll();
//		for (Tinh tinh : listTinh1) {
//			System.out.println("Ma tinh: " + tinh.getMaTinh() + ", ten tinh: " + tinh.getTenTin());
//		}
//		
//		ArrayList<Tinh> listTinh2 = tinhdao.getAll();
//		for (Tinh tinh : listTinh2) {
//			System.out.println("Ma tinh: " + tinh.getMaTinh() + ", ten tinh: " + tinh.getTenTin());
//		}
		
		ArrayList<Huyen> listHuyen = tinhdao.getHuyenOf("DN");
		for (Huyen huyen : listHuyen) {
			System.out.println("Ma huyen: " + huyen.getMaHuyen() + ", ten huyen: " + huyen.getTenHuyen());
		}
		
		ArrayList<Huyen> listHuyen2 = tinhdao.getHuyenOf("HCM");
		for (Huyen huyen : listHuyen2) {
			System.out.println("Ma huyen: " + huyen.getMaHuyen() + ", ten huyen: " + huyen.getTenHuyen());
		}
		
		ArrayList<Huyen> listHuyen3 = tinhdao.getHuyenOf("HN");
		for (Huyen huyen : listHuyen3) {
			System.out.println("Ma huyen: " + huyen.getMaHuyen() + ", ten huyen: " + huyen.getTenHuyen());
		}
		ArrayList<Huyen> listHuyen4 = tinhdao.getHuyenOf("HU");
		for (Huyen huyen : listHuyen4) {
			System.out.println("Ma huyen: " + huyen.getMaHuyen() + ", ten huyen: " + huyen.getTenHuyen());
		}
		ArrayList<Huyen> listHuyen6 = tinhdao.getHuyenOf("QT");
		for (Huyen huyen : listHuyen6) {
			System.out.println("Ma huyen: " + huyen.getMaHuyen() + ", ten huyen: " + huyen.getTenHuyen());
		}
		ArrayList<Huyen> listHuyen5 = tinhdao.getHuyenOf("QB");
		for (Huyen huyen : listHuyen5) {
			System.out.println("Ma huyen: " + huyen.getMaHuyen() + ", ten huyen: " + huyen.getTenHuyen());
		}
		
		ArrayList<Huyen> listHuyen7 = tinhdao.getHuyenOf("QB");
		for (Huyen huyen : listHuyen7) {
			System.out.println("Ma huyen: " + huyen.getMaHuyen() + ", ten huyen: " + huyen.getTenHuyen());
		}
		
		ArrayList<Huyen> listHuyen8 = tinhdao.getHuyenOf("HU");
		for (Huyen huyen : listHuyen8) {
			System.out.println("Ma huyen: " + huyen.getMaHuyen() + ", ten huyen: " + huyen.getTenHuyen());
		}
		
		
		
		
		
		
	}

}
