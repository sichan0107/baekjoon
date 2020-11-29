package datasStructure;

public class ArrayQueue {
	   private int front;
	   private int rear;
	   private int maxSize;
	   private Object[] queue;
	   
	   public ArrayQueue(int size) {
	      this.front = 0;
	      this.rear = -1;
	      this.maxSize = size;
	      this.queue = new Object[maxSize];
	   }
	   
	   public void enqueue(Object data) {
	      if(isfull()) {
	         System.out.println("큐가 가득참");
	      }
	      else {
	         rear += 1;
	         queue[rear] = data;         
	      }
	   }
	   
	   public Object dequeue() {
	      if(isEmpty()) return null;
	      
	      front += 1;
	      return queue[front++];         
	   }
	   
	   public boolean isEmpty() {
	      if(front > rear) return true;
	      else return false;
	   }
	   
	   public boolean isfull() {
	      if(rear == maxSize-1) return true;
	      else return false;
	   }
	   
	   public Object peek() {
	      if(isEmpty()) return null;
	      
	      return queue[front];
	   }
	   
	   public static void main(String[] args) {

	   }

	}