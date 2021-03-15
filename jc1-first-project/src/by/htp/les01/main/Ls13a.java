package by.htp.les01.main;

import java.util.Scanner;

public class Ls13a {

	public static void main(String[] args) {
		double a =0;
		double b = 0;
		double c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¬ведите a:");
		
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("¬ведите a:");
		}
		
		a=sc.nextDouble();
		
		System.out.println("¬ведите b:");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("¬ведите b:");
		}
		
		b=sc.nextDouble();
		
		System.out.println("¬ведите c:");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("¬ведите c:");
		}
		
		c=sc.nextDouble();
		
		if (a==0) {
			System.out.println("«наменатель равен 0");
			return;
		}
		
		System.out.println("res = "+(((b+Math.sqrt(Math.pow(b, 2)+4*a*c))/2*a)-Math.pow(a, 3)*c+b));

	}

}
