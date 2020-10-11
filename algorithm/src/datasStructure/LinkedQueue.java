package datasStructure;

import java.util.NoSuchElementException;

//애당초 노드란 주소값의 개념인듯
public class LinkedQueue<T> {
	class Node<T> {
		private T data; //데이터 타입
		private Node<T> next; // 다음 노드 주소
		
		public Node(T data) {
			this.data = data;
		}
	}
	// 큐는 앞뒤로 주소를 알아야 함.
	private Node<T> first;
	private Node<T> last;

	public void add(T item) { // 추가할 값을 하나 받아서
		Node<T> t = new Node<T>(item); // 받은 값으로 노드를 생성
		if(last != null) { // 마지막 노드가 있다면?
			last.next = t; // 그 뒤에 새로 생성한 노드를 붙이고
		} 	
		last = t; //새로 붙인 노드가 큐의 마지막 노드가 됨.
		if(first == null) {
			first = last;
		}
	}
	
	public T remove() {
		if(first == null) {
			 throw new NoSuchElementException(); 
		}
		T data = first.data; // 맨 앞의 노드를 지우기 전에 데이터 백업
		first = first.next; // 맨 앞의 다음 노드를 맨 앞 노드로 
		
		if( first == null) { // 위 두줄의 실행 결과, 맨 앞 노드가 비었으면 last도 null
			last = null;
		}
		return data;
	}
	
	// 맨 앞의 노드를 확인하는 것.
	public T peek() {
		if(first == null) {
			 throw new NoSuchElementException(); 
		}
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}


	public static void main(String[] args) {
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

}