package sort;

import java.util.Scanner;

// nlogn 시간복잡도의 알고리즘으로 풀어야함. 퀵,힙 등
public class Boj_2751 {
	public static int[] quickSort(int[] arr) {
		int pivot = arr[0];
		int stop1 = 0;
		int stop2 = 0; //피봇보다 큰지 작은지 스탑 인덱스
		int tmp = 0; //위치 바꾸기 위한 값
		int i = 1;
		int low; 
		int high;
		      
		do {
			low = arr[i];
			high = arr[arr.length-i];
			
			if(low > pivot) {
				stop1 = i;
			}
			if(high < pivot) {
				stop2 = arr.length-i;
			}
			if(low > pivot && high < pivot) {
				tmp = low;
				low = high;
				high = tmp;
			}
			
			i++;
		}while(low < high);
		
		         
		return arr;
	}
		   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		      
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		      
		      
	   }


}
