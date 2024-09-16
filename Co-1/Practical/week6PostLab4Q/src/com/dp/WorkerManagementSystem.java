package com.dp;

public class WorkerManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker robotWorker = new Robot();
        Worker humanWorker = new Human();
        Eater humanEater = (Human) humanWorker; 
        robotWorker.work();
        
       
        humanWorker.work();
        humanEater.eat();

	}

}
