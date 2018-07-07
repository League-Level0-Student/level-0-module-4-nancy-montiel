

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String number=JOptionPane.showInputDialog("Give me a number.");
String integer= JOptionPane.showInputDialog("Give me a number.");
Integer.parseInt(number);
Integer.parseInt(integer);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
				int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
   System.out.println();
   if 
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
public static void Add (int number, int integer) {
	System.out.println(number+integer);
	
	
}
	// 4. Create similar methods for subtraction, multiplication and division.


public static void Subtract(int number, int integer) {
	System.out.println(number+integer);
}
public static void Multiply(int number, int integer) {
	System.out.println(number+integer);
}
public static void Divide(int number, int integer) {
	System.out.println(number+integer);
}
}
