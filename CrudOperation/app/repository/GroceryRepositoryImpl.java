package com.xworkz.app.repository;

public class GroceryRepositoryImpl implements GroceryRepository {
	private  String [] grocery=new  String [TOTAL_ITEMS];
	private int position;
	@Override
	public void save(String grocery) {
		System.out.println("invoking save in GroceryRepositorImpl");
		if(position<TOTAL_ITEMS) {
			this.grocery[position]=grocery;
			System.out.println("items "+grocery +" in position "+this.position);
			this.position++;
		}
		else {
			System.out.println("item is exdes more than list");
		}
	}
	
	}

