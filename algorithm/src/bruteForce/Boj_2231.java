package bruteForce;

import java.util.Scanner;

public class Boj_2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int min = 0;
		int cnt = 0; 
		int tmp = 0; 
		while(n>0){
			n = n / 10;
			cnt++; 
		}
		
		tmp = cnt * 9;
		for(int i=1; i<tmp; i++) {
			min = n - i;
			
			if(min < n - tmp) { 
				System.out.println("0");
			}
		}

	}

}
