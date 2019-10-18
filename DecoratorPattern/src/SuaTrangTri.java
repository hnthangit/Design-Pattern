import java.util.ArrayList;

public class SuaTrangTri extends TrangTriCafe{

	@Override
	public String getMoTa() {
		// TODO Auto-generated method stub
		return this.cafe.getMoTa() + " Sua";
	}

	@Override
	public double Gia() {
		// TODO Auto-generated method stub
		return this.cafe.Gia() + 10;
	}
	
	public SuaTrangTri (Cafe cafe) throws Exception {
		boolean daTrangTriSua = false;
		Cafe x = cafe;

		while (true) {
			if (x instanceof TrangTriCafe) {
				if (x instanceof SuaTrangTri)
					daTrangTriSua = true;
				x = ((TrangTriCafe) x).cafe;
			}
			else
				break;
		}
		if (daTrangTriSua) 
			throw new Exception("Không được thêm sữa 2 lần");
			
		else 
			this.cafe = cafe;
	}

}
