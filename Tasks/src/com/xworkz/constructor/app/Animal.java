package com.xworkz.constructor.app;

public class Animal {
public void lion() {
	System.out.println("invoking animal in lion");
}
private void tiger() {                                          //using getter & Setter we can acess private
	System.out.println("invoking animal in tigr");
}
protected void dog() {
	System.out.println("invoking animal in dog");
}
void cat() {
	System.out.println("invoking animal in cat");
}
}
