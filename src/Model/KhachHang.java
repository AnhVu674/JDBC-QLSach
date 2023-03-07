package Model;

public class KhachHang {
private String id;
private String ten;
private String soDT;
private String diaChi;
public KhachHang(String id, String ten, String soDT, String diaChi) {
	super();
	this.id = id;
	this.ten = ten;
	this.soDT = soDT;
	this.diaChi = diaChi;
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
public String getSoDT() {
	return soDT;
}
public void setSoDT(String soDT) {
	this.soDT = soDT;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public KhachHang() {
	super();
}
}
