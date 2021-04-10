package Assignments.ArithmeticOperators3;

public class Q5 {

	public static void main(String[] args) {
/*
 Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result
 */
		int hours,minutes,seconds, inputSeconds=3695;
		hours=inputSeconds/3600;
		minutes=inputSeconds%3600/60;
		seconds=inputSeconds%3600%60;
		
		System.out.println("input seconds are: " +inputSeconds);
		System.out.println(hours+" hours "+minutes+" minutes and "+seconds+" seconds");
		
		
	}

}
