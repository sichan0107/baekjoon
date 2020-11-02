package sort;

import java.util.Scanner;

//nlogn 시간복잡도의 알고리즘으로 풀어야함. 퀵,힙 등
public class Boj_2751 {
	public static int[] quickSort(int[] arr, int left, int right) {
		if(left >= right) return arr;
		
		int tmp = partition(arr, left, right);
		if(left < tmp-1) {
			quickSort(arr, left, tmp-1);			
		}
		if(tmp < right) {
			quickSort(arr, tmp+1, right);			
		}
		return arr;
	}
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right) / 2];
		while (left <= right) {

			while (arr[left] < pivot) left++;
			while (arr[right] > pivot) right--;
			if(left <= right) { //arr의 left와 right가 정해지고 left 인덱스가 right보다 작거나 같으면 위치 변경.
				swap(arr, left, right); // 피봇 위치는 찾았음. 여기서 피봇기준으로 두 리스트로 나눠서 재귀호출
				left++; //위치 변경 후 계속 진행하기 위해
				right--;
			}
		}
		return left;
	}
	public static void swap(int[] arr, int left, int right) {
		int tmp = arr[left]; // 5 4 8 7 9 2
		arr[left] = arr[right]; // 5 4
		arr[right] = tmp;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		quickSort(arr, 1, n - 1);

		for (int i : arr) {
			System.out.printf("%d ", i);
		}
	}

}