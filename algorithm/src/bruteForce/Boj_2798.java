package bruteForce;

import java.util.Scanner;
//블랙잭
public class Boj_2798 {

	   public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      int n = sc.nextInt(); //카드 개수
		      int m = sc.nextInt(); //합의 범위
		      int tmp = 0; //계산값
		      int[] card = new int[n];
		      int max = 0;//최대값
		      
		      for(int i=0; i<n; i++) {
		         card[i] = sc.nextInt();
		      }
		      for(int i=0; i<n-2; i++) { //0 1 2 
		         for(int j=i+1; j<n-1; j++) { // 1 2 3
		              for(int k=j+1; k<n; k++) { // 2 3 4
		                 tmp = card[i] + card[j] + card[k];
		                 if(tmp <= m && tmp > max) {
		                     max = tmp;
		                 }
		               }
		               
		          }
		      }
		      System.out.println(max);
		      
		   }


}
