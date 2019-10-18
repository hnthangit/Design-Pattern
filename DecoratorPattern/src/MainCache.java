import java.util.ArrayList;

public class MainCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TinhDAO tinhdao = new TinhDAO();
		ArrayList<Tinh> listTinh = tinhdao.getAll();
		for (Tinh tinh : listTinh) {
			System.out.println("Ma tinh: " + tinh.getMaTinh() + ", ten tinh: " + tinh.getTenTin());
		}
		
		ArrayList<Tinh> listTinh1 = tinhdao.getAll();
		for (Tinh tinh : listTinh1) {
			System.out.println("Ma tinh: " + tinh.getMaTinh() + ", ten tinh: " + tinh.getTenTin());
		}
		
		ArrayList<Tinh> listTinh2 = tinhdao.getAll();
		for (Tinh tinh : listTinh2) {
			System.out.println("Ma tinh: " + tinh.getMaTinh() + ", ten tinh: " + tinh.getTenTin());
		}
		
		
		
		
		
		
	}

}
