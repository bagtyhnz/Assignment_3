package Assignments.ArithmeticOperators3;

public class Q6 {

	public static void main(String[] args) {
/* 
 * Scientists estimate that roughly 10 grams of caffeine
 * consumed at one time is a lethal overdose.
 * Write a program with a variable that holds the number of milligrams
 * of caffeine in a drink and outputs how many drinks it takes to kill a person.
 */
		double caffeineMg=500;
		
		System.out.println("it would take about "+(int)(10/(caffeineMg/1000))+" drinks for lethal overdose");
		
	}

}
