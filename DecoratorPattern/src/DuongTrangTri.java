
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
	
	public DuongTrangTri (Cafe cafe) throws Exception {
		Cafe x = cafe;
		boolean daCoDuong3Lan = false;
		
		String s = x.getMoTa();
		String sub = "Duong";
		String temp = s.replace(sub, "");
		int occ = (s.length() - temp.length()) / sub.length();
		if(occ>2)
			daCoDuong3Lan = true;
		
		while (true) {
			if (x instanceof TrangTriCafe) {
				x = ((TrangTriCafe) x).cafe;
			}
			else
				break;
		}
		
		if (daCoDuong3Lan) 
			throw new Exception("Không được thêm duong qua 3 lần");			
		else 
			this.cafe = cafe;
	}	
}
