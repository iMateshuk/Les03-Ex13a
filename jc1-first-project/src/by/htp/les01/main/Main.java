package by.htp.les01.main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println(">");
		boolean b = sc.hasNextInt();
		
		if(b == true) {
			x=sc.nextInt();
			System.out.println("�������, x = " + x);
		} else {
			System.out.print("....., ������� �� ����� �����, � ");
			String str = sc.nextLine();
			System.out.println(str);
		}
		x=sc.nextInt();
		sc.nextLine();
		System.out.println("x = " + x);
		
		System.out.println(">");
		y=sc.nextInt();
		System.out.println("y = " + y);
	}

}