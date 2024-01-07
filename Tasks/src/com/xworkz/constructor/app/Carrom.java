package com.xworkz.constructor.app;

public class Carrom {
public String board;
public String pan;

public Carrom()
{
	
	System.out.println("invoking no argument constructor in Carrom");
}
public Carrom(String board){
	this.board=board;
	System.out.println("invoking constructor using String in Carrom");
}
public Carrom(String board,String pan){
	this(board);
	this.pan=pan;
	System.out.println("invoking constructor using String,String in Carrom");
}
@Override
public String toString() {
	return "Carrom [board=" + board + ", pan=" + pan + "]";
}
}