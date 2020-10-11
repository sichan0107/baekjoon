package string;

import java.util.Scanner;
//알파벳찾기
public class Boj_10809 {
	public static void show(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // baekjoon);
		sc.close();
		int[] answer = new int[26];
		
		for(int i=0; i<26; i++) {
			answer[i] = -1;
		}
		
		for(int i=0; i<input.length(); i++) {
			char a = input.charAt(i);
			if(answer[a - 'a'] == -1) {
				answer[a - 'a'] = i;
			}
			else {
				continue;
			}
		}
		show(answer);
		
	}

}
