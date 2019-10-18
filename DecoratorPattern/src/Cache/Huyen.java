package Cache;

public class Huyen {
	private String maHuyen;
	private String tenHuyen;
	private String maTinh;
	public Huyen(String maHuyen, String tenHuyen, String maTinh) {
		super();
		this.maHuyen = maHuyen;
		this.tenHuyen = tenHuyen;
		this.maTinh = maTinh;
	}
	public Huyen() {
		super();
	}
	public String getMaHuyen() {
		return maHuyen;
	}
	public void setMaHuyen(String maHuyen) {
		this.maHuyen = maHuyen;
	}
	public String getTenHuyen() {
		return tenHuyen;
	}
	public void setTenHuyen(String tenHuyen) {
		this.tenHuyen = tenHuyen;
	}
	public String getMaTinh() {
		return maTinh;
	}
	public void setMaTinh(String maTinh) {
		this.maTinh = maTinh;
	}
	
	
	
}
