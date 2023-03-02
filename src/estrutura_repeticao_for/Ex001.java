package estrutura_repeticao_for;

import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro X: ");
		int x = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
