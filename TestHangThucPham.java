package tuan4TH;

import java.util.GregorianCalendar;

public class TestHangThucPham {
		public static void main(String[] args) {
			DanhSachHangThucPham d=new DanhSachHangThucPham();
			d.themHangThucPham("123456","sOXA",new GregorianCalendar(2000,12,02));
			System.out.println(d.toString());
		}

}
