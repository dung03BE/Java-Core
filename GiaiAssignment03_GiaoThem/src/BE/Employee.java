package BE;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private int maNV;
	private String tenNV;
	private String ngaySinh;
	private String gioiTinh;
	public Employee(int maNV, String tenNV, String ngaySinh, String gioiTinh) {
		
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}
	
	public Employee() {}
	public void setMaNV(int maNV)
	{
		this.maNV = maNV;
	}
	public int getMaNV()
	{
		return maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		System.out.printf("\n%15d %s %15s  %s %15s %s %15s",maNV,"|",tenNV,"|",ngaySinh,"|",gioiTinh );
		return super.toString();
	}
	
	public void nhap()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("MaNV:");
		maNV = s.nextInt();
		
		System.out.println("Ho ten NV:");
		tenNV = s.next();
		 s.nextLine();
		System.out.println("Ngay sinh:");
		ngaySinh = s.nextLine();
		System.out.println("Gioi tinh:");
		gioiTinh = s.nextLine();
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(maNV);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return maNV == other.maNV;
	}
	
}
