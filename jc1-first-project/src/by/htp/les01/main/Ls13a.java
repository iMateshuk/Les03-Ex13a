package by.htp.les01.main;

import java.util.Scanner;

public class Ls13a {

	public static void main(String[] args) {
		double a =0;
		double b = 0;
		double c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ВВедите a:");
		
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Введите a:");
		}
		
		a=sc.nextDouble();
		
		System.out.println("ВВедите b:");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Введите b:");
		}
		
		b=sc.nextDouble();
		
		System.out.println("Введите c:");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Введите c:");
		}
		
		c=sc.nextDouble();
		
		if (a==0) {
			System.out.println("Знаменатель равен 0");
			return;
		}
		
		System.out.println(((b+Math.sqrt(Math.pow(b, 2)+4*a*c))/2*a)-Math.pow(a, 3)*c+b);

	}

}
