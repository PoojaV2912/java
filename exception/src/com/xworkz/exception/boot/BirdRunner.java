package com.xworkz.exception.boot;

import java.util.concurrent.BrokenBarrierException;

import com.xworkz.exception.event.Bird;
import com.xworkz.exception.exceptional.BirdException;

public class BirdRunner {

	public static void main(String[] args) {
System.out.println("invoking main in BirdRunner");
Bird bird = new Bird();
bird.parrot();
try {
	try {
		bird.crow();
	} catch (BirdException e) {
		e.printStackTrace();
	}
	Class.forName("com.just.not.work");
} catch (BrokenBarrierException e) {
	System.out.println("BrokenBarrierException "+e.getMessage());
    e.printStackTrace();
}
catch ( ClassNotFoundException e) {
	System.out.println("ClassNotFoundException "+e.getMessage());
    e.printStackTrace();
}
}
}
	
	
	
	
