package recursive;

import java.util.Scanner;

// 재귀 (팩토리얼)
public class Boj_10872 {
	public static int factorial(int n) {
		if(n <= 1) {
			return n;
		}
		return factorial(n-1) * n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(factorial(input));
	}

}
