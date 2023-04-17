package bai3_3;
import java.util.Scanner;
import java.util.ArrayList;
class NgayThang{
	private int ngay, thang, nam;
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ngày : ");
		ngay = sc.nextInt();
		System.out.println("tháng : ");
		thang = sc.nextInt();
		System.out.println("năm : ");
		nam = sc.nextInt();
		
	}
	
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}
}
class HangThucPham extends cua_hang
{
	NgayThang ngaySanXuat = new NgayThang();
	NgayThang ngayHetHan = new NgayThang();
	
	public void NhapThoiGian() {
		System.out.println("\nngày sản xuất : ");
		ngaySanXuat.Nhap();
		System.out.println("\nngày hết hạn : ");
		ngayHetHan.Nhap();		
	}
	
	public String toString() 
	{
		return "Hạn sử dụng : " + ngaySanXuat + " - " + ngayHetHan;
	}
}

class HangDienMay extends cua_hang
{
	private String thoiGianBaoHanh,dienAp,congSuat;

	public void Nhap() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thời gian bảo hành : ");
		thoiGianBaoHanh = sc.nextLine();
		System.out.println("Nhập mức điện áp : ");
		dienAp = sc.nextLine();
		System.out.println("Nhập công suất : ");
		congSuat = sc.nextLine();
	}
	
	public String toString() {
		return "Thời gian bảo hành : " + thoiGianBaoHanh + "\nMức điện áp : " + dienAp + "\nCông suất : " +congSuat;
	}
}

class HangSanhSu extends cua_hang{
	private String loaiNguyenLieu;
	
	public void Nhap() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập loại nguyên liệu : ");
		loaiNguyenLieu = sc.nextLine();
	}
	
	public String toString() {
		return "Loại nguyên liệu: " + loaiNguyenLieu;
	}
}
public class cua_hang 
{
	private String maHang,tenHang,nhaSanXuat;
	private double gia;
	public void Nhap() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã hàng: ");
		maHang = sc.nextLine();
		System.out.println("Nhập tên hàng: ");
		tenHang = sc.nextLine();
		System.out.println("Nhập nhà sản xuất: ");
		nhaSanXuat = sc.nextLine();
		System.out.println("Nhập giá: ");
		gia = sc.nextInt();
	}
	public String toString() 
	{
		return "\nMã hàng hóa: " + maHang + "\nTên hàng hóa: " + tenHang + "\nNhà Sản Xuất: " + nhaSanXuat + "\nĐơn giá: " + gia;
	}
}
