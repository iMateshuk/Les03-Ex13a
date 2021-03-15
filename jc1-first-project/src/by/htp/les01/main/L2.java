package by.htp.les01.main;

import java.util.*;

public class L2 {

	public static void main(String[] args) {
		int i;
		Scanner conin = new Scanner(System.in);
/* Src
		while (conin.hasNextInt()) {
			i=conin.nextInt();
			System.out.println("i = " + i);
		}
*/
//  Solution 1		
		/*
		while (true) {
			if (conin.hasNextInt()) {
				i = conin.nextInt();
				System.out.println("i = " + i);
				//conin.nextLine();
			} else if (!(conin.nextLine().isBlank() && conin.nextLine().isEmpty())){
				System.out.println("нет, нужно целое число");
			}
		}
		*/
// Solution 2
		/*
		while (true) {
			while (conin.hasNextInt()) {
				i=conin.nextInt();
				System.out.println("i = " + i);
				conin.nextLine();
			}
			if (!(conin.nextLine().isBlank() && conin.nextLine().isEmpty())){
				System.out.println("нет, нужно целое число");
			}
		}
		*/
		
// Solution 3
		/*
		while (true) {
			while (conin.hasNextInt()) {
				i = conin.nextInt();
				System.out.println("i = " + i);
			}
			if (!(conin.nextLine().isBlank() && conin.nextLine().isEmpty())) {
				System.out.println("нет, нужно целое число");
			}
		}
		*/
		
// Solution 4

		while (true) {
			while (conin.hasNextInt()) {
				i = conin.nextInt();
				System.out.println("i = " + i);
			}
			//conin.next();
			//System.out.println("нет, нужно целое число");
			System.out.println("нужно целое число, а не - " + conin.next());
		}

	}

}
