package tuan4TH;

import java.util.Calendar;

public class HangThucPham {
	private String tenHang;
	private String maHang;
	private Calendar ngaySX;
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}
	public Calendar getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(Calendar ngaySX) {
		this.ngaySX = ngaySX;
	}
	public HangThucPham(String tenHang, String maHang, Calendar ngaySX) {
		this.tenHang = tenHang;
		this.maHang = maHang;
		this.ngaySX = ngaySX;
	}
}
