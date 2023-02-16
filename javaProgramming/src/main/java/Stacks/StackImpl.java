package Stacks;

import java.util.ArrayList;

public class StackImpl<T> {

	ArrayList<T> al;
	int top =-1;
	int size;
	StackImpl(int size){
		this.size = size;
		this.al = new ArrayList<T>(size);
	}
	
	void push(T X) {
		if(top+1 == size) {
			System.out.println("stack overflow !!");
		}
		else {
			top = top +1;
			if(al.size()>top) {
				al.set(top, X);
			}
			else {
				al.add(X);
			}
		}
	}
	
	T top() {
		if(top ==-1) {
			return null;
		}else {
			return al.get(top);
		}
	}
	
	void pop()
    {
        // If stack is empty
        if (top == -1) {
 
            // Display message when there are no elements in
            // the stack
            System.out.println("Stack Underflow");
        }
 
        else
 
            // Delete the last element
            // by decrementing the top
            top--;
    }
	
	boolean empty() { return top == -1; }
	 
    // Method 5
    // To print the stack
    // @Override
    public String toString()
    {
 
        String Ans = "";
 
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(al.get(i)) + "->";
        }
 
        Ans += String.valueOf(al.get(top));
 
        return Ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImpl<Integer> s1 = new StackImpl<>(3);
		 
        // Pushing elements to integer stack - s1
 
        // Element 1 - 10
        s1.push(10);
        // Element 2 - 20
        s1.push(20);
        // Element 3 - 30
        s1.push(30);
 
        // Print the stack elements after pushing the
        // elements
        System.out.println(
            "s1 after pushing 10, 20 and 30 :\n" + s1);
 
        // Now, pop from stack s1
        s1.pop();
 
        // Print the stack elements after poping few
        // element/s
        System.out.println("s1 after pop :\n" + s1);
 	
	}

}
