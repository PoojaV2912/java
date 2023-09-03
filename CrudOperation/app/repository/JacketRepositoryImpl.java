package com.xworkz.app.repository;

public class JacketRepositoryImpl implements JacketRepository {
	private  String [] jacket=new  String [NO_OF_JACKET_COLOUR];
   private int position;
	@Override
	public void jacket(String name) {
		System.out.println("Invoking movie in JacketRepositortImpl");
		if (position < NO_OF_JACKET_COLOUR) {
			this.jacket[position] = name;
			System.out.println("Movie " + name + " at position " + this.position);
			this.position++;
		} else {

			System.err.println("Index is more");
		}
	}
	
}
	


