package ppj.git;

/*
 * Program to calculate an employee`s weekly salary
 * 
 */

public class Salary {
	
	static final double MIN_WAGE = 12;  // minimum wage per hour
	static final int NORMAL_WWH = 40;   // normal weekly working hours
	static final int  MAX_WWH = 60;     // maximum weekly working hours
	static final double OVERTIME_BONUS = 1.5; 
	
	public static double calculate(int workedHours) {
		
		if(workedHours <= NORMAL_WWH) {
			return workedHours*MIN_WAGE;
		}
		else if(workedHours > NORMAL_WWH && workedHours <= MAX_WWH) {
			int overtimeHours = workedHours-NORMAL_WWH;
			return MIN_WAGE*NORMAL_WWH + MIN_WAGE*OVERTIME_BONUS*overtimeHours;
		}
		else if(workedHours>MAX_WWH) {
			return MIN_WAGE*NORMAL_WWH + MIN_WAGE*OVERTIME_BONUS*20;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		int workedHours = 60;
		
		System.out.println("Wynagrodzenie wynosi: "
				+ calculate(workedHours) + " PLN/TYG");
	
	}
}
