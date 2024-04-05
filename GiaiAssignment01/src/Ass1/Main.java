package Ass1;

import java.util.Scanner;

public class Main {
	public Scanner s ;
	public static void main(String[] args)
	{
//		Department dpm1 = new Department();
//		dpm1.departmentID=1;
//		dpm1.departmentName="IT";
//		Position p1 = new Position();
//		p1.positionID=1;
//		p1.positionName = PositionName.Dev;
//		Account a1 = new Account();
//		a1.accountID=1;
//		a1.department = dpm1;
//		a1.position =p1;
//		a1.fullName ="Nguyen Chi Dung";
//		a1.userName="Chis";
//		a1.email ="dung2003hn@gmail.com";
//		System.out.println("Thong tin:" +a1);
//		System.out.println("___________________________________________________________________");
//		int n=4;
//		Department[] d = new Department[n];
//		d[1] = new Department(2,"Ke toan");
//		d[2] = new Department(3,"Kiem toan");
//		for (Department dp : d) {
//			System.out.println("Cac phong ban:"+dp);
//		}
//		int i=1;
//		System.out.println("_Sd do while_");
//		do
//		{
//			System.out.println("Cac phong ban:"+d[i]);
//			i++;
//		}
//		while(i<=n);
		//Question5();
		//Question6();
//		Question8();
//		Luong();
		Ramdom5ChuSo();
	}
	public static void Question5()
	{
		Scanner s = new Scanner(System.in);
		int luachon ;
		Position p = new Position();
		System.out.println("Lua chọn:");
		luachon = s.nextInt();
		switch(luachon)
		{
		case 1:
			p.positionName=PositionName.Dev;
			break;
		case 2:
			p.positionName=PositionName.Test;
			break;
		case 3:
			p.positionName=PositionName.ScrumMaster;
			break;
		case 4:
			p.positionName=PositionName.PM;
			break;
		default:
			System.out.println("Ket thuc");
		}
		System.out.println(p.positionName);
	}
	public static void Question6()
	{
		Department d1 = new Department();
		d1.departmentID=2;
		d1.departmentName="Phong nhan su";
		System.out.println(d1);
	}
	public static void Question8()
	{
		
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Nhap vao cn muon sd:");
			int x = s.nextInt();
		
			if(x==1)
			{
			System.out.println("Nhap tk:");
			break;
			} 
			if(x==2)
			{	
			System.out.println("Nhap department");
			break;
			}
			else 
			{ System.out.println("Moi nhap lai");
			}
			}
			
		}
	public static void Luong()
	{
		float luong1 = (float)5240.5;
		float luong2 = (float)10970.077;
		int luong1t = (int)luong1;
		int luong2t = (int)luong2;
		System.out.println(luong1t+"and"+luong2t);
	}
		
	public static void Ramdom5ChuSo()
	{
		double ramdom = Math.random();
		ramdom = ramdom*99999 ;
		int ramdomI = (int)ramdom;
		if(ramdomI/10000<1)
		{
			System.out.println("0"+ramdomI);
		}
		else
			System.out.println(ramdomI);
		String str = 	Integer.toString(ramdomI);
		str = str.substring(3, 5);
		int a = Integer.parseInt(str);
		System.out.println("So:"+a);
		
	}
		
}
