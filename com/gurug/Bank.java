package com.gurug;

public interface Bank {
	void deposit();
	void withdraw();
    void balance();
    void loan();
}
class ServiceProvider implements Bank{
	public void deposit() {
		System.out.println("balance="+100);
	}
	public void withdraw() {
		System.out.println("withdrawal amount="+50);
	}
	public void balance() {
		System.out.println("balance="+50);
	}
	public void loan() {
		System.out.println("loan needed= "+50000);
	}
}
class Childclass extends ServiceProvider{
	public void loan() {
		System.out.println("loan needed= "+1232520000);
	}
}

