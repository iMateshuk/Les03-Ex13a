package by.htp.les01.main;

import java.util.Scanner;

public class Ls13a {

	public static void main(String[] args) {
		double a =0;
		double b = 0;
		double c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� a:");
		
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("������� a:");
		}
		
		a=sc.nextDouble();
		
		System.out.println("������� b:");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("������� b:");
		}
		
		b=sc.nextDouble();
		
		System.out.println("������� c:");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("������� c:");
		}
		
		c=sc.nextDouble();
		
		if (a==0) {
			System.out.println("����������� ����� 0");
			return;
		}
		
		System.out.println(((b+Math.sqrt(Math.pow(b, 2)+4*a*c))/2*a)-Math.pow(a, 3)*c+b);

	}

}
