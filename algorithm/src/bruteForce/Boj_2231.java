package bruteForce;

import java.util.Scanner;

// 분해합
public class Boj_2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 0;
		int cnt = 0; //자리수 구하기
		int tmp = 0; //가장 큰 자리수들의 합
		while(n>0){
			n = n / 10;
			cnt++; 
		}
		
		tmp = cnt * 9;
		for(int i=1; i<tmp; i++) {
			min = n - i;
			
			if(min < n - tmp) { //생성자가 없을 경우
				System.out.println("0");
			}
		}
	}

}
