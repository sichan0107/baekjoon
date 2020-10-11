package dfsBfs;

import java.io.*;
import java.util.*;

public class Baek_17070 {
	static int N; // 집의 크기
	static int answer = 0;
	static int[][] map; // 집의 형태
	
	public static void dfsR(int x, int y, int d) {
		if(x == N-1 && y == N-1 && map[x][y] != 1) { // x,y 좌표가 가장 끝점이며, 끝점이 벽이 아니라면
			answer++; // 한번 탐색 끝
			return;
		}
		// 현재 놓여있는 막대가 가로일 때
		if(d == 0) {
			// 오른쪽으로 한칸 이동
			if(isRange(x, y+1) && map[x][y+1] == 0) {
				dfsR(x, y+1, 0);
			}
			// 오른쪽 아래 대각선 이동, 오른쪽, 대각선, 아래 벽 확인
			if(isRange(x+1, y+1) && map[x+1][y+1] == 0 && map[x+1][y] == 0 && map[x][y+1] == 0) {
				dfsR(x+1, y+1, 2); 
			}
			
		} else if(d == 1) { // 막대가 세로 일 때
			// 밑으로 움직이기
			if(isRange(x+1, y) && map[x+1][y] == 0) {
				dfsR(x+1, y, 1);
			}
			// 오른쪽 아래로 움직이기
			if(isRange(x+1, y+1) && map[x+1][y+1] == 0 && map[x][y+1] == 0 && map[x+1][y] == 0) {
				dfsR(x+1, y+1, 2);
			}
			
		} else if(d == 2) {	// 막대가 대각선일 때
			// 가로로 움직이기
			if(isRange(x, y+1) && map[x][y+1] == 0) {
				dfsR(x, y+1, 0);
			}
			// 세로로 움직이기
			if(isRange(x+1, y) && map[x+1][y] == 0) {
				dfsR(x+1,y, 1);
			}
			// 대각선으로 움직이기
			if(isRange(x+1, y+1) && map[x+1][y+1] == 0 && map[x][y+1] == 0 && map[x+1][y] == 0) {
				dfsR(x+1,y+1,2);
			}	
		}
	}
	
	public static boolean isRange(int x, int y) {
		return x>=0 && x<N && y>=0 && y<N;
	}
	
	// 입력 : 첫째 줄에 집의 크기 N(3 ≤ N ≤ 16)이 주어진다. 둘째 줄부터 N개의 줄에는 집의 상태가 주어진다. 빈 칸은 0, 벽은 1로 주어진다. (1, 1)과 (1, 2)는 항상 빈 칸이다.
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		map = new int[N][N];
		
        for(int i=0; i<N; i++) {
        	StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfsR(0,1,0);
        System.out.println(answer);
	}

}
