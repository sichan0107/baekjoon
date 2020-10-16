package bruteForce;

import java.util.Scanner;

public class Boj_2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int min = 0; //최소값
		int cnt = 0;  //자리수
		int tmp = 0;
		int start = 0; //시작점
		int ans = 0; //결과
		
		while(n>0){
			n = n / 10;
			cnt++; 
		}
		
		start = n - (cnt * 9);
		for(int i=start; i<n; i++) {
			min = i;
			tmp = i;
			while(tmp > 0) {
				min = min + tmp%10;
				tmp = tmp / 10;
			}
			if(min == n) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);

	}

}
