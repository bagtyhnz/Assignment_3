package Assignments.ArithmeticOperators3;

public class Q7 {

	public static void main(String[] args) {
/*
 * Write a program that determines the change to be dispensed from a vending machine.
 * An item in the machine can cost between 25 cents and 1 dollar,
 * in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
 * and the machine accepts only a single dollar bill to pay for the item.
 */
		
		int priceCents, quarters, dimes, nickles, change;
		
		priceCents=95;
		change=100-priceCents;
		quarters=change/25;
		dimes=change%25/10;
		nickles=change%25%10/5;
		System.out.println("your change is "+quarters+" quarters, "+dimes+" dimes and "+nickles+" nickels");
		
	}

}
