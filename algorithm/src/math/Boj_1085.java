package math;

import java.util.Scanner;
//직사각형 탈출
public class Boj_1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //한수 좌표(참고 : 1보다 크거나 같고 w보다 1작거나 같아야함.)
		int y = sc.nextInt();
		int w = sc.nextInt(); //직사각형의 끝 좌표
		int h = sc.nextInt();
		
		System.out.println(Math.min(Math.min(w-x, x), Math.min(h-y, y)));
	}
}
