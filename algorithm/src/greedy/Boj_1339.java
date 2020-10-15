package greedy;

import java.util.Scanner;

public class Boj_1339 {
	// 알파벳 개수 최대 10개 , 수의 최대 길이 8, 단어의 합의 최대값을 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int tmp; // 문자열의 자릿수 구하기
		String[] words = new String[n];
		
		for(int i=0; i<n; i++) {
			words[i] = sc.next();
		}
		for(int i=0; i<n; i++) {
			tmp = words[i].length();
			if(tmp > words[i+1].length()) {
				String s = words[i];
				
			}
		}
		
	}

}
