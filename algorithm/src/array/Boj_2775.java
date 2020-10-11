package array;

import java.util.Scanner;
//부녀회장
public class Boj_2775 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int T = sc.nextInt(); // 테스트 케이스 개수
	      int k, n = 0;
	      int[][] apart = new int[15][15];
	      for(int i=0; i<15; i++) {
	          apart[0][i] = i + 1;
	          apart[i][0] = 1;
	       }
	      for(int j=1; j<15; j++) {
	          for(int i=1; i<15; i++) {
	             apart[j][i] = apart[j][i-1] + apart[j-1][i];
	          }
	       }
	      
	      for(int i=0; i<T; i++) {
	         k = sc.nextInt(); //층
	         n = sc.nextInt(); //호
	         System.out.println(apart[k][n-1]);
	      }
	      
	   }


}
