package Queues;

public class Queue {

	int capacity, size, front, rear;
	int[] array;
	public Queue(int capacity) {
		this.capacity = capacity;
		this.front = this.size = 0;
		this.rear = capacity-1;
		array = new int[this.capacity];
	}
	
	
	boolean isFull(Queue que) {
		return (que.size == que.capacity);
		
	}
	
	boolean isEmpty(Queue que) {
		return (que.size == 0 );
		
	}
	
	void enqueue(int item) {
		if(isFull(this)) {
			return;
		}
		this.rear = (this.rear + 1)%this.capacity;
		array[this.rear]=item;
		this.size = this.size +1;
		System.out.println("enqueued");
		
	}
	
	int dequeue () {
		if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        int item = this.array[this.front]; 
        this.front = (this.front + 1)%this.capacity; 
        this.size = this.size - 1; 
        return item; 
	}
	
	int front() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        return this.array[this.front]; 
    } 
  
    // Method to get rear of queue 
    int rear() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        return this.array[this.rear]; 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Queue queue = new Queue(1000); 
		  
	        queue.enqueue(10); 
	        queue.enqueue(20); 
	        queue.enqueue(30); 
	        queue.enqueue(40); 
	  
	        System.out.println(queue.dequeue() 
	                           + " dequeued from queue\n"); 
	  
	        System.out.println("Front item is "
	                           + queue.front()); 
	  
	        System.out.println("Rear item is "
	                           + queue.rear()); 
	}

}


