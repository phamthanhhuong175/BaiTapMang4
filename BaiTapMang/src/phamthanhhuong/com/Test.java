package phamthanhhuong.com;

import java.util.Random;
import java.util.Scanner;

public class Test {
	//hàm nhập mảng bất kỳ
	static void nhapMang(int []M)
	{
		Random rd=new Random();
		for (int i = 0; i < M.length; i++) 
		{
			M[i]=rd.nextInt(100);
		}
	}
	//hàm xuất mảng đã nhập bất kỳ
	static void xuatMang(int []M)
	{
		for (int i = 0; i < M.length; i++)
		{
			System.out.print(M[i]+" ");
		}
	}
	//hàm xuất và đếm số lẻ
	static void xuatVaDemSoLe(int []M)
	{
		int demSoLe=0;
		for(int i=0;i<M.length;i++)
		{
			if(!(M[i]%2==0))
			{
			System.out.print(M[i]+" ");
			demSoLe++;
			}
		}
		System.out.println("=> có "+demSoLe+" số lẻ");
	}
	//hàm xuất và đếm số chẵn
	static void xuatVaDemSoChan(int M[])
	{
		int demSoChan=0;
		for(int i=0;i<M.length;i++)
		{
			if(M[i]%2==0)
			{
			System.out.print(M[i]+" ");
			demSoChan++;
			}
		}
		System.out.println("=> có "+demSoChan+" số chẵn");
	}
	//Hàm kiểm tra số nguyên tố
	static boolean kiemTraSoNguyenTo(int n)
	{
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	//hàm xuất số nguyên tố
	static void xuatSoNguyenTo(int M[])
	{
		int dem1=0;
		for(int i=0;i<M.length;i++)
		{
			if(kiemTraSoNguyenTo(M[i])==true)
			{
				dem1++;
				System.out.print(M[i]+" ");
			}
		}
		if(dem1==0)
			System.out.println("Không có số nguyên tố nào trong mảng");
		else 
			System.out.println(" => là các số nguyên tố");
	}
	//hàm xuất số không phải là số nguyên tố
	static void xuatSoKhongLaSoNguyenTo(int M[])
	{
	int dem2=0;
		for(int i=0;i<M.length;i++)
		{
			if(kiemTraSoNguyenTo(M[i])==false)
			{
				dem2++;
				System.out.print(M[i]+" ");
			}
		}
		if(dem2==0)
			System.out.println("tất cả các số trong mảng đều là số nguyên tố");
		else 
			System.out.println(" => là các số không phải là số nguyên tố");
	}
	public static void main(String[] args) {
			int X[];
			int n;
			System.out.println("Bạn muốn cấp bao nhiêu phần tử: ");
			n=new Scanner(System.in).nextInt();
			X=new int[n];
			nhapMang(X);
			System.out.println("Mảng ngẫu nhiên sau khi nhập:");
			xuatMang(X);
			System.out.println();
			xuatVaDemSoLe(X);
			xuatVaDemSoChan(X);
			xuatSoNguyenTo(X);
			xuatSoKhongLaSoNguyenTo(X);
	}

}
