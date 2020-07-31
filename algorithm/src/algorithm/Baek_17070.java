package algorithm;

import java.io.*;
import java.util.*;

/*
 * 순서도
 * 
 * 1. 입력 세팅
 * 2. 
 */

public class Baek_17070 {
	static int n; // 집의 크기
	static int answer = 0;
	static int[][] map; // 집의 형태
    static int moveX[] = {1,0,1};
    static int moveY[] = {0,1,1};
	
	
	
	
	// 입력 : 첫째 줄에 집의 크기 N(3 ≤ N ≤ 16)이 주어진다. 둘째 줄부터 N개의 줄에는 집의 상태가 주어진다. 빈 칸은 0, 벽은 1로 주어진다. (1, 1)과 (1, 2)는 항상 빈 칸이다.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		
		System.out.println("집의 크기 : " + Integer.toString(n));
		
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine(), " ");
            for(int j=0; j<n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println("집의 상태 ------------\n");
        System.out.println(Arrays.deepToString(map));
	}

}
