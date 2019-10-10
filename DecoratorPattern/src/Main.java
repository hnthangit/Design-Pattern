

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe x = new CafePhin();
		System.out.println(x.getMoTa() + " " + x.Gia());
		
		
		
//		x = new SuaTrangTri(x);
//		System.out.println(x.getMoTa() + " "  + x.Gia());
		
//		x = new RhumTrangTri(x);
//		System.out.println(x.getMoTa() + " "  + x.Gia());
		
		x = new DuongTrangTri(x);
		System.out.println(x.getMoTa() + " "  + x.Gia());
		
//		Cafe x2 = new CafeRangXay();
//		System.out.println(x2.getMoTa() + " " + x2.Gia());
//		try {
//			x = new SuaTrangTri(x);
//		} catch (Exception e1) {
//			System.out.println("Lỗi khi tạo lớp bề mặt");
//			e1.printStackTrace();
//		}
		try {
			x = new SuaTrangTri(x);
			System.out.println(x.getMoTa() + " "  + x.Gia());
		} catch (Exception e1) {
			System.out.println("Lỗi khi tạo lớp bề mặt");
			e1.printStackTrace();
		}
////		
//		try {
//			x = new RhumTrangTri(x);
//			System.out.println(x.getMoTa() + " "  + x.Gia());
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Lỗi khi bổ sung bề mặt rhum");
//			e.printStackTrace();
//		}
		
//		
		System.out.println("Tong gia: "+ x.getMoTa() + " " + x.Gia());

		
		
		
		
		
		
		
		
		
		
		//Cafe bmx1 = ((TrangTriCafe) x).getCafe();
//		if(x instanceof TrangTriCafe) {
//			System.out.println("ok");
//		} else {
//			System.out.println("ko ok");
//		}
//		System.out.println("123");
		//System.out.println(bmx1.getMoTa() + " "  + x.Gia());
	}

}
