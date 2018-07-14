import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
String number=	JOptionPane.showInputDialog("Give me a number.");
int prime= Integer.parseInt(number);
for (int i = 2; i < prime; i++) {
	if (prime%i==0){
		JOptionPane.showMessageDialog(null, "Not a prime!!!!!!!");
		System.exit(0);}
}
	JOptionPane.showMessageDialog(null, "Its a prime number!!!!!!!!!!");
	System.exit(0);
}
}


