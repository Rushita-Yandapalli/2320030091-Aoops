package com.dp;

public class ArrayStack<T> implements Stack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public ArrayStack() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    

}

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		if (size == array.length) {
            resize();
        }
        array[size++] = element;
    }

	

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        @SuppressWarnings("unchecked")
		T element = (T) array[--size];
        array[size] = null; // Prevent memory leak
        return element;
    }

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) array[size - 1];
    }

   
    
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;	
		}
	private void resize() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
