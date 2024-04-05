package FE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import BE.Employee;
import BE.SortbyID;

public class Main {
	public static List <Employee> ds = new ArrayList<Employee>();
	Scanner s = new Scanner(System.in);

	public static void main(String[] args)
	{
		Employee e1 = new Employee(3,"Nguyen","2003-03-03","Nam");
		Employee e2 = new Employee(1,"Nguyen Van","2003-03-03","Nam");
		ds.add(e1);
		ds.add(e2);
		String luachon;
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println("\n1:Danh sach nhan vien");
			System.out.println("2:Them moi nhan vien");
			System.out.println("3:Xoa nhan vien");
			System.out.println("4:Thoat");
			luachon = s.nextLine();
			switch(luachon)
			{
			case "1":
				System.out.println("DANH SACH NHAN VIEN");
				System.out.printf("\n%15s %s %15s  %s %15s %s %15s","maNV","|","tenNV","|","ngaySinh","|","gioiTinh" );
				ds.toString();
				break;
			case "2":
				System.out.println("\nThem moi nv!");				
				Employee enew = new Employee();
				enew.nhap();
				 if (ds.contains(enew))
                 {
                    System.out.println("Da ton tai ma nv nay");
                    break;
                 }
				ds.add(enew);
				break;
			case "3":
				Xoa();
				break;
			case "4":
				break;
			default:
				System.out.println("Vui long nhap 1->4");
			}
		}
		while(luachon!="4");
	}

	public static void Xoa()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id nhan vien can xoa:");
		int s = scanner.nextInt();
		for (Employee employee : ds) {
			if(employee.getMaNV()==s)
				ds.remove(employee);
		}
		
	}
	public static  void Sapxep()
	{
		Collections.sort(ds,new SortbyID());
	}
}
