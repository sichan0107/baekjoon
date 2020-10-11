package bruteForce;

import java.util.Scanner;
// 덩치
public class Boj_7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		int[] h = new int[n];
		int[] rank = new int[n];
		
		for(int i=0; i<n; i++) {
			w[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					continue;
				}
				if(w[i] < w[j] && h[i] < h[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int a : rank) {
			System.out.print(a+1 + " ");
		}
	}

}
