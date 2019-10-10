

public class KemTrangTri extends TrangTriCafe{

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return this.cafe.getMoTa() + " Kem";
	}

	@Override
	public double Gia() {
		// TODO Auto-generated method stub
		return this.cafe.Gia() + 20;
	}
	
	public KemTrangTri (Cafe cafe) {
		this.cafe = cafe;
	}

}
