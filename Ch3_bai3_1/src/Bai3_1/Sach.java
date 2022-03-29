package Bai3_1;

import java.util.regex.*;

public class Sach {
	 public String TenSach,TenTacGia,LoaiSach,NhaXuatBan;
	 public Integer MaSach,SoTrang,SoTap;
	 public Double GiaTien;
	 public static Scanner sc=new Scanner(System.in);
     public Sach(){
    	 System.out.println("Tên của sách là : ");
         TenSach=sc.nextLine();
         System.out.println("Mã số sách là : ");
         MaSach=sc.nextInt();
         sc.nextLine();
         System.out.println("Tên tác giả là :");
         TenTacGia=sc.nextLine();
         System.out.println("Số Trang là : ");
         SoTrang=sc.nextInt();
         sc.nextLine();
         System.out.println("Loại sách là : ");
         LoaiSach=sc.nextLine();
         System.out.println("Nhà xuất bản là : ");
         NhaXuatBan=sc.nextLine();
         System.out.println("Số tập là : ");
         SoTap=sc.nextInt();
         System.out.println("Giá tiền là : ");
         GiaTien=sc.nextDouble();
     }
    	
         public void InSach() {
        	 System.out.println("Tên của sách là : " + TenSach);
        	 System.out.println("Mã số sách là : " + MaSach);
        	 System.out.println("Tên tác giả là: " +TenTacGia);
        	 System.out.println("Số Trang là :" + SoTrang);
        	 System.out.println("Loại sách là : "+ LoaiSach);
        	 System.out.println("Nhà xuất bản là : "+ NhaXuatBan);
        	 System.out.println("Số tập là: " + SoTap);
        	 System.out.println("Giá tiền là : " + GiaTien);
         }
     
}

