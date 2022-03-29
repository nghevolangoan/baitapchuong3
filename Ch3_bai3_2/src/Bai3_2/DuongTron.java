package Bai3_2;

import java.util.regex.*;

public class DuongTron {
		
		public double r;
		final double pi=3.14;
		 DuongTron(){
			System.out.println("Bán kính đường tròn là  : ");
			r=sc.nextDouble();
		}
		public double TinhChuVi() {
			return r * 2 *pi;
		}
		public double TinhDienTich() {
			return r *r ;
		}
		public void InThongTin() {
			System.out.println("Chu vi hình tròn là : " + TinhChuVi());
			System.out.println("Diện tích hình tròn là : " + TinhDienTich());
		}
	}
}
