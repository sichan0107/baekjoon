package algorithm;

import java.util.Scanner;

/*
 * 알파벳 대소문자로 된 단어가 주어지면, 
	이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
	 단, 대문자와 소문자를 구분하지 않는다.
 */
public class Boj_1157 {
	// 출력이 대문자니까 입력을 전부 대문자로 바꿔주고 비교
	public static void changeWord(String input) {
		char[] c = input.
		
	}
	
	public static void show(int[] alpha) {
		for(int i=0; i<alpha.length; i++) {
			alpha[i]
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input = input.toUpperCase();		
		// 26개의 알파벳 카운트 배열 생성
		int[] alpha = new int[26];
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = 0; // 전부 0으로 초기화
		}
		// for문을 돌면서 나온 char값에서 대문자 A 혹은 65를 뺀다
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			alpha[c - 65] += 1; 	
		}
		
		for()
		
		
		
		
	}

}
