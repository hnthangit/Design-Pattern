
/**
 * 
 */


/**
 * @author Blindfold Gang
 *
 */
public class DuongTrangTri extends TrangTriCafe {

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return this.cafe.getMoTa() + " Duong";
	}

	@Override
	public double Gia() {
		// TODO Auto-generated method stub
		return this.cafe.Gia() + 5;
	}
	
	public DuongTrangTri (Cafe cafe) {
		this.cafe = cafe;
//		boolean daCoDuong3Lan = false;
//		Cafe cafe2 = cafe;
//		while (true) {
//			if (cafe2 instanceof TrangTriCafe) {
//				cafe2 = ((TrangTriCafe) cafe2).getCafe();
//			}
	}
	
}
