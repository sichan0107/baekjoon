package datasStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* 힙 : 최댓값이나 최솟값을 빠르게 찾는데 특화된 자료구조 / 중복된 값을 허용하는 힙 트리 (이진 탐색 트리에서는 허용 안 함.)
 * 최소 힙 : 부모 노드의 키 값이 자식 노드의 키 값보다 크거나 같은 완전 이진 트리
 * 
 * 구현 방법
 * 	- 구현에 필요한 가장 기본적인 자료구조는 배열
 *  - 구현을 쉽게 하기 위해 배열의 첫 번째 인덱스인 0은 사용 안 함. (인덱스가 노드 번호인데 1,2,3...으로 부여하려고)
 *  - 특정 위치의 노드 번호는 새로운 노드가 추가되어도 항상 3이다. (예를 들어 루트 노드의 오른쪽 노드의 번호는 항상 3)
 *  - 다음 특성은 부모와 자식의 관계인데 꼭 기억하자. 구현할 때 필요하다.
 *  	- 부모의 인덱스 = 자식의 인덱스 / 2
 *  	- 왼쪽 자식의 인덱스 = 부모 인덱스 * 2
 *  	- 오른쪽 자식의 인덱스 = 부모 인덱스 * 2 + 1
 */

public class Heap {
	
	public static class MinHeap{
		ArrayList<Integer> heap;
		
		public MinHeap() {
			heap = new ArrayList<Integer>();
			heap.add(0);		
		}
		public void insert(int key) {
			heap.add(key); // 새로운 노드를 힙의 마지막 노드에 이어서 삽입
			int p = heap.size() - 1; //힙의 가장 최고 깊이와 최 우측인 부분에 새 노드를 추가한다. -> 완전 이진 트리 유지
			while(p < 1 || heap.get(p) < heap.get(p/2) ) {
				int tmp = heap.get(p);
				heap.set(p, heap.get(p/2));
				heap.set(p/2, tmp);	
				p = p / 2;
			}
		}
		public void delete() {
			
		}
		
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		MinHeap heap = new MinHeap();
		
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            heap.insert(data);
        }
		
		Iterator<Integer> iter = heap.heap.iterator();
		while(iter.hasNext()) {
			int next = iter.next();
			System.out.println(next);
		}
		
	}

}
