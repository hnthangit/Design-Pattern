
public class RhumTrangTri extends TrangTriCafe {

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return this.cafe.getMoTa() + " Rhum";
	}

	@Override
	public double Gia() {
		// TODO Auto-generated method stub
		return this.cafe.Gia() + 55;
	}

	public RhumTrangTri(Cafe cafe) throws NullPointerException {
		try {
			boolean DaCoDuongHoacSua = false;
			Cafe cafe2 = cafe;
			while (true) {
				if (cafe2 instanceof TrangTriCafe) {
					cafe2 = ((TrangTriCafe) cafe2).getCafe();
					if (cafe2 instanceof DuongTrangTri || cafe2 instanceof SuaTrangTri) {
						DaCoDuongHoacSua = true;
					} else
						break;
				}

			}
			if (DaCoDuongHoacSua == true) {
				throw new Exception("Ko the them vao khi da co Duong hoac Sua");
			}
			this.cafe = cafe;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
