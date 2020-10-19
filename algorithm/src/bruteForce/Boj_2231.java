package bruteForce;

import java.util.Scanner;

public class Boj_2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int n2 = n;
		int min = 0; //최소값
		int cnt = 0;  //자리수
		int tmp = 0;
		int start = 0; //시작점
		int ans = 0; //결과
		
		// 입력 n에 대한 자리수 구하기
		while(n>0){
			n = n / 10; //10으로 나누어 구하기 
			cnt++; 
		}
		
		// 다른 방법으로 자리수 구하기
		//int cnt = String.valueOf(n).length();
		
		start = n2 - (cnt * 9);
		
		for(int i=start; i<n2; i++) {
			min = i;
			tmp = i;
			while(tmp > 0) {
				min = min + (tmp % 10);
				tmp = tmp / 10;
			}
			if(min == n2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);

	}

}
