package greedy;

import java.util.Scanner;

public class Boj_1339 {
	// ���ĺ� ���� �ִ� 10�� , ���� �ִ� ���� 8, �ܾ��� ���� �ִ밪�� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int tmp; // ���ڿ��� �ڸ��� ���ϱ�
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
