package application;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, sum;
		
		System.out.println("Enter with numbers: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		
		System.out.println(sum);
		
		sc.close();
	}

}
