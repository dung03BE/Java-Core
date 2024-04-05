package g3;

import java.time.LocalDate;
import java.util.Scanner;

public class G3 {
	public static void main(String[] args)
	{
		LayNgauNhien5so();
//		NhapAcc();
//		Ex3q1();
//		Ex3q2();
//		Ex3q3();
//		Ex4q1();
//		Ex4q2();
//		Ex4q3();
//		Ex4q4();
		Ex4q6();
	}
	
	public static void LayNgauNhien5so()
	{
		int min=0;
		int max = 99999;
		int a = (int)(Math.random()*max)+min;
		while(a<10000)
		{
			a = a*10;
		}
		System.out.println("So  ngau nhien:"+a);
		String s = String.valueOf(a);
		System.out.println("Hai so cuoi:"+s.substring(3));
	}
	public static void NhapAcc()
	{
		Account[] a = new Account[3];
		for(int i=0; i<a.length;i++)
		{
			System.out.println("Nhap acc thu "+i);
			Account acc = new Account();
			acc.accName = "Name " + i;
			
			acc.createDate = LocalDate.now();
			a[i] = acc;
			System.out.println(
					"Thông tin Account " + i + a[i].accName
							+ " CreateDate: " + a[i].createDate);		
		}
	}
	public static void Ex3q1()
	{
		Integer a = 5000;
		float a1 = a.floatValue();
		System.out.printf("Luong %.2f",a1); // lay 2 chu só sau thap phan 
	}
	public static void Ex3q2()
	{
		String a = "1234567";
		int a1 = Integer.parseInt(a);
		
	}
	public static void Ex3q3()
	{
		Integer a = 5000;
		int a1 = a;
		System.out.printf("\nChuyen tu Integer -> int "+ a1); 
	}
	public static void Ex4q1()
	{
		String a = "Xin chao";
		String[] length = a.split(" ");
		System.out.println("\nSo tu:"+length.length);
	}
	public static void Ex4q2()
	{
		String a = "Xin chao ";
		String b = "Ban";
		String c = a.concat(b);
		System.out.println("\nChuoi a va b:"+c);
	}
	public  static void Ex4q3()
	{
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Nhập Tên: ");
		name = scanner.nextLine();
		 String[] cacTu = name.split("\\s+");
	        StringBuilder tenChuanHoa = new StringBuilder();

	        // Chuyển đổi ký tự đầu tiên của mỗi từ thành chữ hoa
	        for (String tu : cacTu) {
	            if (!tu.isEmpty()) {
	                String tuDaChuanHoa = tu.substring(0, 1).toUpperCase() + tu.substring(1).toLowerCase();
	                tenChuanHoa.append(tuDaChuanHoa).append(" ");
	            }
	        }
	        // Loại bỏ khoảng trắng cuối cùng (nếu có)
	       System.out.println(tenChuanHoa.toString().trim());
	    
	}
	public  static void Ex4q4()
	{
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Nhập Tên: ");
		name = scanner.nextLine();
		for(int i=0; i<name.length();i++)
		{
			System.out.println("Ky tu thu " + i+ ":"+name.charAt(i));
		}
	    
	}
	public static void Ex4q6()
	{
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Nhập Ho va Tên: ");
		name = scanner.nextLine();
		String[] s = name.split("\\s+");
//		for(int i=0;i<s.length;i++)
//		{
//			System.out.println("Ten:"+s[i]);
//		}
		if (s.length >= 3) {
            String ho = s[0];
            String tenDem = s[s.length - 2];
            String ten = s[s.length - 1];

            // Hiển thị các phần đã tách
            System.out.println("Họ: " + ho);
            System.out.println("Tên đệm: " + tenDem);
            System.out.println("Tên: " + ten);
        } else {
            System.out.println("Chuỗi không đủ thông tin để tách họ, tên đệm, và tên");
        }
	}
}
