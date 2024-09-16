package com.dp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println("LinkedListStack peek: " + linkedListStack.peek()); 
        System.out.println("LinkedListStack pop: " + linkedListStack.pop());   
        System.out.println("LinkedListStack isEmpty: " + linkedListStack.isEmpty()); 
      
        Stack<String> arrayStack = new ArrayStack<>();
        arrayStack.push("Hello");
        arrayStack.push("World");
        System.out.println("ArrayStack peek: " + arrayStack.peek()); // World
        System.out.println("ArrayStack pop: " + arrayStack.pop());   // World
        System.out.println("ArrayStack isEmpty: " + arrayStack.isEmpty());

	}

}
