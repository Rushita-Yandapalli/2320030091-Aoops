package com.dp;

public class LinkedListStack<T> implements Stack<T> {
    private Node<T> top;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }




	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		top = new Node<>(element, top);
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        return data;
		
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }
	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		 return top == null;
	
	}
}