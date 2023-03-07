package Model;

public class Sach  {
	@Override
	public String toString() {
		return "Sach [id=" + id + ", ten=" + ten + ", namXuatBan=" + namXuatBan + ", gia=" + gia + "]";
	}

	private String id;
	private String ten;
	private String namXuatBan;
	private float gia;

	public Sach(String id, String ten, String namXuatBan, float gia) {
		this.id = id;
		this.ten = ten;
		this.namXuatBan = namXuatBan;
		this.gia = gia;
	}

	public Sach() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(String namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}
}
