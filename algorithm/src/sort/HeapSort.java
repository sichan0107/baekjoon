package sort;

public class HeapSort {
	// 배열을 최대힙으로 구성 (배열, 시작인덱스, 사이즈)
	// 루트노드부터 차례대로 내려가면서 배열을 최대힙으로 구성 (내림차순)
	public static void maxHeapify(int[] array, int start, int size) {
		int left = start * 2 + 1;
		int right = start * 2 + 2;
		int max = start; //우선 시작점인 루트노드 값을 최대값으로 지정 
		
		// --- 왼쪽, 오른쪽 자식 노드 모두 부모보다 큰지 판별, 둘다 클 경우 오른쪽 자식과 부모를 스왑함.
		if(left < size && array[left] > array[max]) {
			max = left;
		}
		if(right < size && array[right] > array[max]) {
			max = right;
		}
		if(max != start) {
			swap(array, max, start);
			maxHeapify(array, max, size);
		}
		
	}
	
	// 배열을 최소힙으로 구성
	public static void minHeapify(int[] array, int start, int size) {
		int left = start * 2 + 1;
		int right = start * 2 + 2;
		int min = start; //힙구성이 시작되는 부모노드
		
		if(left < size && array[left] < array[min]) {
			min = left;
		}
		if(right < size && array[right] < array[min]) {
			min = right;
		}
		if(min != start) {
			swap(array, min, start);
			minHeapify(array, min, size);
		}
		
	}
	
	//힙 구성은 자식노드를 가진 부모노드들만 수행한다. 맨마지막 부모부터 수행하며 상위 부모로 올라간다.
	public static void buildMaxHeap(int[] array, int size) {
		//size = 맨 마지막 노드의 부모노드 위치, 여기부터 위로 올라가며 시작
		for(int i = size / 2 - 1; i>=0; i--) {
			maxHeapify(array, i, size);
		}
	}
	
	public static void buildMinHeap(int[] array, int size) {
		for(int i = size / 2 - 1; i>=0; i--) {
			minHeapify(array, i, size);
		}
	}
	
	// 루트노드와 마지막노드를 스왑
	public static void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
	
	public static void maxHeapSort(int[] array, int size) {
		buildMaxHeap(array, size);
		for(int lastNode = size - 1; lastNode >=0; lastNode--) {
			swap(array, 0, lastNode);
			maxHeapify(array, 0, lastNode);
		}
	}
	
	public static void minHeapSort(int[] array, int size) {
		//1. buildMinHeap으로 배열을 힙으로 구성 & 최소힙으로 만들어준다.
		//2. 마지막 노드와 루트노드를 스왑 
		//3. 스왑을 통해 루트(최소값)는 빠져나가고 올라간 마지막노드값을 다시 최소힙을 구성해 위치를 찾는다.
		buildMinHeap(array, size);
		for(int lastNode = size - 1; lastNode >= 0; lastNode--) {
			swap(array, 0, lastNode); // 루트노드와 마지막노드 스왑 (최소값 추출)
			minHeapify(array, 0, lastNode); //lastNode = heap size - 1
		}
	}
	
	public static void main(String[] args) {
		//int[] array = {200, 11, 60, 550, 23, 220, 20};
		int[] array = {200, 11, 60, 550, 23, 20, 20}; //중복값 허용 실험
		
		maxHeapSort(array, array.length); // 최대힙은 오름차순 정렬
		//minHeapSort(array, array.length);
		for(int i : array) {
			System.out.println(i);
		}
	}

}
